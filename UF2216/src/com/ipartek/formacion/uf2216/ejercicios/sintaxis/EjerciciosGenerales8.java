package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosGenerales8 {
	public static void main(String [] args) {
		
		// FIBONACCI
		Scanner sc = new Scanner(System.in);
		int n, f1, f2;
		
		System.out.println("Introduce un numero mayor que 1: ");
		n = sc.nextInt();
		 f1 = 1;
		 f2 = 2;
		 
		 System.out.print(f1 + " ");
		 for (int i = 2; i < n; i++) {
			 System.out.print(f2 + " ");
			 f2 = f1 + f2;
			 f1 = f2 - f1;
		 }
		 System.out.println();
		 
		 //DE DECIMAL A BINARIO
		 int numero, exp, digito;
	        double binario;
	        Scanner sd = new Scanner(System.in);

	        do{  
	            System.out.print("Introduce un numero entero >= 0: ");
	            numero = sd.nextInt();
	        }while(numero<0);

	        exp=0;
	        binario=0;
	        while(numero!=0){
	                digito = numero % 2;            
	                binario = binario + digito * Math.pow(10, exp);   
	                exp++;
	                numero = numero/2;
	        }
	        System.out.printf("Binario: %.0f %n", binario);
	        
	        //DE BINARIO A DECIMAL
	        long num, dig, aux, decimal;
	        int exponente;
	        boolean esBinario;
	        Scanner sp = new Scanner(System.in);
	        dig = 0;
	       //Leer un número por teclado y comprobar que es binario
	        do {
	             System.out.print("Introduce un numero binario: ");
	             num = sp.nextLong();
	             //comprobamos que sea un número binario es decir
	             //que este formado solo por ceros y unos
	             esBinario = true;
	             aux = num;
	             while (aux != 0) {
	                        dig = aux % 10; //última cifra del números
	                        if (dig != 0 && dig != 1) { //si no es 0 ó 1
	                             esBinario = false; //no es un número binario
	                        }
	                        aux = aux / 10; //quitamos la última cifra para repetir el proceso
	              }
	         } while (!esBinario); //se vuelve a pedir si no es binario

	         //proceso para pasar de binario a decimal
	         exponente = 0;
	         decimal = 0; //será el equivalente en base decimal
	         while (num != 0) {
	                   //se toma la última cifra
	                   dig = num % 10;
	                   //se multiplica por la potencia de 2 correspondiente y se suma al número
	                   decimal = decimal + dig * (int) Math.pow(2, exponente);
	                   //se aumenta el exponente
	                   exponente++;
	                   //se quita la última cifra para repetir el proceso
	                   num = num / 10;
	         }
	         System.out.println("Decimal: " + decimal);
	}
}
