package com.VIDLIFE.app.services;

import com.VIDLIFE.app.dao.CitaDao;
import com.VIDLIFE.app.models.Cita;
import com.VIDLIFE.app.models.Doctor;
import com.VIDLIFE.app.models.Especialidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class CitaService {
    @Autowired
    private CitaDao citaDao;
    
    public List<Especialidad>listarEspecialidad(){
    	return citaDao.listarEspecialidad();
    }
    
    /*public List<Doctor>listarDoctor() {
    	citaDao.
    }*/
    
    public void reservar(@RequestBody Cita cita){
        citaDao.reservar(cita);
    }

}
