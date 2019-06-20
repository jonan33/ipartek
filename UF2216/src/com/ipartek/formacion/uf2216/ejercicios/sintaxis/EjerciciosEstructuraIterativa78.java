package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosEstructuraIterativa78 {

	public static void main(String[] args) {
		
		
		int n;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		n = sn.nextInt();
		
		// CON FOR
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		// CON WHILE
		int a = 1;
		while (a <= n) {
			System.out.println(a);
			a++;
		}
		
		//CON DO WHILE
		int b =1;
		do {
			System.out.println(b);
			b++;
		} while (b <=n);
		
		// CON FOR
		for (int c = n; c >= 1; c--) {
			System.out.println(c);
		}
		
		//CON DO WHILE
		int d = n;
		do {
			System.out.println(d);
			d--;
			} while (d >= 1);
		
		//CON WHILE
		int e = n;
		while (e >= 1) {
			System.out.println(e);
			e--;
		}
	}

}
