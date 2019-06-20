package com.ipartek.formacion.uf2216.ejercicios.sintaxis;

import java.io.IOException;

public class EjerciciosEstructuraCondicional45 {

	public static void main(String[] args) throws IOException {
		
		//CARACTERES SON IGUALES
        char car1, car2;
        car2 = 'p';
        System.out.print("Introduzca primer carácter: ");
        car1 = (char)System.in.read(); 
        System.in.read();  
        System.out.print("Introduzca segundo carácter: ");
        car2 = (char)System.in.read(); 
        Character c1 = new Character(car1);
        Character c2 = new Character(car2);
        if(c1.equals(c2))  
            System.out.println("Son iguales");   
        else
            System.out.println("No son iguales");
        
        //LOS CARACTERS SON MINUSCULAS O MAYUSCULAS
        char x, y;
        x = 'a';
        y = 'b';
    	System.out.println("Introduzca el primer caracter: ");
    	c1 = (char)System.in.read();
    	System.out.println("Introduzca el segundo caracter: ");
    	c2 = (char)System.in.read();
    	 if(Character.isLowerCase(x)){ 
             if(Character.isLowerCase(y))
                 System.out.println("Los dos son letras minúsculas");
             else
                 System.out.println("El primero es una letra minúscula pero el segundo no");
          }
          else{
              if(Character.isLowerCase(y))
                 System.out.println("El segundo es una letra minúscula pero el primero no");
             else
                 System.out.println("Ninguno es una letra minúscula");
    	
          }  
		
	}
}
