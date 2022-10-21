package com.VIDLIFE.app.controllers;
import com.VIDLIFE.app.models.Usuario;
import com.VIDLIFE.app.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class UsuarioController {
	
    
    private final UsuarioService usuarioService;
    
    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}


	/* @RequestMapping(value = "api/asegurado" ,method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){

    }*/
    @PostMapping(value = "/registrar")
    public ResponseEntity<String> registrar(@Valid @RequestBody Usuario usuario,BindingResult result){
    	
    	Usuario user = new Usuario(); 
    	user.setNombres(usuario.getNombres());
    	user.setApellidos(usuario.getApellidos());
    	user.setCorreo(usuario.getCorreo());
    	user.setTelefono(usuario.getTelefono());
    	user.setDni(usuario.getDni());
    	user.setDireccion(usuario.getDireccion());
    	user.setPassword(usuario.getPassword());
    	
    	 	
        this.usuarioService.registrar(usuario);
        return new ResponseEntity<>(("Usuario creado"),HttpStatus.OK);
    }

}
