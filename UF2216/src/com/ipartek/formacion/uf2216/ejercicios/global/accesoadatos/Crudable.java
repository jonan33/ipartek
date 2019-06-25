package com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public interface Crudable<T> {
	public Iterable<T> obtenerTodos();
	public T obtenerPorId();
	
	public void insertar(T objeto);
	public void modificar(T objeto);
	public void borrar();
	public void listar();
	public void salir();
	public void guardar();
	public void añadir();
//	public void cargar();
//	public void importar();
	public void exportar();
	 
}
