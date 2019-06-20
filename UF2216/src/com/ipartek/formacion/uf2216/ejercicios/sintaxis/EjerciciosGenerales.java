package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.io.IOException;
import java.util.Scanner;

public class EjerciciosGenerales {

	public static void main(String[] args) {
		
		//INTERCAMBIAR VALOR DE 2 VARIABLES
		int a, b, aux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduca el primer numero: ");
		a = sc.nextInt();
		System.out.println("Introduce el segundo numero: ");
		b = sc.nextInt();
		System.out.println("Valores iniciales: A = " + a + " B = "+ b);
		aux = a; 
		a = b;
		b = aux;
		System.out.println("Valores finales: A = " + a + " B = " + b);

		
		//CALCULAR EL NUMERO DE DIGITOS DE UN NUMERO
		int c;
		Scanner sd = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		c = sd.nextInt();
		int  contador;
		contador = 0;
		do {
			c = c/10;
			contador++;		
		} while (c != 0);
		System.out.println("El numero tiene " + contador + " digitos");
		
		
		
		//PASAR TEMPERATURA A GRADOS KELVIN
		char r;
		double temperatura;
		Scanner st = new Scanner(System.in);
		r = 's';
		do {
			System.out.println("Introduzca una temperatura: ");
			temperatura = st.nextDouble();
			System.out.println("Grados kelvin: " + (temperatura + 273));
			System.out.println("Repetir proceso? s/n ");
			try {
				r = (char)System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (r == 's' || r == 'S');
		
		
		//SACAR LA TABLA DE MULTIPLICAR DE UN NUMERO
		int p;
		Scanner sz = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		p = sz.nextInt();
		
		System.out.println("Tabla del " + p);
		System.out.println("-----------");
		for (int i = 1; i <= 10; i ++) {
			System.out.println(p + " x " + i + " = " + (p*i));
			
		}
	}
	
	

}
