package br.com.sdconecta.testUtils;

import br.com.sdconecta.infrastructure.client.dto.ApiBuscaPerfilGitHubResponseDTO;
import br.com.sdconecta.infrastructure.entity.PerfilEntity;

import java.time.LocalDateTime;

public class MockUtils {
    public static final long ID = 1L;
    public static final String NOME = "Natan";
    public static final LocalDateTime DATA_HORA_INCLUSAO = LocalDateTime.of(2022, 9, 12, 9, 9, 10);

    public static PerfilEntity buildPerfil() {

        return PerfilEntity.builder()
                .nome(NOME)
                .bio("teste")
                .foto_url("teste")
                .empresa("teste")
                .link_perfil("teste")
                .email("teste")
                .localizacao("teste")
                .repositorios("teste")
                .build();

    }

    public static ApiBuscaPerfilGitHubResponseDTO buildPerfilGitHub(){

        return ApiBuscaPerfilGitHubResponseDTO.builder()
                .name(NOME)
                .bio("teste")
                .avatar_url("teste")
                .company("teste")
                .repos_url("teste")
                .email("teste")
                .location("teste")
                .html_url("teste")
                .build();
    }
}
