package com.ipartek.formacion.uf2216.ejercicios.sintaxis.poo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		//CONTADOR		
		Scanner sc = new Scanner(System.in);
		Contador contador1 = new Contador();
		int n;
		
		System.out.println("Introduzca un valor");
		n = sc.nextInt();
		
		contador1.setCont(n);
		System.out.println(contador1.getCont());
		
		contador1.incrementar();
		contador1.incrementar();
		System.out.println(contador1.getCont());
		
		contador1.decrementar();
		
		System.out.println(contador1.getCont());
		
		Contador contador2 = new Contador(10);
		
		System.out.println(contador2.getCont());
		
		contador2.decrementar();
		System.out.println(contador2.getCont());
		
	}

	private int cont;
	
	public  Contador(){
	}
	
	public Contador(int cont) {
		if (cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}
	public Contador(final Contador c) {
		cont = c.cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar() {
		cont++;
	}
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}
}
