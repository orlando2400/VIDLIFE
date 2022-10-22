package com.VIDLIFE.app.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.VIDLIFE.app.models.Cita;
import com.VIDLIFE.app.models.Doctor;
import com.VIDLIFE.app.models.Especialidad;

public interface CitaDao{
	public List<Especialidad> listarEspecialidad();
	public List<Doctor>listarDoctor();
    void reservar(Cita cita);
}
