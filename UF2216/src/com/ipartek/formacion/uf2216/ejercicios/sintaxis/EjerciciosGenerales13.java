package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosGenerales13 {

	public static void main(String[] args) {
		
		//ES CAPICUA
		Scanner sc = new Scanner(System.in);
		int n, aux, inverso, cifra;
		
		System.out.println("Introduzca un numero entero: ");
		n = sc.nextInt();
		inverso = 1;
		aux = n;
		cifra = 0;
		while (aux != 0) {
			cifra = aux % 10;
			inverso = inverso * 10 + cifra;
			aux = aux / 10;
		}
		if (n == inverso) {
			System.out.println("Es capicua");
			
		} else {
			System.out.println("No es capicua");
		}
		
		
	}

}
