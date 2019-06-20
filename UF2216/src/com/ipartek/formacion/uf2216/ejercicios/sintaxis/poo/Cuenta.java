package com.ipartek.formacion.uf2216.ejercicios.sintaxis.poo;

import java.util.Scanner;

public class Cuenta {
	//CUENTA BANCARIA
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe;

		
		Cuenta cuenta1 = new Cuenta();

		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();

		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);

		
		Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

		
		Cuenta cuenta3 = new Cuenta(cuenta1);

		
		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getNombre());
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println();
		       
		
		cuenta1.ingreso(4000);
		       
		
		System.out.println("Saldo: " + cuenta1.getSaldo());
		       
		
		System.out.println("Datos de la cuenta 2");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();
		       
		
		System.out.println("Datos de la cuenta 3");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();
		       
		
		cuenta3.transferencia(cuenta2, 10);
		       
		
		System.out.println("Saldo de la cuenta 2");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();
		       
		
		System.out.println("Saldo de la cuenta 3");
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();

	}
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	public Cuenta() {
		
	}
	
	public Cuenta(String nombre, String numcuenta, double interes, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numcuenta;
		this.tipoInteres = interes;
		this.saldo = saldo;
	}
	
	public Cuenta(final Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numcuenta) {
		this.numeroCuenta = numcuenta;
	}
	public double getTipoInteres() {
		return tipoInteres;
	}
	public void setTipoInteres(double interes) {
		this.tipoInteres = tipoInteres;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;
		if (n < 0) {
			ingresoCorrecto = false;
		} else {
			saldo = saldo + n;
		}
		return ingresoCorrecto;
	}
	public boolean reintegro(double n) {
		boolean reintegroCorrecto = true;
		if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto; 
	}
	
	public boolean transferencia(Cuenta c, double n) {
		boolean transferenciaCorrecta = true;
		if (n < 0) {
			transferenciaCorrecta = false;
		} else if (saldo <= n) {
			reintegro(n);
			c.ingreso(n);
		} else {
			transferenciaCorrecta = false;
		}
		return transferenciaCorrecta;	
	}
}
