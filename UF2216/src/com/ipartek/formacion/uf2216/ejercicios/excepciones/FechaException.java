package com.ipartek.formacion.uf2216.ejercicios.excepciones;

public class FechaException extends RuntimeException
{
/**
	 * 
	 */
	private static final long serialVersionUID = 4732876786321584481L;
public FechaException() {
	
}
public FechaException(String message) {
	super(message);
}
public FechaException(String message, Throwable cause) {
	super(message, cause);
	
}
public FechaException(Throwable cause) {
	super(cause);
}
}
