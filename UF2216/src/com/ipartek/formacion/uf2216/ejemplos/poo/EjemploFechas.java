package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class EjemploFechas {
	private static final String FORMATO_FECHA = "%1$tY-%1$tm-%1$te";

	public static void main(String[] args) {
		// Si tenemos Java8, utilizar java.time
		LocalDate ld = LocalDate.now();
		
		System.out.println(ld);
		
		LocalDate dentroDe30Dias = ld.plusDays(30);
		
		System.out.println(dentroDe30Dias);
		
		LocalDate dentroDe3Meses = ld.plusMonths(3);
		
		System.out.println(dentroDe3Meses);
		
		LocalDate finDeEnero = LocalDate.of(2019, 1, 31);
		
		System.out.println(finDeEnero);
		
		System.out.println(finDeEnero.plusMonths(3));
	}
	
	public static void mainJodaTime(String[] args) {
		// Si no tenemos Java8 en adelante, usar JodaTime
		Date hoy = new Date();
		
		DateTime dt = new DateTime(hoy);
		
		DateTime dentroDe30Dias = dt.plusDays(30);
		
		System.out.println(dentroDe30Dias);
		
		DateTime dentroDe3Meses = dt.plusMonths(3);
		
		System.out.println(dentroDe3Meses);
		
		DateTime finDeEnero = new DateTime(2019,1,31,0,0,0,0);
		
		System.out.println(finDeEnero);
		
		System.out.println(finDeEnero.plusMonths(3));
	}
	
	@SuppressWarnings("deprecation")
	public static void mainFechasJavaBasicas(String[] args) {
		Date ahora = new Date(); // java.UTIL.Date
		System.out.println(ahora);
		
		Date inicioCurso = new Date(2019 - 1900, 6 - 1, 12, 8, 30, 0);
		System.out.println(inicioCurso);
		
		Calendar ahoraNuevo = Calendar.getInstance();
		mostrarFecha(ahoraNuevo);
		System.out.println(ahoraNuevo.get(Calendar.DATE));
		
		Calendar dentroDe30Dias = Calendar.getInstance();
		
		dentroDe30Dias.add(Calendar.DATE, 30);
		
		mostrarFecha(dentroDe30Dias);
	}

	private static void mostrarFecha(Calendar ahoraNuevo) {
		System.out.println(String.format(FORMATO_FECHA, ahoraNuevo));
	}
}