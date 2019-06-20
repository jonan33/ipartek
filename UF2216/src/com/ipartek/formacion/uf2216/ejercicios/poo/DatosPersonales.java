package com.ipartek.formacion.uf2216.ejercicios.poo;

public class DatosPersonales {
	private String nombre;
	private String duenyo;
	
	public DatosPersonales(String nombre, String duenyo) {
		super();
		this.nombre = nombre;
		this.duenyo = duenyo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuenyo() {
		return duenyo;
	}

	public void setDuenyo(String duenyo) {
		this.duenyo = duenyo;
	}
	

}
