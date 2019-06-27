package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.io.IOException;
import java.util.Scanner;

import com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {

	public static void main(String[] args) throws IOException {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		dao.insertar(new Libro(0, "Juego de tronos", 656153, "alfaguara", "jonan", "Un rollazo", "Intriga", 2, true));
		dao.insertar(new Libro(1, "Harry Potter", 613531, "Susaeta", "jonan", "Obra de arte", "Romantico", 1, false));
		dao.insertar(new Libro(2, "Los juegos del hambre", 315238, "planeta", "asier", "magnifica novela grafica", "comic", 5, false));
		dao.insertar(new Libro(3, "El hombre en el castillo", 6461665, "RBA", "mikel", "Cl�sico de la ficci�n", "Ciencia ficci�n", 8, false));
		
		do {
		System.out.println("1. A�adir");
		System.out.println("2. Modificar");
		System.out.println("3. Borrar");
		System.out.println("4. Listado");
		System.out.println("5. Buscar por Id");
		System.out.println("6. Importar(CSV)");
		System.out.println("7. Exportar(CSV)");
		System.out.println("0. Salir");
		System.out.println("Seleccione opci�n:");
		
		opcion = sc.nextInt();
		
		switch (opcion){		
		case 1: dao.a�adir();
		break;
		case 2: dao.modificar(null);
		break;
		case 3: dao.borrar();
		break;
		case 4: dao.listar();
		break;
		case 5: dao.obtenerPorId();
		break;
		case 6: dao.importar();
		break;
		case 7: dao.exportar();
		break;
		case 0: dao.salir();
		break;
		}
	} while (opcion != 0);
		sc.close();
 }
	
}