package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.io.IOException;
import java.util.Scanner;

public class EjerciciosEstructuraCondicional123 {

	
	
	// PAR O IMPAR
	public static void main(String[] args) {
		int num;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero por pantalla: ");
		num = sn.nextInt();
		if (num % 2 == 0) {
		System.out.println("El número " + num + " es par");

	} else {
		System.out.println("El numero " + num + " es impar");
	}
		
	// MULTIPLO DE 10	
	int num2;
	Scanner sn2 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		num2 = sn2.nextInt();
		if (num2 % 10 == 0) {
			System.out.println("El numero es multiplo de 10");
			} else {
				System.out.println("El numero no es multiplo de 10");
			}
			
	// MAYUSCULA O MINUSCULA
	char x;
	Scanner sn3 = new Scanner(System.in);
	x = 'a';
	System.out.println("Introduzca una letra: ");
	try {
			x = (char)System.in.read();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			if (Character.isUpperCase(x)) {
				System.out.println("La letra es mayuscula");
			} else {
				System.out.println("La letra es minuscula");
			}
			
	}
	
	
	
}