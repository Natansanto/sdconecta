package br.com.sdconecta.ap1.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DadosUsuarioDTO {

	private String nome;
	private String link_perfil;
	private String email;
	private String foto_url;
	private String empresa;
	private String localizacao;
	private String bio;
	private String repositorios;
}
