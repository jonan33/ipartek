package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjerciciosFicheros {
	public static void main(String[] args) throws IOException {
		String texto = "";
		
		FileWriter fw = new FileWriter("C:\\Trabajos\\datos.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca texto: ");
			texto = sc.nextLine();
			pw.println(texto);
		} while (!texto.equalsIgnoreCase("FIN"));
		
		pw.close();
		fw.close();
		
	}
	
	public void mainLectura(String[] args) throws IOException {
		
		FileReader fr = null;
		fr = new FileReader("C:\\Trabajos\\datos.txt");
		BufferedReader entrada = new BufferedReader(fr);
		
		
	}

}
