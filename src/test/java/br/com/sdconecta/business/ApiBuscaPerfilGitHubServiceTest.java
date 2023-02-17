package br.com.sdconecta.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static br.com.sdconecta.testUtils.MockUtils.NOME;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ApiBuscaPerfilGitHubServiceTest {

    @InjectMocks
    ApiBuscaPerfilGitHubService gitHubService;

    @Test(expected = Exception.class)
    public void deveRetornarExceptionAoBuscarPerfil() {

        when(gitHubService.consultarNome(NOME)).thenThrow(Exception.class);

        verify(gitHubService, times(0));
    }
}
