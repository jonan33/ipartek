package com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos;

import java.util.ArrayList;
import com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos.*;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class LibrosDAOColeccion implements Crudable<Libro> {
	//Data
	//Access
	//Object
	
	// Inicio patrón Singleton
	private LibrosDAOColeccion() {}
	
	private static LibrosDAOColeccion instancia; // = new LibrosDAOColeccion();
	
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
	
	public void exportar() {
		
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
		return libros.get(0);
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
	public void borrar(Libro libro) {
		libros.remove(libro.getId());
		System.out.println("Libro con id: "+libro.getId()+" eliminado satisfactoriamente");
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

}