package com.VIDLIFE.app.services;

import com.VIDLIFE.app.dao.CitaDao;
import com.VIDLIFE.app.models.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

@Service
public class CitaService {
    @Autowired
    private CitaDao citaDao;
    
    public void traerDoctores() {
    	citaDao.
    }
    
    public void reservar(@RequestBody Cita cita){
        citaDao.reservar(cita);
    }

}
