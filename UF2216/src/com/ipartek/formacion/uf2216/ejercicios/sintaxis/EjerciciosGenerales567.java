package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosGenerales567 {

	public static void main(String[] args) {
		
		//NUMEROS MULTIPLOS DE DOS
		Scanner sc = new Scanner(System.in);
		int n, contador;
		contador = 0;
		do {
			System.out.println("Introduce un numero entero");
			n = sc.nextInt();
			if (n % 10 == 2) {
				contador++;
			}
			
		} while (n >= 0);
		System.out.println(contador + " numeros eran multiplos de dos");
		
		// SON PERFECTOS?
		int suma, a;
		Scanner sd = new Scanner(System.in);
		a = 0;
		suma = a;
		
		System.out.println("Introduce un numero: ");
		a = sd.nextInt();
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				suma = suma + i;
			}
		}
		if (suma == a) {
			System.out.println("Perfecto");
		} else {
			System.out.println("No perfecto");
		}
		
		//SON AMIGOS?
		int x, y, i, summa;
		Scanner sa = new Scanner(System.in);
		summa = 0;
		System.out.println("Introduce el primer numero: ");
		x = sa.nextInt();
		System.out.println("Introduce el segundo numero: ");
		y = sa.nextInt();
		// Sacar divisores de x
		for (i = 1; i < x; i++) {
			if (x % i == 0) {
				summa = summa + i;
			}
		}
		if (summa == y) {
			summa = 0;
			for (i = 1; i < y; i++) {
				if (y % i == 0) {
					summa = summa + i;
				}
			}
		}
		if (summa == x) {
			System.out.println("Son amigos");
		} else {
			System.out.println("No son amigos");
		}
	}
		

}
