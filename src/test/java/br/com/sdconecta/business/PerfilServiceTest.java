package br.com.sdconecta.business;

import br.com.sdconecta.business.converters.PerfilConverter;
import br.com.sdconecta.exception.InternalServerException;
import br.com.sdconecta.infrastructure.repository.PerfilRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static br.com.sdconecta.testUtils.MockUtils.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PerfilServiceTest {

    @InjectMocks
    PerfilService service;

    @Mock
    ApiBuscaPerfilGitHubService gitHubService;

    @Mock
    PerfilRepository repository;

    @Spy
    PerfilConverter converter;

    @Test
    public void deveBuscarEhSalvarPerfil() {

        when(gitHubService.consultarNome(NOME)).thenReturn((buildPerfilGitHub()));

        when(repository.save(buildPerfil())).thenReturn(buildPerfil());

        service.buscar(NOME);

        verify(repository, times(1)).save(buildPerfil());
    }

    @Test(expected = InternalServerException.class)
    public void deveRetornarExceptionAoSalvarEhBuscarPerfil() {

        when(gitHubService.consultarNome(NOME)).thenReturn((buildPerfilGitHub()));

        when(repository.save(buildPerfil())).thenThrow(InternalServerException.class);

        service.buscar(NOME);

        verify(repository, times(0)).save(buildPerfil());
    }
}
