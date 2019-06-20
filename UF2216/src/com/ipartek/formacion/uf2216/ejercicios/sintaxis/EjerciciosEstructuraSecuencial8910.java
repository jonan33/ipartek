package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosEstructuraSecuencial8910 {

	public static void main(String[] args) {
		
		// CALCULAR VOLUMEN DE UNA ESFERA
		double r, v;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un radio: ");
		r = sc.nextDouble();
		v = (4/3)*Math.PI*Math.pow(r, 3);
		System.out.println("El volumen para el radio " + r + " es " + v);
		
		// CALCULAR AREA DE UN TRIANGULO
		double a, b, c, area, p;
		Scanner st = new Scanner(System.in);
		
		System.out.println("Introduzca el valor del lado a: ");
		a = st.nextDouble();
		System.out.println("Introduzca el valor del lado b: ");
		b = st.nextDouble();
		System.out.println("Introduzca el valor del lado c: ");
		c = st.nextDouble();
		p = (a+b+c)/2;
		area =  Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("El area del triangulo es " + a);		
		
		// EXTRAER LOS DIGITOS DE UN NUMERO 
		int num;
		Scanner sn = new Scanner(System.in);
			
		System.out.println("Introduzca un numero entero de 3 digitos: ");
		num = sn.nextInt();
		
		System.out.println("El primer dígito del numero " + num + " es " + num /100);
		System.out.println("El segundo dígito del numero " + num + " es " + (num/10)%10);
		System.out.println("El tercer dígito del numero " + num + " es " + num %10);
		
	}

}
