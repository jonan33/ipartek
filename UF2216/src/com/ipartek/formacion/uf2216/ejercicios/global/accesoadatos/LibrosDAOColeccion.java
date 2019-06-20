package com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos;

import java.util.ArrayList;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class LibrosDAOColeccion implements Crudable<Libro> {
	//Data
	//Access
	//Object
	
	// Inicio patr�n Singleton
	private LibrosDAOColeccion() {}
	
	private static LibrosDAOColeccion instancia; // = new LibrosDAOColeccion();
	
	public static LibrosDAOColeccion getInstance() {
		if(instancia == null) {
			instancia = new LibrosDAOColeccion();
		}
		
		return instancia;
	}
	// Fin patr�n Singleton
	
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	
	@Override
	public Iterable<Libro> obtenerTodos() {
		return libros;
	}

	@Override
	public Libro obtenerPorId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Libro libro) {
		libros.add(libro);
	}

	@Override
	public void modificar(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(long id) {
		// TODO Auto-generated method stub
		
	}

}