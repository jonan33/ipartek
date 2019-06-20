package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.math.BigInteger;

public class EjemploRecursividad {

	public static void main(String[] args) {
//		Vuelta de marcador
//		long l = Long.MAX_VALUE;
//		System.out.println(l);
//		System.out.println(++l);
		System.out.println(factorial(new BigInteger("59")).toString());
		
	}
	
	public final static BigInteger UNO = new BigInteger("1"); 
	
	public static BigInteger factorial(BigInteger numero) {
		if(numero.equals(UNO)) {
			return numero;
		}
	
		return numero.multiply(factorial(numero.subtract(UNO)));
	}

}
