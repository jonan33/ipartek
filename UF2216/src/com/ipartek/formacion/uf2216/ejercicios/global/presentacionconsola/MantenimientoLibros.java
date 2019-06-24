package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.util.Scanner;

import com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {

	public static void main(String[] args) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		dao.insertar(new Libro(1, "T�tulo 1", 656153, "alfaguara", "jonan", "Un rollazo", "Intriga", 2, true));
		dao.insertar(new Libro(2, "T�tulo 2", 613531, "Susaeta", "jonan", "Obra de arte", "Romantico", 1, false));
		
		for(Libro libro: dao.obtenerTodos()) {
			System.out.println(libro);
		}
		
		
		
		System.out.println("1. A�adir");
		System.out.println("2. Modificar");
		System.out.println("3. Borrar");
		System.out.println("4. Listado");
		System.out.println("5. Buscar por Id");
		System.out.println("6. Guardar");
		System.out.println("7. Cargar");
		System.out.println("8. Importar(CSV)");
		System.out.println("9. Exportar(CSV)");
		
		System.out.println("0. Salir");
		
		opcion = sc.nextInt();
		
		switch (opcion){
		
		case 1: dao.insertar(null);
		case 2: dao.modificar(null);
		case 3: dao.borrar(null);
		case 4: dao.listar();
		case 5: dao.obtenerPorId();
		}
	}

}