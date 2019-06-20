package com.ipartek.formacion.uf2216.ejercicios.sintaxis.poo;

import java.util.Scanner;

public class Libro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro libro1 = new Libro();
		Libro libro2 = new Libro("Harry Potter", "JK Rowling", 5, 2);
		Libro libro3 = new Libro("Juego de tronos", "George martin", 4, 4);
		String titulo, autor;
		int ejemplares, prestados;
		
		System.out.println("Introduce un titulo");
		titulo = sc.nextLine();
		libro1.setTitulo(titulo);
		System.out.println("Introduce autor");
		autor = sc.nextLine();
		libro1.setAutor(autor);
		System.out.println("Introduce numero de ejemplares");
		ejemplares = sc.nextInt();
		libro1.setNumeroEjemplares(ejemplares);
		System.out.println("Introduce numero de ejemplares prestados");
		prestados =sc.nextInt();
		libro1.setEjemplaresPrestados(prestados);
		
		System.out.println(libro1);
		System.out.print(libro2.getTitulo());
		System.out.print(libro2.getAutor());
		System.out.print(libro2.getNumeroEjemplares());
		System.out.println(libro2.getEjemplaresPrestados());
		System.out.println(libro3);
	}
	
	private String titulo;
	private String autor;
	private int numeroEjemplares;
	private int ejemplaresPrestados;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados) {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	public boolean Prestamo() {
		boolean prestado = true;
		if (ejemplaresPrestados < numeroEjemplares) {
			ejemplaresPrestados++;
		} else {
			prestado = false;
		}
		return prestado;
	}
	public boolean Devolucion() {
		boolean devuelto = true;
		if (ejemplaresPrestados <0) {
			devuelto = false;
		} else {
			ejemplaresPrestados--;
		} return devuelto;
	}
	@Override
	public String toString() {
		return "titulo: " + titulo + ", autor:" + autor + ", numero de ejemplares:" + numeroEjemplares + ", ejemplares prestados:" + ejemplaresPrestados;
	}

}
