
#  Microsserviço

Link local: http://localhost:8080/swagger-ui.html

![image](https://user-images.githubusercontent.com/37228699/219452575-a6dcc970-11d2-46d9-9570-18822f4e595f.png)


# Considerações:

* O parâmetro (header) **Token de autorização** pode ser qualquer número, exemplo 10.
* Foi utilizado o **banco de dados PostgreSQL** ajustem apenas as configurações de usuario e senha de acordo com a  conf de vocês 
* Foi utilizado o IntelliJ IDEA para desenvolver o **Microsseviço**
* O mesmo é um projeto **maven** 
* Foi foi a **integração com a API** do GitHub para busca os dados do perfil
* Foi feito alguns **testes unitarios** 
* Foi utilizado **Java 8** 
* Foi utilizado **Spring boot** 
* Foi utilizado **jUnit** 
* Foi utilizado **lombok** 
* Foi utilizado **FeignClient**
* Foi utilizado **swagger**

# Exemplo de algumas validações: 

![image](https://user-images.githubusercontent.com/37228699/219453237-0377cee4-e1b7-4c5c-ac87-8350f587b5e9.png)
![image](https://user-images.githubusercontent.com/37228699/219455967-37742ce7-fdf2-4efe-a073-577ccb5295f0.png)



# Estruta base do projeto:

![image](https://user-images.githubusercontent.com/37228699/219453794-dd111334-9598-4cf8-acc4-2a7b49243abb.png)


```
sdconecta-app
sdconecta-impl
	src/main/java
		/br/com/sdconecta
				api.v1
					DTOs
					Rest	
				business
					Converters
					PerfilService
				infrastructure
					Client
					Entity
					Enums
					Repository
					Config
		resources/db/migration
			V2__CREATE_TABLE
```

