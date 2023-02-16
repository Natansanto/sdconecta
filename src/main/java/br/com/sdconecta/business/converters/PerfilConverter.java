package br.com.sdconecta.business.converters;

import br.com.sdconecta.ap1.v1.dto.DadosUsuarioDTO;
import br.com.sdconecta.ap1.v1.dto.PerfilDTO;
import br.com.sdconecta.infrastructure.client.dto.ApiBuscaPerfilGitHubResponseDTO;
import br.com.sdconecta.infrastructure.entity.PerfilEntity;
import org.springframework.stereotype.Component;

@Component
public class PerfilConverter {

	public PerfilDTO paraPerfilDTO(ApiBuscaPerfilGitHubResponseDTO dtoPerfil) {
		
		return PerfilDTO.builder()
				.perfil(DadosUsuarioDTO.builder()
				.email(dtoPerfil.getEmail())
				.nome(dtoPerfil.getName())
				.bio(dtoPerfil.getBio())
				.empresa(dtoPerfil.getCompany())
				.foto_url(dtoPerfil.getAvatar_url())
				.localizacao(dtoPerfil.getLocation())
				.repositorios(dtoPerfil.getRepos_url())
				.link_perfil(dtoPerfil.getHtml_url())
				.build())
				.build();
	}
	
    public PerfilEntity paraEntidadePerfil(ApiBuscaPerfilGitHubResponseDTO dtoPerfil) {
	        return PerfilEntity.builder()
	        		.email(dtoPerfil.getEmail())
					.nome(dtoPerfil.getName())
					.bio(dtoPerfil.getBio())
					.empresa(dtoPerfil.getCompany())
					.foto_url(dtoPerfil.getAvatar_url())
					.localizacao(dtoPerfil.getLocation())
					.repositorios(dtoPerfil.getRepos_url())
					.link_perfil(dtoPerfil.getHtml_url())
	                .build();
	     }
}