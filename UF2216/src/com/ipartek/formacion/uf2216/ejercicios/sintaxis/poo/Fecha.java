package com.ipartek.formacion.uf2216.ejercicios.sintaxis.poo;

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int d, m, a;

	        //Se pide por teclado el dia, mes y año
	        System.out.println("Introduce fecha: ");
	        System.out.print("dia: ");
	        d = sc.nextInt();
	        System.out.print("mes: ");
	        m = sc.nextInt();
	        System.out.print("año: ");
	        a = sc.nextInt();

	        //Se crea un objeto Fecha utilizando el consructor con parámetros
	        Fecha fecha = new Fecha(d,m,a);

	        if (fecha.fechaCorrecta()) { //si la fecha es correcta

	           //Se muestra utilizando el método toString()
	            System.out.println("Fecha introducida: " + fecha);

	            //Se muestran los 10 días siguientes utilizando el método diaSiguiente()
	            System.out.println("Los 10 días siguientes son:");
	            for (int i = 1; i <= 10; i++) {
	                fecha.diaSiguiente();
	                System.out.println(fecha);
	            }

	        } else { //Si la fecha no es correcta
	            System.out.println("Fecha no valida");
	        }

	}
	
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha() {
		
	}
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anyoCorrecto;
		diaCorrecto = false;
		mesCorrecto = false;
		anyoCorrecto = false;
		if (anyo > 0) {
			anyoCorrecto = true;
		} 
		if (mes > 0 && mes < 13) {
			mesCorrecto = true;
		}
		switch (mes) {
		case 2: 
			if (esBisiesto()) {
				if (dia > 0 && dia < 29) {
					diaCorrecto = true;
				} else {
					diaCorrecto = false;
				}
			} break;
		case 4:
		case 6: 
		case 9:
		case 11:
			if (dia > 0 && dia < 31) {
				diaCorrecto = true;
			} break;
		default :
			if (dia > 0 && dia < 32) {
				diaCorrecto = true;
			}
		}
		
		
		return diaCorrecto && mesCorrecto && anyoCorrecto;
	}
	
	public boolean esBisiesto() {
		boolean bisiesto = false;
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
			bisiesto = true;
		} return bisiesto;
	}
	
	public void diaSiguiente() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
		} if (!fechaCorrecta()) {
			mes = 1;
			anyo++;	
		}
	}

	@Override
	public String toString() {StringBuilder sb = new StringBuilder();
    if (dia < 10) {
        sb.append("0");
    }
    sb.append(dia);
    sb.append("-");
    if (mes < 10) {
        sb.append("0");
    }
    sb.append(mes);
    sb.append("-");
    sb.append(anyo);
    return sb.toString();
	}
	

}
