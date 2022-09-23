package com.VIDLIFE.app.dao;

import com.VIDLIFE.app.models.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface UsuarioDao {

    void registrar(Usuario usuario);
}
