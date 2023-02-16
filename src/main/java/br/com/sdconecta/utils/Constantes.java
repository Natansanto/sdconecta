package br.com.sdconecta.utils;

public class Constantes {

	private Constantes() {
	}

	public static final String BASE_PATH_PERFIL = "api/v1/perfil";

	public static final String AUTHORIZATION_HEADER = org.springframework.http.HttpHeaders.AUTHORIZATION;
	public static final String AUTHORIZATION_HEADER_DESC = "Token de autorização";

	// HTTP status codes
	public static final String OK = "OK";
	public static final String NO_CONTENT = "No Content, o servidor executou com sucesso o método, mas não há nenhum corpo de entidade para retornar.";
	public static final String CREATED = "Requisição foi bem sucedida e um novo recurso foi criado.";
	public static final String UNPROCESSABLE_ENTITY = "Erro de negócio, não foi possível processar as instruções presentes.";
	public static final String INTERNAL_SERVER_ERROR = "Erro interno, algo inesperado deu errado no servidor.";
	public static final String UNAUTHORIZED = "Acesso não autorizado.";
	public static final String BAD_REQUEST = "Dados da requisição inválida.";
	public static final String NOT_FOUND = "Recurso não está disponível.";

	// ApiBuscaPerfilGitHubService
	public static final String PERFIL_NAO_ENCONTRADO = "Perfil não encontrado: %s";

	//PerfilService
	public static final String ERRO_AO_BUSCAR_PERFIL = "Erro ao buscar perfil: %s";
}
