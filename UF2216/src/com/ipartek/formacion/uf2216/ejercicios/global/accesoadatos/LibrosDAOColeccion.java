package com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos;

import java.io.BufferedReader;
import java.io.FileReader;
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
	
	public void importar() throws IOException {
		String row;
		BufferedReader csvReader = new BufferedReader(new FileReader(RUTA_FICHERO));  
		while ((row = csvReader.readLine()) != null) {  
		    String[] data = row.split(",");
		    // do something with the data
		}
		csvReader.close(); 
	}
	
	public void añadir() {
		Scanner sa = new Scanner(System.in);
		String titulo, genero, descripcion, editorial, autor;
		int id, edicion, isbn;
		boolean isBorrado;
		
		System.out.println("Introduza id del libro: ");
		id = sa.nextInt();
		System.out.println("Introduzca el título del libro: ");
		titulo = sa.nextLine();
		System.out.println("Introduzca el autor del libro: ");
		autor = sa.nextLine();
		System.out.println("Introduzca el isbn de libro: ");
		isbn = sa.nextInt();
		System.out.println("Introuduzca el genero del libro: ");
		genero = sa.nextLine();
		System.out.println("Introduzca la editorial del libro: ");
		editorial = sa.nextLine();
		System.out.println("Introduzca la descripcion del libro: ");
		descripcion = sa.nextLine();
		System.out.println("Introduzca el numero de edicion del libro: ");
		edicion = sa.nextInt();
		
		
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
		pw.close();
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		System.out.println("Libro con id: "+libro.getId()+" actualizado satisfactoriamente");
		
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