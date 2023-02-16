package br.com.sdconecta.business;


import static br.com.sdconecta.utils.Constantes.PERFIL_NAO_ENCONTRADO;
import static java.lang.String.format;

import br.com.sdconecta.exception.NotFoundException;
import br.com.sdconecta.infrastructure.client.ApiBuscaPerfilGitHubClient;
import br.com.sdconecta.infrastructure.client.dto.ApiBuscaPerfilGitHubResponseDTO;
import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service
public class ApiBuscaPerfilGitHubService {

	private final ApiBuscaPerfilGitHubClient client;

	public ApiBuscaPerfilGitHubResponseDTO consultarNome(String nome)  {
		try {
			return client.consultar(nome);
		} catch (Exception e) {
			log.error(
					format(PERFIL_NAO_ENCONTRADO, nome)
			);
			throw new NotFoundException(
					format(PERFIL_NAO_ENCONTRADO, nome)
			);	
		}	
	}
}
