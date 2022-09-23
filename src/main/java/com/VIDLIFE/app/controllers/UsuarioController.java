package com.VIDLIFE.app.controllers;
import com.VIDLIFE.app.dao.UsuarioDao;
import com.VIDLIFE.app.models.Usuario;
import com.VIDLIFE.app.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    /* @RequestMapping(value = "api/asegurado" ,method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){

    }*/

    @RequestMapping(value = "api/asegurado" ,method = RequestMethod.POST)

    public void registrar(@RequestBody Usuario usuario){

        usuarioService.registrar(usuario);
    }

}
