package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosGenerales11 {

	public static void main(String[] args) {
		
		//PASAR A NUMEROS ROMANOS
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		System.out.println("Introduce un numero: ");
		n = sc.nextInt();
		} while (n < 0 && n > 4000);
		System.out.println("El número " + n + " en números romanos es: " + convertirANumerosRomanos(n));
	}
	
	public static String convertirANumerosRomanos(int num) {
		int i, miles, centenas, decenas, unidades;
		String romano = "";
		miles = num/1000;
		centenas = num/100 % 10;
		decenas = num/10 % 10;
		unidades = num/10 % 10;
		
		//millar
		for (i = 1; i <= miles; i++) {
			romano = romano + "M";}
		//centenas
		if (centenas == 9) {
			romano = romano + "CM";
		
		}
		else if (centenas == 5) {
			romano = romano + "D";
		 for (i = 6; i <= centenas; i++) {
			romano = romano + "C";
		}}
		else if (centenas == 4) {
			romano = romano + "CD";
		} 
		else {
			for (i = 1; i <= centenas; i++) {
				romano = romano + "C";}
		}
		
		//Decenas
		if (decenas ==9) {
			romano = romano + "XC";
			}
		else if (decenas == 5) {
			romano = romano + "L";
			for (i = 6; i <= decenas; i++) {
				romano = romano + "X";}
			}
		else if (decenas == 4) {
			romano = romano + "XL";
		}else {
			for (i=1; i <= decenas; i++) {
				romano = romano + "X";}
			}
		
		//Unidades
		if (unidades == 9) {
			romano = romano + "IX";
		}
		else if (decenas == 5) {
			romano = romano + "V";
			for (i = 6; i <= unidades; i++) {
				romano = romano + "I";
			}}
			else if (unidades == 4) {
				romano = romano + "IV";
			} else {
				for (i = 1; i <= unidades; i++) {
					romano = romano + "I";
				}
			} return romano;
		}
		} 
	


