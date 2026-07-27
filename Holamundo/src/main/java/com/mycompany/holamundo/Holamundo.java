/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.holamundo;

/**
 *
 * @author Fredy Gonzalez 
 */

public class Holamundo {
    
    // Comentario de una sola linea 
    //Esto tambien debe de ser un comentario 
    /*
    pleca Asterisco -> para abrir bloque 
    Asterisco Pleca -> Para cerar bloque
    Todo lo que esta entre ello, se toma como comentario.
    */
    
    /**
     * 
     * @param args the comand line arguments
     */
    public static void main(String[] args) {
       //TODO code application logic hare 
       // Sensible a Mayusculas y Minusculas
      /*
       Objetivo 
       1. Imprimir en la pantalla
          a. Diferentes formas para poder imprimir la pantalla 
          b. Caracteres de escape 
       2. Catura de Datos parte del usuario.
       */
      
      System.out.println("Hola...como estas");
      System.out.println("Este es mi prime programa");
      System.out.println("Yujuu...estoy con Java");
      
        System.out.print("Fredy Gonzalez");
        System.out.print("Soy el Progra");
        System.out.print("Mucho gusto");
        
        System.out.println("");
        System.out.printf("Esta es la clase de %S \n ","Programacion");
      //  System.out.println("");
        
        System.out.printf("Esta es %S la clase de \n","Programacion");
        //System.out.println("");
        
        System.out.printf("%S Esta es la clase de \n","Programacion");
       // System.out.println("");
        
        System.out.printf("Hola \n como \n estas \n en la clase de %s\n?" , "Programacion");
        System.out.printf("Hola \t como \t estas \t en la clase de %s\t?" , "Programacion");
        
        //Variables
        int tiempo; //Tipo Entero
        double promedio; //Tipo Decimel
        String nombre; //Tipo Cadena
        char inicial; //Tipo Caracter -> letra, dgitoNumerico, simbolo Especial
        boolean estado;//Tipo Booleano -> true (verdadera) / false (falso)
        
        tiempo= 3;
        nombre = "Fredy";
        inicial = 'A' ;
        
        System.out.printf("Tu nombre: %s \n",nombre);
        System.out.printf("%d Cuantas veces a la semana recibes la clese\n",tiempo);
        System.out.printf("Te llamare %c inicial",inicial);
        
    }// Fin de la funcio MAIN
}// Fin de la funcion Hola mundo
