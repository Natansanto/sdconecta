package br.com.sdconecta.infrastructure.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiBuscaPerfilGitHubResponseDTO {

	private String name;
	private String email;
	private String avatar_url;
	private String company;
	private String location;
	private String bio;
	private String repos_url;
	private String html_url;
}
