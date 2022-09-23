package com.VIDLIFE.app.services;

import com.VIDLIFE.app.dao.UsuarioDao;
import com.VIDLIFE.app.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    public void registrar(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }
}
