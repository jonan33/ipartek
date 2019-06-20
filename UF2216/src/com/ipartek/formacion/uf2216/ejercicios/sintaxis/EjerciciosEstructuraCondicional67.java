package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.io.IOException;
import java.util.Scanner;

public class EjerciciosEstructuraCondicional67 {

	public static void main(String[] args) {
		
		//ES UN NUMERO?
		char c;
		c = 'b';
		System.out.println("Introduzca un caracter: ");
		try {
			c = (char)System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Character.isDigit(c)) {
			System.out.println("Es un numero");
		} else {
			System.out.println("No es un numero");
		}
		
		//DIVISION CON COMPROBACION
		double x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el dividendo: ");
		x = sc.nextDouble();
		System.out.println("Introduzca el divisor: ");
		y = sc.nextDouble();
		if (y == 0) {
			System.out.println("El divisor no puede ser 0");
		} else {
			System.out.println("La division es " + x/y);
		}
	}

}
