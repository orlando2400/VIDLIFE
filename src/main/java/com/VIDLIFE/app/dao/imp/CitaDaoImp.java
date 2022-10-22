package com.VIDLIFE.app.dao.imp;


import com.VIDLIFE.app.dao.CitaDao;
import com.VIDLIFE.app.models.Cita;
import com.VIDLIFE.app.models.Doctor;
import com.VIDLIFE.app.models.Especialidad;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Component
public class CitaDaoImp implements CitaDao{
	
    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    @Transactional
	public List<Especialidad> listarEspecialidad() {
    	String query = "FROM Especialidad";
        return entityManager.createQuery(query).getResultList();
	}

    public void reservar (Cita cita){
        entityManager.merge(cita);
    }

	@Override
	public List<Doctor> listarDoctor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
