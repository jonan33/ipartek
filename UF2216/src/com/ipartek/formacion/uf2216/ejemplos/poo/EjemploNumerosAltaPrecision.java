package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Date;

public class EjemploNumerosAltaPrecision {

	public static void main(String[] args) {
		BigDecimal euros = new BigDecimal(123.45, new MathContext(5)); //new BigDecimal("123.45");
		
		System.out.println(euros);
		
		System.out.println(euros.multiply(new BigDecimal("1.21"),new MathContext(5))); //euros.doubleValue() * 1.21);
		
		BigInteger numeroDeDispositivosIoTEnElMundoFuturo = new BigInteger("10000000000000000000"); //10000000000000000000L);
		System.out.println(numeroDeDispositivosIoTEnElMundoFuturo);
		
		double d = 123.45;
		
		long inicio, fin, ms;
		
		inicio = new Date().getTime();
		double resultadoDouble = d / 3.4;
		fin = new Date().getTime();
		
		ms = fin - inicio;
		
		System.out.println(resultadoDouble);
		
		System.out.println(ms);
		
		inicio = new Date().getTime();
		BigDecimal resultado = euros.divide(new BigDecimal(3.4), new MathContext(30000));
		fin = new Date().getTime();
		
		ms = fin - inicio;
		
		System.out.println(resultado);
		
		System.out.println(ms);
		
		System.out.println(resultado.doubleValue());
		
	}

}
