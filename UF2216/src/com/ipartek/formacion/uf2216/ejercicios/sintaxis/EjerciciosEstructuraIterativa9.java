package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosEstructuraIterativa9 {

	public static void main(String[] args) {
		int a, b, mayor, menor;
		Scanner sn = new Scanner(System.in);
				
		do {
		System.out.println("Introduzca el primer numero: ");
		a= sn.nextInt();
		System.out.println("Introduzca otro numero: ");
		b = sn.nextInt();
		if (a == b) {
			System.out.println("ERROR! Los numeros deben ser distintos");
		} 
		} while (a == b);
		
		if (a > b) {
			mayor = a;
			menor = b;
		} else {
			mayor = b;
			menor = a;
			}
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);}
		
		
		int x, y;
		Scanner st = new Scanner(System.in);
		do {
			System.out.println("Introduzca el primer numero: ");
			x= sn.nextInt();
			System.out.println("Introduzca otro numero: ");
			y = sn.nextInt();
			if (x >= y) {
				System.out.println("ERROR! El segundo numero deber ser mayor que el primero");
			} 
			} while (x >= y);
		
		for (; x<= y; x++) {
			if (x % 2 == 0) {
			System.out.println(x);}
		}
		
		
	}

}
