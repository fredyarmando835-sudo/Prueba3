/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulaciondetrayactoria;

import java.util.Scanner;

/**
 *
 * @author Fredy 
 */
public class Simulaciondetrayactoria {

    /**
     * Simulación de Trayectoria Balística (Uso estricto de for) 
Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la 
velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula 
correspondiente a la trayectoria. 
• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente 
entre 1 y 89 grados. 
• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del 
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el 
segundo 𝑡 = 10. 
• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el 
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser 
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe 
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática. 
* \
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables de entrada y calculo
        double velocidadInicial = 0;
        double anguloGrados = 0;
        double anguloRadianes = 0;
        double altura = 0;
        double alturaMaxima = 0;
        int segundoAlturaMaxima = 0;

        // Constantes fisicas
        final double GRAVEDAD = 9.81;

       

        // Validación de Velocidad Inicial (debe ser mayor a 0)
        do {
            System.out.print("Ingrese la velocidad inicial (m/s): ");
            velocidadInicial = input.nextDouble();
            if (velocidadInicial <= 0) {
                System.out.println("Error, La velocidad inicial debe ser mayor a 0.");
            }
        } while (velocidadInicial <= 0);

        // Validación de Angulo ( entre 1 y 89 grados)
        do {
            System.out.print("Ingrese el angulo de lanzamiento (grados entre 1 y 89): ");
            anguloGrados = input.nextDouble();
            if (anguloGrados < 1 || anguloGrados > 89) {
                System.out.println("--> ERROR: El angulo debe estar estrictamente entre 1 y 89 grados.");
            }
        } while (anguloGrados < 1 || anguloGrados > 89);

        // Conversion del angulo a radianes para las funciones de Java Math
        anguloRadianes = Math.toRadians(anguloGrados);



        // Uso estricto del ciclo FOR desde t = 1 hasta t = 10
        for (int t = 1; t <= 10; t++) {

            // Formula de posicion vertical: y(t) = v0 * sin(angulo) * t - (0.5 * g * t^2)
            altura = (velocidadInicial * Math.sin(anguloRadianes) * t) - (0.5 * GRAVEDAD * Math.pow(t, 2));
            

            // Evaluacion de impacto (altura menor a 0)
            if (altura <= 0) {
                System.out.printf("Segundo %d: El proyectil impacto en el suelo (Altura negativa detectada).\n", t);
                System.out.println("--> Fin de la simulacion por impacto.");
                break; // Rompe el ciclo FOR inmediatamente al caer
            } else {
                System.out.printf("Segundo %d: Altura = %.2f metros\n", t, altura);

                // Seguimiento de la altura maxima alcanzada
                if (altura > alturaMaxima) {
                    alturaMaxima = altura;
                    segundoAlturaMaxima = t;
                }
            }
        }

  
        if (alturaMaxima > 0) {
            System.out.printf("Altura maxima estimada: %.2f metros (Alcanzada en el segundo %d)\n", alturaMaxima, segundoAlturaMaxima);
        } else {
            System.out.println("El proyectil impacto antes de registrar una altura positiva.");
        }
    }//Fin de Main
    
}//Fin de Class
