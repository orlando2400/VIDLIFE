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
    private int id;
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
    @OneToOne
    @JoinColumn(name = "fk_especialidad", nullable = false)
    private Especialidad especialidad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Cita> getCitas() {
		return citas;
	}
	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
    
    
}
