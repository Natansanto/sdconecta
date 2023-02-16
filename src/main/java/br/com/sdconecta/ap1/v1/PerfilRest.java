package br.com.sdconecta.ap1.v1;

import static br.com.sdconecta.utils.Constantes.*;

import br.com.sdconecta.ap1.v1.dto.PerfilDTO;
import br.com.sdconecta.business.PerfilService;
import br.com.sdconecta.utils.Constantes;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = BASE_PATH_PERFIL)
public class PerfilRest {

    private final PerfilService service;

    public PerfilRest(PerfilService service) {
        this.service = service;
    }
    
    @ApiOperation(value = "Busca dados do perfil", response = PerfilDTO.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = Constantes.AUTHORIZATION_HEADER, required = true, dataType = "string", paramType = "header", value = Constantes.AUTHORIZATION_HEADER_DESC),
  
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = OK),
            @ApiResponse(code = 400, message = BAD_REQUEST),
            @ApiResponse(code = 401, message = UNAUTHORIZED),
            @ApiResponse(code = 500, message = INTERNAL_SERVER_ERROR)
    })
    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PerfilDTO> buscar(
    		 @RequestParam(value = "nome") String nome		
    ){
        return ResponseEntity.ok(service.buscar(nome));
    }

}
