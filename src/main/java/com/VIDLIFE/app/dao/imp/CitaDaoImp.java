package com.VIDLIFE.app.dao.imp;


import com.VIDLIFE.app.dao.CitaDao;
import com.VIDLIFE.app.models.Cita;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Component
public class CitaDaoImp implements CitaDao {

    @PersistenceContext
    EntityManager entityManager;
    public void reservar (Cita cita){
        entityManager.merge(cita);
    }

}
