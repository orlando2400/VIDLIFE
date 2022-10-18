package com.VIDLIFE.app.controllers;

import com.VIDLIFE.app.models.Cita;
import com.VIDLIFE.app.services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CitaController {

    @Autowired
    private CitaService citaService;

    @RequestMapping(value = "/cita",method = RequestMethod.POST)
    public void registrar(@RequestBody Cita cita){
        citaService.reservar(cita);
    }
}
