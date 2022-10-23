package com.VIDLIFE.app.controllers;

import com.VIDLIFE.app.dao.CitaDao;
import com.VIDLIFE.app.models.Cita;
import com.VIDLIFE.app.models.Doctor;
import com.VIDLIFE.app.models.Especialidad;
import com.VIDLIFE.app.services.CitaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CitaController {

    @Autowired
    private CitaService citaService;
    @Autowired
    private CitaDao citaDao;
    @GetMapping("api/especialidades")
    public List<Especialidad>listarEspecialidad(){
    	return citaDao.listarEspecialidad();
    }
    @GetMapping("api/doctores")
    public List<Doctor> listarDoctor() {
    	return citaDao.listarDoctor();
    }
    @PostMapping("api/registrarCita")
    public void registrar(@RequestBody Cita cita){
    	citaDao.reservar(cita);
    }
}
