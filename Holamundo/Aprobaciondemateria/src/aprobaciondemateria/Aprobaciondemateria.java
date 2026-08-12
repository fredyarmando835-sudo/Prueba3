/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aprobaciondemateria;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Aprobaciondemateria {

    /**
     * 1. Sistema de Aprobación de Materia
Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las
calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".
Requisito estricto: Solo puedes usar una estructura if/else simple
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
        Scanner sc =new Scanner(System.in);
        //Variables
        String NombreEstudiante ="@";
        double Calificacion1examen =0;
        double Calificacion2examen =0;
        
        System.out.println("Ingrese el Nombre del Estudiante");
        NombreEstudiante= sc.nextLine();
        
        System.out.println("Ingrese la nota del primer Examen");
        Calificacion1examen = sc.nextDouble();
        
        System.out.println("Ingrese la nota del segundo Examen");
        Calificacion2examen = sc.nextDouble();
        
        double Promedio=0;
        Promedio= (Calificacion1examen + Calificacion2examen)/2;
        System.out.printf("El promedio es igual a %.2f",Promedio);
        
        if (Promedio >=65){
            System.out.println("\nAprobado");
    }//Fin de If
        else {
            System.out.println("\nReprobado");
        }
            
    
        
        
    }//fin de Main
    
}// fin de Class
  