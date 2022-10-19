package com.VIDLIFE.app.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Future;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter @Setter
@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "codigo", nullable = false)
    private int codigo;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Future
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaCita;
    @Column(name = "turno", nullable = false)
    private String turno;
    @ManyToOne
    @JoinColumn(name = "fk_usuario", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "fk_doctor", nullable = false)
    private Doctor doctor;
}
