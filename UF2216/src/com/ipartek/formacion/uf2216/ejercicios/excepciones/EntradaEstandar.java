package com.ipartek.formacion.uf2216.ejercicios.excepciones;

import java.io.IOException;
import java.util.Scanner;

public class EntradaEstandar {
	
	
		static java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
		static java.io.BufferedReader br = new java.io.BufferedReader(isr);

		public static void main(String[] args) {
			int a, b;
			float x, y;
			String nombre;

			a = entradaInt("Operando entero 1: ");
			b = entradaInt("Operando entero 2: ");
			System.out.println(a + " + " + b + " = " + (a + b));
			x = entradaFloat("Operando flotante 1: ");
			y = entradaFloat("Operando flotante 2: ");
			System.out.println(x + " / " + y + " = " + (x / y));
			nombre = entradaString("Introduzca su nombre: ");
			System.out.println("Hola " + nombre + ". ¡Bienvenido a Java!");
			try {
				br.close();
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		private static int entradaInt(String mensaje) {
			boolean entradaCorrecta = false;
			String texto = null;
			int aux = 0;
			while (!entradaCorrecta) {
				System.out.print(mensaje);
				try {
					texto = br.readLine();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
					aux = EntradaEstandar.leerInt(texto);
					entradaCorrecta = true;
				} catch (Exception e) {
					System.out.println("ERROR: El valor introducido no es correcto.");
				}
			}
			return aux;
		}

		private static float entradaFloat(String mensaje) {
			boolean entradaCorrecta = false;
			String texto = null;
			Float aux = null;
			while (!entradaCorrecta) {
				System.out.print(mensaje);
				try {
					texto = br.readLine();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
					aux = EntradaEstandar.leerFloat(texto);
					entradaCorrecta = true;
				} catch (Exception e) {
					System.out.println("ERROR: El valor introducido no es correcto.");
				}
			}
			return aux;
		}

		private static String entradaString(String mensaje) {
			boolean entradaCorrecta = false;
			String texto = null;
			String aux = null;
			while (!entradaCorrecta) {
				System.out.print(mensaje);
				try {
					texto = br.readLine();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
					aux = EntradaEstandar.leerString(texto);
					entradaCorrecta = true;
				} catch (Exception e) {
					System.out.println("ERROR: El valor introducido no es correcto.");
				}
			}
			return aux;
		}
	
	public static int leerInt(String mensaje) {
		return Integer.parseInt(mensaje);
	}
	public static float leerFloat(String mensaje) {
		return Float.parseFloat(mensaje);
	}
	public static String leerString(String mensaje) {
		return mensaje;
	}

}
