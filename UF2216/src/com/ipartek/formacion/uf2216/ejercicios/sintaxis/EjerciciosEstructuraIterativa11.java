package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosEstructuraIterativa11 {

	public static void main(String[] args) {
		
		//MOSTRAR MULTIPLOS DE UN NUMERO
		int N, M;
		Scanner sn = new Scanner(System.in);
		
		do {
		System.out.println("Introduzca el primer numero: ");
		N = sn.nextInt();
		if (N <= 0) {
			System.out.println("Error! el numero debe ser positivo");
		}		
		} while (N <= 0);
		do {
		System.out.println("Introduzca el segundo numero: ");
		M = sn.nextInt();
		if (M < N) {
			System.out.println("Error! El numero debe ser mayor que " + N);
		} 
		}while (M < N);
		
		for (int i = 1; i<=M; i++) {
			if (i % N == 0 ) {
			System.out.println(i);}
		}
		

	}

}
