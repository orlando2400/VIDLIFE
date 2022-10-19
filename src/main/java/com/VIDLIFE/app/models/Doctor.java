package com.VIDLIFE.app.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombres",nullable = false)
    private String nombres;
    @Column(name = "apellidoPaterno",nullable = false)
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno",nullable = false)
    private String apellidoMaterno;
    @Column(name = "password",nullable = false)
    private String password;
    @OneToMany(mappedBy = "doctor")
    private List<Cita> citas;
    @OneToMany(mappedBy = "doctor")
    private List<Especialidad> especialidad;
}
