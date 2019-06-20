package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosEstructuraSecuencial111213 {
	public static void main(String[] args) {
		
		//MOSTRAR LAS CIFRAS DE UN NUMERO SECUENCIALMENTE
		int num;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero de 5 dígitos: ");
		num = sn.nextInt();
		System.out.println(num/10000);
        System.out.println(num/1000);
        System.out.println(num/100);
        System.out.println(num/10);
        System.out.println(num);
        
        //MOSTRAR LAS CIFRAS DE UN NUMERO SECUENCIALMENTE AL REVES
        int num2;
        Scanner sn2 = new Scanner(System.in);
        
        System.out.println("Introduzca un numero entero de 5 digitos: ");
		num2 = sn2.nextInt();
		System.out.println(num%10);
        System.out.printf("%02d %n",num%100);
        System.out.printf("%03d %n",num%1000);
        System.out.printf("%04d %n",num%10000);
        System.out.printf("%05d %n",num);
        
        //CALCULAR NUMERO DE LASUERTE EN BASE A FECHA DE NACIMIENTO
        Scanner sn3 = new Scanner(System.in);
        int dia, mes, anyo, numero, suma, cifra1, cifra2, cifra3, cifra4;
        
        System.out.println("Introduzca una fecha de nacimiento: ");
        System.out.println("Introduzca el dia: ");
        dia = sn3.nextInt();
        System.out.println("Introduzca el mes: ");
        mes = sn3.nextInt();
        System.out.println("Introduzca el año: ");
        anyo = sn3.nextInt();
        suma = dia + mes + anyo;
        cifra1 = suma/1000;      
        cifra2 = suma/100%10;  
        cifra3 = suma/10%10;   
        cifra4 = suma%10;        
        numero = cifra1 + cifra2 + cifra3 + cifra4;
        System.out.println("Tu numero de la suerte es el " + numero);
	}
}
