package com.ipartek.formacion.uf2216.ejercicios.poo;

public class Piolin extends Canario{

	public static void main(String[] args) {
		Piolin piolin1 = new Piolin('H', 5, 12);
		Loro loro1 = new Loro('M', 4, "E".charAt(0), "Rojo");
		
		piolin1.quienSoy();
		loro1.quienSoy();
		piolin1.altura();
		loro1.deDondeEres();
		
		piolin1.setTamanyo(55);
		piolin1.altura();
		
		System.out.println("Hay " + loro1.Creadas() + " aves creadas");

	}
	
	private char sexo;
	private int edad;
	private int peliculas;
	
	
	public Piolin(char sexo, int edad, int peliculas) {
		super(sexo, edad);
		this.peliculas = peliculas;
	}
	
	
}
