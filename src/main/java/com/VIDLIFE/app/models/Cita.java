package com.VIDLIFE.app.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Future;

import java.util.Date;

@Getter @Setter
@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int codigo;
    private String apellido;
    @ManyToOne
    @JoinColumn(name = "fk_especialidad", nullable = false)
    private Especialidad especialidad;
    @ManyToOne
    @JoinColumn(name = "fk_doctor", nullable = false)
    private Doctor doctor;
    @Future
    private Date fechaCita;

}
