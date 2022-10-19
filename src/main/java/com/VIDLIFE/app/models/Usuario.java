package com.VIDLIFE.app.models;



import lombok.Data;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "asegurado")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int ID;

    @Column(name = "nombres", nullable = false)
    @NotNull
    @NotBlank
    private String nombres;

    @Column(name = "apellidos", nullable = false)
    @NotNull
    @NotBlank
    private String apellidos;

    @Column(name = "correo", nullable = false)
    @NotNull
    @NotBlank
    @Email
    private String correo;

    @Column(name = "telefono", nullable = false, length = 9)
    @NotNull
    private Integer telefono;

    @Column(name = "dni", nullable = false, length = 8)
    @NotNull
    private Integer dni;

    @Column(name = "direccion", nullable = false)
    @NotNull
    @NotBlank
    private String direccion;

    @Column(name = "password", nullable = false)
    @NotNull
    @NotBlank
    private String password;
    
    @OneToMany(mappedBy = "usuario")
    private List<Cita> citas;
    
	public Usuario() {
		
	}


	public Usuario(int iD, @NotNull @NotBlank String nombres, @NotNull @NotBlank String apellidos,
			@NotNull @NotBlank @Email String correo, @NotNull Integer telefono, @NotNull Integer dni,
			@NotNull @NotBlank String direccion, @NotNull @NotBlank String password) {
		super();
		ID = iD;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.telefono = telefono;
		this.dni = dni;
		this.direccion = direccion;
		this.password = password;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
    

	
    
	        
}
