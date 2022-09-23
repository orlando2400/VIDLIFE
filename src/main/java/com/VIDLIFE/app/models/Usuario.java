package com.VIDLIFE.app.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "asegurado")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    @Getter @Setter
    private long ID;

    @Column(name = "nombres")
    @Getter @Setter
    private String nombres;

    @Column(name = "apellidos")
    @Getter @Setter
    private String apellidos;

    @Column(name = "correo")
    @Getter @Setter
    private String correo;

    @Column(name = "telefono")
    @Getter @Setter
    private int telefono;

    @Column(name = "dni")
    @Getter @Setter
    private int dni;

    @Column(name = "direccion")
    @Getter @Setter
    private String direccion;

    @Column(name = "password")
    @Getter @Setter
    private String password;

}
