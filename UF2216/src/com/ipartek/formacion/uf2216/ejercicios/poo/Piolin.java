package com.ipartek.formacion.uf2216.ejercicios.poo;

import java.util.ArrayList;

public class Piolin extends Canario{

	public static void main(String[] args) {
		Piolin piolin1 = new Piolin('H', 5, 12);
		Loro loro1 = new Loro('M', 4, "S".charAt(0), "Rojo");
		ArrayList<Piolin> piolines = new ArrayList<Piolin>();
		piolines.add(new Piolin('H', 3, 20));
		piolines.add(new Piolin('M', 5, 15));
		piolines.add(new Piolin('M', 7, 2));
		
		Loro loro2 = new Loro('M', 5, 'S', "Amarillo");
		
		DatosPersonales dt = new DatosPersonales("Pajaro", "Jonan");
		
		
		
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
	public void Cantar() {
		
	}
	
	
}
