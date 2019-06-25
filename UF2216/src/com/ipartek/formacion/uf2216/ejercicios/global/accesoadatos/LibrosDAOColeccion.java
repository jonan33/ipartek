package com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos.*;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class LibrosDAOColeccion implements Crudable<Libro> {
	//Data
	//Access
	//Object
	
	// Inicio patrón Singleton
	private LibrosDAOColeccion() {}
	
	private static LibrosDAOColeccion instancia; // = new LibrosDAOColeccion();
	private static final String RUTA_FICHERO = "C:\\trabajos\\libro.csv";
	private static final boolean AUTO_FLUSH = true;
	private static final boolean APPEND = true;
	
	public static LibrosDAOColeccion getInstance() {
		if(instancia == null) {
			instancia = new LibrosDAOColeccion();
		}
		
		return instancia;
	}
	// Fin patrón Singleton
	
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public void importar() {
		
	}
	
	public void añadir() {
		
	}
	
	public void exportar() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(RUTA_FICHERO, APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw, AUTO_FLUSH);
		for(Libro libro: obtenerTodos()) {
			pw.println(libro);
		}
	}
	
	
	 
	public void guardar() {
		
	}
	
	public void cargar() {
		
	}
	
	public void salir() {
		System.out.println("Hasta luego!");
		System.exit(0);
	}
	
	@Override
	public Iterable<Libro> obtenerTodos() {
		return libros;
	}

	@Override
	public Libro obtenerPorId() {
		Scanner so = new Scanner(System.in);
		int id;
		System.out.println("Introduzca el id del libro a buscar: ");
		id = so.nextInt();
		return libros.get(id);
		
	}

	@Override
	public void insertar(Libro libro) {
		libros.add(libro);
	}

	@Override
	public void modificar(Libro libro) {
		libros.get((int) libro.getId()).setTitulo(libro.getTitulo());
		libros.get((int)libro.getIsbn()).setIsbn(libro.getIsbn());
		System.out.println("Cliente con id: "+libro.getId()+" actualizado satisfactoriamente");
		
	}

	

	@Override
	public void borrar() {
		int id;
		Scanner sb1 = new Scanner(System.in);
		System.out.println("Introduzca el id del libro a borrar: ");
		id = sb1.nextInt();
		libros.remove(id);
		System.out.println("Libro con id "+id+ " eliminado satisfactoriamente");
	}

	@Override
	public void listar() {
		for(Libro libro: obtenerTodos()) {
			System.out.println(libro);
		}
		
	}

}