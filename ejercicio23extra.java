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
public class ejercicio23extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
   //que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
//20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
//será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
//rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
//por pantalla la sopa de letras creada. 
//Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
//de Java substring(), Length() y Math.random(). String numCadena = String.valueOf(numEntero) 
    Scanner leer = new Scanner(System.in);
    
    String [][] matriz = new String [20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j]="*";
            }
            
        }
    int cant =0;
        while (cant<10){
            System.out.print("Ingresa uan palabra de 3 a 5 caracteres: ");
            String palabra=leer.nextLine();
            if(palabra.length()<6 && palabra.length()>2){
                
                cant++;
                insertarMatriz(matriz,palabra);
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(matriz[i][j].equals("*")){
                    matriz[i][j]=String.valueOf((int)(Math.random()*10));
                }
                System.out.print(matriz[i][j]+" ");    
                 }
                System.out.println("");    
            }
        
    }      
    
    public static void insertarMatriz(String [][] matriz, String palabra){
        int fila, columna;
        boolean ocupado=false;    
            do{           
            fila= (int) (Math.random()*19);
            columna=  (int) (Math.random()*(19- palabra.length()));
                for (int i = columna; i <= columna + palabra.length(); i++) {
                    if(matriz[fila][i].equals("*")){
                        ocupado=false;
                        continue;
                    }
                    else{
                        ocupado=true;
                        break;
                    }
                    } 
                
                if (ocupado==false){
                    int pos=0;
                    for (int i = columna; i <(columna + palabra.length()); i++) {
                        matriz[fila][i]=palabra.substring(pos,pos+1 );
                        
                        pos+=1;                       
                    }                             
                }
            
             }while(ocupado==true) ; 
    }       
    
}
