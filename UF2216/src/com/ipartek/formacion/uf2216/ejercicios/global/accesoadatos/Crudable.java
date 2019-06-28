package com.ipartek.formacion.uf2216.ejercicios.global.accesoadatos;

import java.io.IOException;

public interface Crudable<T> {
	public Iterable<T> obtenerTodos();
	public T obtenerPorId(int id);
	
	public void insertar(T objeto);
	public void modificar(T objeto);
	public void borrar();
	public void listar();
	public void salir();
	public void añadir();
	public void importar() throws IOException;
	public void exportar();
	 
}