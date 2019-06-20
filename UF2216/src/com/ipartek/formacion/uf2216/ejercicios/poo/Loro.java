package com.ipartek.formacion.uf2216.ejercicios.poo;

public class Loro extends Ave{
	
	
	private char region;
	private String color;
	
	public Loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
	}
	
	public void deDondeEres() {
		if (region == "N".charAt(0)) {
			System.out.println("Norte");
		} else if (region == "O".charAt(0)) {
			System.out.println("Oeste");
		} else if (region == "S".charAt(0)) {
			System.out.println("Sur");
		} else {
			System.out.println("Este");
		}
	}

}
