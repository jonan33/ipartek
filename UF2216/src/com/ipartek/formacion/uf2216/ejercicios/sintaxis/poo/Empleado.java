package com.ipartek.formacion.uf2216.ejercicios.sintaxis.poo;

import java.util.Scanner;

public class Empleado {
	final static int MAXIMO_EMPLEADOS = 20;
	static Empleado[] empleados = new Empleado[MAXIMO_EMPLEADOS];
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		double importe;
		Empleado e;
		
		
		
	}
	
	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horasExtra;
	private double irpf;
	private boolean casado;
	private int hijos;
	private static double importeHoraExtra;
	
	public Empleado() {
		
	}
	public Empleado(String nif) {
		this.nif = nif;
	}
	
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}
	public double CalcularComplemento() {
		double complemento = importeHoraExtra * horasExtra;		
		return complemento;
	}
	public double CalcularSueldoBruto() {
		double sueldoBruto = sueldoBase + CalcularComplemento();
		return sueldoBruto;
	}
	public double CalcularRetencion() {
		double retencion = irpf;
		if (casado == true) {
			retencion = retencion - 2;
			} 
		retencion = retencion - hijos;
		return CalcularSueldoBruto() * retencion / 100;
	}
	public double CalcularSueldoNeto() {
		return CalcularSueldoBruto() - CalcularRetencion();
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
        sb.append("\nNif: ");
        sb.append(nif);
        sb.append("\nSueldo Base: ");
        sb.append(sueldoBase);
        sb.append("\nHoras Extras: ");
        sb.append(horasExtra);
        sb.append("\ntipo IRPF: ");
        sb.append(irpf);
        sb.append("\nCasado: ");
        sb.append(casado);
        sb.append("\nNúmero de Hijos: ");
        sb.append(hijos);
        return  sb.toString();
		
	}

}
