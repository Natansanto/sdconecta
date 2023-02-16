package br.com.sdconecta.infrastructure.client;

import br.com.sdconecta.infrastructure.client.dto.ApiBuscaPerfilGitHubResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
		name = "validacpf",
		url= "https://api.github.com/users/" 	
)
public interface ApiBuscaPerfilGitHubClient {
	
	@GetMapping("{nome}")
	ApiBuscaPerfilGitHubResponseDTO consultar(@PathVariable("nome") String nome);
}
