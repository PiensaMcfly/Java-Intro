package ejercicio15;
import java.util.Scanner;

public class Ejercicio15 {
//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
//numero y si se encuentra repetido
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero a buscar en el vector");
        int numb = leer.nextInt();
        
        funcion(numb);
    }
    
    public static int funcion(int numb){
        int [] vector = new int [5];
        int contador=0,posicion=0;
        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 5; i++) {
            if(numb==vector[i]){
                System.out.println("Su numero se encontro en el vector "+posicion);               
            } 
            posicion++;
            if (numb==vector[i]) {
                contador++;
            }
        }   
        if(contador>1){
                System.out.println("Su numero se encontro repetido " +contador + " veces");
             }else if(contador==0){
            System.out.println("Su numero no se encontro");
        }  
        return 0;
    }
    
}
