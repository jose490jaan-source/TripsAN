package com.trips.models;

public class Perfil {
	
	private Integer id;
	private String nomPerfil;
	private String descripcion;
	private boolean activo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomCategoria() {
		return nomPerfil;
	}
	public void setNomCategoria(String nomCategoria) {
		this.nomPerfil = nomCategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	

}
