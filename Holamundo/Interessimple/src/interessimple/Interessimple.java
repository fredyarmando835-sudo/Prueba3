/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Interessimple {

    /**
     * @param args the command line arguments
     */
    /*
    3. Interés simple Escriba un programa que calcule el interés simple de un préstamo. El sistema 
    debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo 
    en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado. 
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Declaracion de Variables
        
        double capital = 0;
        int tasa =0;
        int tiempo =0;
        double interes = 0;
        String tasaTexto = "";
        
        System.out.println("Coloque el capital inicial:");
        capital = input.nextDouble();
        
        
        System.out.println("Coloque la tasa de interes anual:");
        tasaTexto = input.next();
        
        if (tasaTexto.contains(".")){
            System.out.println(" Error ingrese la tasa como numero entero");
        }
            
        else {
            tasa = Integer.parseInt(tasaTexto);
        System.out.println("Coloque el tiempo en años");
        tiempo = input.nextInt();
        
        interes = (capital * tasa * tiempo) / 100;
        System.out.printf("El resultado del interes es %.2f",interes);
        
        }
  
        
    }//Fin de Main
    
}//Fin de Class