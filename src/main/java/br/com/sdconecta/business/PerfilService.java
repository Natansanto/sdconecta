package br.com.sdconecta.business;


import br.com.sdconecta.ap1.v1.dto.PerfilDTO;
import br.com.sdconecta.business.converters.PerfilConverter;
import br.com.sdconecta.exception.InternalServerException;
import br.com.sdconecta.infrastructure.client.dto.ApiBuscaPerfilGitHubResponseDTO;
import br.com.sdconecta.infrastructure.repository.PerfilRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static br.com.sdconecta.utils.Constantes.ERRO_AO_BUSCAR_PERFIL;
import static java.lang.String.format;
@Slf4j
@AllArgsConstructor
@Service
public class PerfilService {

	private final ApiBuscaPerfilGitHubService apiBuscaPerfilGitHubService;
	private final PerfilConverter converter;
	private PerfilRepository repository;

	@Transactional
	public PerfilDTO buscar(String nome) {
		try {
			ApiBuscaPerfilGitHubResponseDTO dtoPerfil = apiBuscaPerfilGitHubService.consultarNome(nome);
			repository.save(converter.paraEntidadePerfil(dtoPerfil));

		    return converter.paraPerfilDTO(dtoPerfil);
		} catch (InternalServerException  e) {
			log.error(
					format(ERRO_AO_BUSCAR_PERFIL, e.getMessage()), e
			);
			throw new InternalServerException(
					format(ERRO_AO_BUSCAR_PERFIL, e.getMessage())
			);	
		}	
	}
}