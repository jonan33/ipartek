package com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos;

public interface Crudable<T> {
	public Iterable<T> obtenerTodos();
	public T obtenerPorId();
	
	public void insertar(T objeto);
	public void modificar(T objeto);
	public void borrar(T objeto);
	public void borrar(long id);
	 
}
