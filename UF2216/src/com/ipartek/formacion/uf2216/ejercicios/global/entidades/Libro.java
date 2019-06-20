package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Libro {
	
	private String isbn;
	private String editorial;
	private String autor;
	private String descripcion;
	private String genero;
	private int edicion;
	private boolean IsBorrado;
	private long id;
	private String titulo;
	
	
	
	public Libro(long id, String titulo, String isbn, String editorial, String autor, String descripcion, String genero, int edicion, boolean IsBorrado) {
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

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + ", descripcion=" + descripcion
				+ ", genero=" + genero + ", edicion=" + edicion + ", IsBorrado=" + IsBorrado + ", id=" + id + ", titulo=" + titulo + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	}

