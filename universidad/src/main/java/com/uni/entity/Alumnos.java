package com.uni.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor

public class Alumnos implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String sexo;
	private String curso;
	private String grado;
	private String anyo_inicio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getAnyo_inicio() {
		return anyo_inicio;
	}
	public void setAnyo_inicio(String anyo_inicio) {
		this.anyo_inicio = anyo_inicio;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
