package com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos.*;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;
import com.ipartek.formacion.uf2216.ejercicios.global.excepciones.IdException;

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
		try {
			while ((row = csvReader.readLine()) != null) {  
			    String[] data = row.split(",");
			    System.out.println(data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3] + ", " + data[4] + ", " + data[5] + ", " + data[6] + ", " + data[7] + ", " + data[8]);
			}
		} catch (java.io.FileNotFoundException exp) {
			System.out.println("Error! no hay ningun fichero a importar");
			importar();
		}
		
		csvReader.close(); 
	}
	
	public void añadir() {
		Scanner sa = new Scanner(System.in);
		String titulo, genero, descripcion, editorial, autor;
		int id, edicion, isbn;
		
		System.out.println("Introduzca id del libro: ");
		id = sa.nextInt(); 
		sa.nextLine();
		
		System.out.println("Introduzca el título del libro: ");
		titulo = sa.nextLine();
		System.out.println("Introduzca el isbn de libro: ");
		isbn = sa.nextInt();
		sa.nextLine();
		System.out.println("Introduzca la editorial del libro: ");
		editorial = sa.nextLine();
		System.out.println("Introduzca el autor del libro: ");
		autor = sa.nextLine();
		System.out.println("Introduzca la descripción del libro: ");
		descripcion = sa.nextLine();
		System.out.println("Introduzca el género del libro: ");
		genero = sa.nextLine();		
		System.out.println("Introduzca el número de edicion del libro: ");
		edicion = sa.nextInt();
		
		insertar(new Libro(id, titulo, isbn, editorial, autor, descripcion, genero, edicion, false));
		
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
		Libro l = null;
		Scanner so = new Scanner(System.in);
		int id;
		System.out.println("Introduzca el id del libro a buscar: ");
		id = so.nextInt();
		
		for(Libro libro: obtenerTodos()) {
			if(libro.getId() == id) {
				l = libro;
				System.out.println(l);
				break;
			}
		}
		return l;
	}

	@Override
	public void insertar(Libro libro) {
		libros.add(libro);
	}

	@Override
	public void modificar(Libro libro) {
		Scanner sm = new Scanner(System.in);
		int  id, isbn, edicion;
		
		String titulo, genero, descripcion, autor, editorial;
		
		System.out.println("Introduzca el id del libro a modificar: ");
		
		id = sm.nextInt();
		sm.nextLine();
		for(Libro l: obtenerTodos()) {
			if(l.getId() == id) {
				System.out.println(l);
				l = libro;
				break;
			}
		}
		
		System.out.println("Introduzca el título del libro: ");
		titulo = sm.nextLine();
		System.out.println("Introduzca el isbn de libro: ");
		isbn = sm.nextInt();
		sm.nextLine();
		System.out.println("Introduzca la editorial del libro: ");
		editorial = sm.nextLine();
		System.out.println("Introduzca el autor del libro: ");
		autor = sm.nextLine();
		System.out.println("Introduzca la descripción del libro: ");
		descripcion = sm.nextLine();
		System.out.println("Introduzca el género del libro: ");
		genero = sm.nextLine();		
		System.out.println("Introduzca el número de edicion del libro: ");
		edicion = sm.nextInt();
		System.out.println("El libro se va a eliminar");
		libros.remove(id);
		System.out.println("Libro eliminado");
		insertar(new Libro(id, titulo, isbn, editorial, autor, descripcion, genero, edicion, false));
		
		System.out.println("Libro con id: "+ id +" actualizado satisfactoriamente");
		
	}

	

	@Override
	public void borrar() {
		int id;
		Scanner sb1 = new Scanner(System.in);
		System.out.println("Introduzca el id del libro a borrar: ");
		id = sb1.nextInt();
		try {
			libros.remove(id);
			System.out.println("Libro con id "+ id + " eliminado satisfactoriamente");
		} catch (IndexOutOfBoundsException e){
			System.out.println("Error! El id no es válido");
			borrar();
		}

		
		
	}

	@Override
	public void listar() {
		for(Libro libro: obtenerTodos()) {
			System.out.println(libro);
		}
		
	}

}