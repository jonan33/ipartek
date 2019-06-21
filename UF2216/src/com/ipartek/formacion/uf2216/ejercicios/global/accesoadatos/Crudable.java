package com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public interface Crudable<T> {
	public Iterable<T> obtenerTodos();
	public T obtenerPorId();
	
	public void insertar(T objeto);
	public void modificar(T objeto);
	public void borrar(T objeto);
	public void borrar(long id);
	public void listar();
	public void guardar();
	public void cargar();
	public void importar();
	public void exportar();
	public void salir();
	 
}
