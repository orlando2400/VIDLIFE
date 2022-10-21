package com.VIDLIFE.app.dao;


import java.util.List;

import com.VIDLIFE.app.models.Cita;
import com.VIDLIFE.app.models.Doctor;

public interface CitaDao {
	List<Doctor>traerNombreDoctor();
    void reservar(Cita cita);
}
