package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosEstructuraIterativa12 {

	public static void main(String[] args) {
		
		//CON DO WHILE
		int n;
		Scanner sn = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un numero: ");
			n = sn.nextInt();
			if (n > 0) {
				System.out.println("Positivo");
			} else {
				System.out.println("Negativo");
			}
			
			if (n % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
			
		} while (n != 0);
		
		//CON WHILE
		int a; 
		Scanner sf = new Scanner(System.in);
		a = 1;
		while (a != 0) {
			System.out.println("Introduce un numero: ");
			a = sf.nextInt();
			if (a > 0) {
				System.out.println("Positivo");
			} else {
				System.out.println("negativo");
			}
			if (a % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
		}
		
		// PASAR DE MILLAS A KMS
		double km, millas;
		Scanner sd = new Scanner(System.in);
		
		do {
			System.out.println("Introduce una distancia en millas: ");
			millas = sd.nextDouble();
			if (millas != 0) {
				km = millas * 1.6093;
				System.out.println("La distancia " + millas + " millas son " + km + " kms");
			}
		} while (millas != 0);
	}

}
