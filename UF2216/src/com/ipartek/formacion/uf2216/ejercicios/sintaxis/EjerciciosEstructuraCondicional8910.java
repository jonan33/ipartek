package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.util.Scanner;

public class EjerciciosEstructuraCondicional8910 {

	public static void main(String[] args) {
		
		//MAYOR DE 3 NUMEROS
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero: ");
		a = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		b = sc.nextInt();
		System.out.println("Introduzca el tercer numero: ");
		c = sc.nextInt();
		if (a > b & a > c) {
			System.out.println("El mayor es " + a);
		} else if (b > a & b > c) {
			System.out.println("El mayor es " + b);
		} else {
			System.out.println("El mayor es " + c);
		}
		
		//COMPROBAR HORA CORRECTA
		int h, m, s;
		Scanner sh = new Scanner(System.in);
		
		System.out.println("Introduzca una hora. ");
		h = sh.nextInt();
		System.out.println("Introduzca minutos: ");
		m = sh.nextInt();
		System.out.println("Introduzca segundos: ");
		s = sh.nextInt();
		if (h > 00 && h < 24 && m > 00 && m < 60 && s > 00 && s < 60) {
			System.out.println("La hora es correcta");
		} else {
			System.out.println("La hora es incorrecta");
		}
		
		
		//NUMERO DIAS DEL MES
		int mes;
		Scanner sm = new Scanner(System.in);
		
		System.out.println("Introduzca un mes: ");
		mes = sm.nextInt();
		
		if (mes < 1 || mes > 12) {
			System.out.println("Mes incorrecto");
			} else {
				
				switch(mes) {
		case 1: System.out.print("Enero");
                break;
        case 2: System.out.print("Febrero");
                break;
        case 3: System.out.print("Marzo");
                break;
        case 4: System.out.print("Abril");
                break;
        case 5: System.out.print("Mayo");
                break;
        case 6: System.out.print("Junio");
                break;
        case 7: System.out.print("Julio");
                break;
        case 8: System.out.print("Agosto");
                break;
        case 9: System.out.print("Septiembre");
                break;
        case 10: System.out.print("Octubre");
                break;
        case 11: System.out.print("Noviembre");
                break;
        case 12: System.out.print("Diciembre");
                break;
    } 
				}
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println(" Tiene 30 dias");
			} else if (mes == 2) {
				System.out.println(" Tiene 28 dias");
			}else {
					System.out.println(" Tiene 31 dias");
				}
			}
		
		
		}
	

