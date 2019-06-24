package com.ipartek.formacion.uf2216.ejercicios.excepciones;

import java.util.Date;

import org.joda.time.DateTime;

public class Fecha {

	
	
	private int año = 0;
	private int mes = 1;
	private int dia = 1;
	public static final int MESES_AÑO = 12;
	
	public static boolean esBisiesto(int año) {
		boolean bisiesto;
		bisiesto = false;
		if ((año % 4 == 0 && año % 100 != 0 || año % 400 == 0)  ) {
			bisiesto = true;
			
		} return bisiesto;
	}
	public Fecha() {
		
	}
	public Fecha(int año, int mes, int dia) {
		setDia(dia);
		setMes(mes);
		setAño(año);
	}
	public Fecha(Fecha f) {
		Date hoy = new Date();
		DateTime dt = new DateTime(hoy);
		setAño(dt.getYear());
		setMes(dt.getMonthOfYear());
		setDia(dt.getDayOfMonth());
		
	}
	
	public int getAño() {
		return this.año;
	}
	public void setAño(int año) {
		if (año < 1) {
			throw new FechaException("No se admite ese valor de año");
		}
	}
	public int getMes() {
		return this.mes;
	}
	public void setMes(int mes) {
		if (mes < 0 || mes > 12) {
			throw new FechaException("No se admite ese valor de mes");
		}
	}
	public int getDia() {
		return this.dia;
	}
	public void setDia(int dia) {
		if (dia < 1) {
			throw new FechaException("El día no puede ser inferior a 1", new Throwable("Día incorrecto"));
		}
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31)) {
			throw new FechaException("Error! El día no puede ser mayor de 31", new Throwable("Día incorrecto"));
		}
		if ((mes == 4 || mes == 6 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 30)) {
			throw new FechaException("Erro! El día no puede ser mayor de 30", new Throwable("Día incorrecto"));
		}
		if (esBisiesto(año) && (dia > 29)) {
			throw new FechaException("Error! El dia no puede ser mayor de 29",
					new Throwable("Día incorrecto"));
		}
		if (!esBisiesto(año) && (dia > 28)) {
			throw new FechaException("Error! El dia no puede ser mayor de 28",
					new Throwable("Día incorrecto"));
		}
		this.dia = dia;
	}
	
	public void set(int año, int mes, int dia) {
		setDia(dia);
		setMes(mes);
		setAño(año);
	}
	public void set(Fecha f) {
		DateTime dt = new DateTime(f);
		setAño(dt.getYear());
		setMes(dt.getMonthOfYear());
		setDia(dt.getDayOfMonth());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + año;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (año != other.año)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	@Override
	public String toString() {
		String log = "";
		log = new StringBuffer(log).append(dia).append("/").append(mes).append("/").append(año).toString();
		return log;
	}
	
	
	
	

}
