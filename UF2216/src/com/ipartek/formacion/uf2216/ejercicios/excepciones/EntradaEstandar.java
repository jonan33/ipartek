package com.ipartek.formacion.uf2216.ejercicios.excepciones;

public class EntradaEstandar {
	
	
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
