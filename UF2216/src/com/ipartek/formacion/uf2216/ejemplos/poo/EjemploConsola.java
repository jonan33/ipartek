package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjemploConsola {

	// Java7
	public static void mainJava7(String[] args) {
		
		int numero;
		
		
		try(Scanner s = new Scanner(System.in)) {
			
			System.out.println("Dime tu nombre: ");

			String nombre = s.next();

			System.out.println("Hola " + nombre);

			numero = s.nextInt();
		} catch (Exception e) {
			System.out.println("Fallo no esperado");
			return;
		}

		System.out.println(numero * 2);
	}

	// Java6
	public static void main(String[] args) {
		System.out.print("Dime tu nombre: ");
		
		String nombre = System.console().readLine();
		
		System.out.println("Hola " + nombre);
	}
	
	// Java5
	public static void mainJava5(String[] args) {
		Scanner s = null;
		int numero;
		try {
			s = new Scanner(System.in);

			System.out.println("Dime tu nombre: ");

			String nombre = s.next();

			System.out.println("Hola " + nombre);

			numero = s.nextInt();
		} catch (Exception e) {
			System.out.println("Fallo no esperado");
			return;
		} finally {
			if (s != null) {
				s.close();
				s = null;
			}
		}

		System.out.println(numero * 2);
	}

	public static void mainJavaTodoTerreno(String[] args) {
		System.out.print("Dime tu nombre: ");

		BufferedReader br = null;
		int numero = 0;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			String nombre = br.readLine();

			System.out.println("Hola " + nombre);

			boolean hayError;

			do {
				hayError = false;

				try {
					System.out.print("Dime un n�mero: ");

					String sNumero = br.readLine();

					numero = Integer.parseInt(sNumero);
				} catch (NumberFormatException e) {
					System.out.println("La pr�xima vez introduce un n�mero");
					hayError = true;
				}
			} while (hayError);
		} catch (IOException e) {
			System.out.println("No se ha podido recibir informaci�n de consola");
			return;
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("Error al cerrar el flujo de consola");
				}
				br = null;
			}
		}
		System.out.println(numero * 2);
	}

}