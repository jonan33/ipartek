package com.ipartek.formacion.uf2216.ejercicios.poo;

public abstract class Canario extends Ave{
	
	public double tamanyo;
	
	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}
	
	public Canario(char sexo, int edad, double tamanyo) {
		super(sexo, edad);
		this.tamanyo= tamanyo;
	}
	
	public void altura() {
		if (tamanyo > 30) {
			System.out.println("Alto");
		} else if (tamanyo < 15) {
			System.out.println("Bajo");
		} else {
			System.out.println("Mediano");
		}
	}

	public double getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(double tamanyo) {
		this.tamanyo = tamanyo;
	}
	
	

}
