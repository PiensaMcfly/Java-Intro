/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ejercicio21extra {
static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//      Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
//adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
//desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
//prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
//programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
//desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
//igual al 7 de sus notas del curso
     int desaprobado=0, aprobado=0;
     double[] notas= new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Se solicitan las notas del alumno:"+(i+1));
            System.out.println("Primer trabajo práctico evaluativo");
            int n1=leer.nextInt();
            System.out.println("Segundo trabajo práctico evaluativo");
            int n2=leer.nextInt();
            System.out.println("Primer Integrador");
            int n3=leer.nextInt();
            System.out.println("Segundo integrador");
            int n4=leer.nextInt();
            notas[i]=(n1*0.1+n2*0.15+n3*0.25+n4*0.5);
            if(notas[i]>=7){
                aprobado++;
            }
            else{
                desaprobado++;
            }
        }
        System.out.println("Cantidad de aprobados: "+aprobado);
        System.out.println("Cantidad de desaprobados: "+ desaprobado);
                
        

    }
    
}
