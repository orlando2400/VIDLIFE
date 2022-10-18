package com.VIDLIFE.app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String contrasena;

}
