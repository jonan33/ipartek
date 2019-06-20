package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {

	public static void main(String[] args) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		
		dao.insertar(new Libro(1, "T�tulo 1", "65413a21sd", "alfaguara", "jonan", "Un rollazo", "Intriga", 2, true));
		dao.insertar(new Libro(2, "T�tulo 2", "35a1f3a", "Susaeta", "jonan", "Obra de arte", "Romantico", 1, false));
		
		for(Libro libro: dao.obtenerTodos()) {
			System.out.println(libro);
		}
		
		
		
		System.out.println("1. A�adir");
		System.out.println("2. Modificar");
		System.out.println("3. Borrar");
		System.out.println("4. Listado");
		System.out.println("5. Buscar por Id");
		System.out.println("5. Buscar por titulo");
	}

}