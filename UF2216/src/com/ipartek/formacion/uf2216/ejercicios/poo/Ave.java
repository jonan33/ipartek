package com.ipartek.formacion.uf2216.ejercicios.poo;

public abstract class Ave {

	private char sexo;
	private int edad;
	public static int avesCreadas;
	
	public Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		setNumeroAves(1);
	}
	
	public int Creadas() {
		return Ave.avesCreadas;
	}
	
	public void quienSoy() {
		System.out.println("Mi sexo es " + sexo + " y tengo " + edad);
	}
	
	public void setNumeroAves(int i) {
		Ave.avesCreadas += i;
	}
	
	public abstract void Cantar();
}
