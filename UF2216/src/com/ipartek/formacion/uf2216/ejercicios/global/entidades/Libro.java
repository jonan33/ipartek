package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Libro {
	
	private int isbn;
	private String editorial;
	private String autor;
	private String descripcion;
	private String genero;
	private int edicion;
	private boolean IsBorrado;
	private int id;
	private String titulo;
	
	
	public Libro() {
		super();
	}
	public Libro(int id, String titulo, int isbn, String editorial, String autor, String descripcion, String genero, int edicion, boolean IsBorrado) {
		super();
		this.titulo = titulo;
		this.id = id;
		this.isbn = isbn;
		this.editorial = editorial;
		this.autor = autor;
		this.descripcion = descripcion;
		this.genero = genero;
		this.edicion = edicion;
		this.IsBorrado = IsBorrado;
		
	}
	
	

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int i) {
		this.isbn = i;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public boolean isIsBorrado() {
		return IsBorrado;
	}
	public void setIsBorrado(boolean isBorrado) {
		IsBorrado = isBorrado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + ", descripcion=" + descripcion
				+ ", genero=" + genero + ", edicion=" + edicion + ", IsBorrado=" + IsBorrado + ", id=" + id + ", titulo=" + titulo + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	}

