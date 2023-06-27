/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejercicio.pkg16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese un numero para dimensionar vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);

        }
        System.out.println("ingrese un numero a buscar");
        int numero = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                contador++;
                System.out.println("su numero se encuentra en la posicion " + i);
            }

        }
     System.out.println(" y se repitió "+contador+ " veces");    
    }

}
