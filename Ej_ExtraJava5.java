/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro;

import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class Ej_ExtraJava5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
//los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//real que represente el costo del tratamiento (previo al descuento) y determine el
//importe en efectivo a pagar por dicho socio.

Scanner leer = new Scanner (System.in);
String socio;
double monto;
        System.out.println("Ingrese el tipo de socio: A, B o C: ");
        
        socio = leer.nextLine();
        
        System.out.println("Ingrese el valor del tratamiento: ");
        
        monto = leer.nextDouble();
        
       switch (socio){
           case "A":
               System.out.println("El imorte a abonar es de: "+monto*0.5);
               break;
           case "B":
               System.out.println("El importe a abonar es de "+monto*0.65);
               break;
           case "C": 
               System.out.println("El importe a abonar es de "+monto);
               break;         
       }
    }
    
}
