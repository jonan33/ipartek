package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosEstructuraSecuencial {

	public static void main(String[] args) {
		
		//MOSTRAR NUMEROS INTRODUCIDOS
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduca el primer numero: ");
		a = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		b = sc.nextInt();
		System.out.println("Ha introducido los números " + a + " y " + b);
		
		//MOSTRAR NOMBE INTRODUCIDO
		String nombre;
		Scanner sd = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		nombre = sd.nextLine();
		System.out.println("Buenos días " + nombre);
		
		//CALCULAR EL DOBLE Y EL TRIPLE
		int c;
		Scanner sf = new Scanner(System.in);
		System.out.println("Introduzca un numero:");
		c = sf.nextInt();
		System.out.println("El doble del número introducido es: " + c *2);
		System.out.println("El triple del número introducido es: " + c * 3);
		
		

	}

}
