package com.VIDLIFE.app.dao.imp;


import com.VIDLIFE.app.dao.CitaDao;
import com.VIDLIFE.app.models.Cita;
import com.VIDLIFE.app.models.Doctor;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Component
public class CitaDaoImp implements CitaDao {
	
	
	
    @PersistenceContext
    EntityManager entityManager;
    
    private List<Doctor> doctores = new ArrayList<Doctor>();
    public List<Doctor>traerNombreDoctor(){
    	
    	return doctores;
    }
    public void reservar (Cita cita){
        entityManager.merge(cita);
    }

}
