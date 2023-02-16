package br.com.sdconecta.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "perfil")
public class PerfilEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "link_perfil")
	private String link_perfil;

	@Column(name = "email")
	private String email;

	@Column(name = "foto_url")
	private String foto_url;

	@Column(name = "empresa")
	private String empresa;

	@Column(name = "localizacao")
	private String localizacao;

	@Column(name = "bio")
	private String bio;

	@Column(name = "repositorios")
	private String repositorios;

	@Column(name = "data_hora_inclusao")
	private LocalDateTime dataHoraInclusao;

	@PrePersist
	public void prePersist() {
		this.dataHoraInclusao = LocalDateTime.now();
	}
}
