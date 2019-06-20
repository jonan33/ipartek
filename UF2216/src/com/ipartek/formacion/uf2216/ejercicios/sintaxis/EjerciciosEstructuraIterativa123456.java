package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

public class EjerciciosEstructuraIterativa123456 {

	public static void main(String[] args) {
		
		//CON WHILE
		int i;
		i = 0;
		while(i < 101 ) {
			System.out.println(i);
			i = i + 1;
		}

		//CON DO WHILE
		int a;
		a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a < 101);
		
		//CON FOR
		for (int b = 1; b < 101; b++) 
			System.out.println(b);	
		
		//CON WHILE
		int c;
		c = 100;
		while (c > 0) {
			System.out.println(c);
			c--;}
			
		//CON DO WHILE
		int d = 100;
		do {
			System.out.println(d);
			d--;
		}while (d>0);
		
		//CON FOR
		for (int e = 100; e > 0; e--) {
			System.out.println(e);
		}
		}
	}


