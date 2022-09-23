package com.VIDLIFE.app.dao.imp;

import com.VIDLIFE.app.dao.UsuarioDao;
import com.VIDLIFE.app.models.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Component
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void registrar(Usuario usuario){
        entityManager.merge(usuario);

    }
}
