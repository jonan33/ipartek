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
		
		dao.insertar(new Libro(1, "Juego de tronos", 656153, "alfaguara", "jonan", "Un rollazo", "Intriga", 2, true));
		dao.insertar(new Libro(2, "Harry Potter", 613531, "Susaeta", "jonan", "Obra de arte", "Romantico", 1, false));
		dao.insertar(new Libro(3, "Los juegos del hambre", 315238, "alfaguara", "asier", "magnifica novela grafica", "comic", 5, false));
		dao.insertar(new Libro(4, "El hombre en el catillo", 6461665, "RBA", "mikel", "Clasico de la ficción", "Ciencia ficción", 8, false));
		
		do {
		System.out.println("1. Añadir");
		System.out.println("2. Modificar");
		System.out.println("3. Borrar");
		System.out.println("4. Listado");
		System.out.println("5. Buscar por Id");
		System.out.println("6. Guardar");
		System.out.println("7. Cargar");
		System.out.println("8. Importar(CSV)");
		System.out.println("9. Exportar(CSV)");
		System.out.println("10. Salir");
		System.out.println("Seleccione opcion:");
		
		opcion = sc.nextInt();
		
		switch (opcion){
		
		case 1: dao.añadir();
		break;
		case 2: dao.modificar(null);
		break;
		case 3: dao.borrar();
		break;
		case 4: dao.listar();
		break;
		case 5: dao.obtenerPorId();
		break;
		case 6: dao.guardar();
		break;
		case 8: dao.importar();
		break;
		case 9: dao.exportar();
		break;
		case 10: dao.salir();
		break;
		}
	} while (opcion != 10);
		}
	

}