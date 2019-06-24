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
		
		dao.insertar(new Libro(1, "Juego de tronos", 656153, "alfaguara", "jonan", "Un rollazo", "Intriga", 2, true));
		dao.insertar(new Libro(2, "Harry Potter", 613531, "Susaeta", "jonan", "Obra de arte", "Romantico", 1, false));
		
		
		
		
		
		System.out.println("1. Añadir");
		System.out.println("2. Modificar");
		System.out.println("3. Borrar");
		System.out.println("4. Listado");
		System.out.println("5. Buscar por Id");
		System.out.println("6. Guardar");
		System.out.println("7. Cargar");
		System.out.println("8. Importar(CSV)");
		System.out.println("9. Exportar(CSV)");
		
		System.out.println("0. Salir");
		System.out.println("Seleccione opcion");
		
		opcion = sc.nextInt();
		
		switch (opcion){
		
		case 1: dao.insertar(null);
		case 2: dao.modificar(null);
		case 3: dao.borrar();
		case 4: dao.listar();
		case 5: dao.obtenerPorId();
		case 9: dao.exportar();
		case 0: dao.salir();
		}
	}

}