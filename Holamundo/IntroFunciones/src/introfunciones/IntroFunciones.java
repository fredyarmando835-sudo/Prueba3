/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introfunciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class IntroFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner scan = new Scanner(System.in);
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        double promedio = 0;
        String estadoMateria = "John Doe";
        String nombreMateria = "John Doe";
        String nombreEstudiante = "John Doe";

        //1ra Funcion
        MensajeBienvenida();//Llamado de la Funcion

        //2da Funcion 
        System.out.print("Nombre Estudiante: ");
        nombreEstudiante = CapitalizacionNombre(scan);
            
        System.out.print("Nombre Materia: ");
        nombreMateria = CapitalizacionNombre(scan);
      

        System.out.printf("Materia: %s\tNota1: ", nombreMateria);
        nota1 = scan.nextInt();
        System.out.printf("Materia: %s\tNota2: ", nombreMateria);
        nota2 = scan.nextInt();
        System.out.printf("Materia: %s\tNota3: ", nombreMateria);
        nota3 = scan.nextInt();
        nota3 = ValidacionNota(nota3);//Llamado a la Funcion

        promedio = (nota1 + nota2 + nota3) / 3.0;

        if (promedio >= 65) {
            estadoMateria = "Aprobado";
        } else {
            estadoMateria = "Reprobado";
        }

        System.out.printf("Resultados de %s", nombreEstudiante);
        System.out.printf("\nMateria: %s", nombreMateria);
        System.out.printf("\nNota1: %d", nota1);
        System.out.printf("\nNota2: %d", nota2);
        System.out.printf("\nNota3: %d", nota3);
        System.out.printf("\nPromedio: %.2f", promedio);
        System.out.printf("\nEstado: %s", estadoMateria);
        
    } // Fin de Main

        /*
        *Funcion de Bienvenida al Algoritmo
        *Sin parametros de Trabajo
        *Sin Datos de Retorno
        */
        public static void MensajeBienvenida(){ //Se creo la funcion sin parametro y sin retorno(Void)
            System.out.println("Boleta de Calificaciones");
        }//Fin de la Funcion MensajeBienvenida

        public static String CapitalizacionNombre(Scanner sc){ //Aqui se creo la funcion con parametro String y con retorno.
            String nombreTratado = "Jonh Doe";
            
            nombreTratado = sc.next().toUpperCase();

            return nombreTratado; //Cuando es un String ,int, double, boolean etc, usamos esto.
        }//Fin Funcion CapitalizacionNombre

    public static int ValidacionNota(int resultadoNota){
        int notaValida = resultadoNota;
        final int LIM_INF = 0;
        final int LIM_SUP = 100;
        Scanner input = new Scanner(System.in);
       
        do{
            if(notaValida<0 ||notaValida>100){
                System.out.println("Nota No Valida");
                System.out.println("Tiene que estar entre 0 y 100");
                System.out.println("Ingrese Nuevamente");
                notaValida = input.nextInt();      
        }
            else {
                System.out.println("Nota Valida para Sistema");
            }
        
        }while(notaValida<LIM_INF || notaValida>LIM_SUP);
        
        
        return notaValida;
        }//Fin de funcion ValidacioNota
    
}//Fin de Class
