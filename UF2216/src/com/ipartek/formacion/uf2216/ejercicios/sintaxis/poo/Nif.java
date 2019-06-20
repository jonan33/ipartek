package com.ipartek.formacion.uf2216.ejercicios.sintaxis.poo;

import java.util.Scanner;

public class Nif {

	public static void main(String[] args) {
		Nif nif1 = new Nif();
		nif1.leer();
		
		Nif nif2 = new Nif(78957145);
		System.out.println(nif2);

	}
	
	private int dni;
	private char letra;
	
	public Nif() {
		
	}
	public Nif(int dni) {
		this.dni = dni;
		letra = calcularLetra();
		
	}
	
	public char calcularLetra() {
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		return letras[dni % 32];
	}
	
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un DNI: ");
		dni =sc.nextInt();
		System.out.println("Al DNI " + dni + " le corresponde la letra " + calcularLetra());
	}
	@Override
	public String toString() {
		return "Nif [dni=" + dni + ", letra=" + letra + ", calcularLetra()=" + calcularLetra() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
