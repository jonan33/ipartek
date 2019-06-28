package com.ipartek.formacion.uf2216.ejercicios.global.excepciones;

public class IdException extends RuntimeException {

/**
	 * 
	 */
	private static final long serialVersionUID = 3158582525952562305L;
public IdException() {
	
}

public IdException(String message) {
	super(message);
}

public IdException(String message, Throwable cause) {
	super(message, cause);
	
}
public IdException(Throwable cause) {
	super(cause);
}

}
