
package ejercicio15;
import java.util.Scanner;

public class ejercicio17 {
    
//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
//de 2 dígitos, etcétera (hasta 5 dígitos).
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        funcion();
    }
    public static int funcion(){
        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        int [] vector = new int [10];
        for (int i = 0; i < 10; i++) {
            vector[i]=(int)(Math.random() * 99999);
        
        if(vector[i]<10){
            cont1++;
        }else if(vector[i]>9 && vector[i]<100){
            cont2++;
        }else if(vector[i]>99 && vector[i]<1000){
            cont3++;
        }else if(vector[i]>999 && vector[i]<10000){
            cont4++;
        }else if(vector[i]>9999){
            cont5++;
        }

       }
        
        if(cont1>0){
            System.out.println("Se encontro "+cont1+" numeros de 1 digito");
        }else if(cont1==0){
            System.out.println("Su contador de 1 digito no contiene num");
        }
        
        if(cont2>0){
            System.out.println("Se encontro "+cont2+" numeros de 2 digitos");
        }else if(cont2==0){
            System.out.println("Su contador de 2 digitos no contiene num");
        }
        
        if(cont3>0){
            System.out.println("Se encontro "+cont3+" numeros de 3 digitos");
        }else if(cont3==0){
            System.out.println("Su contador de 3 digitos no contiene num");
        }
        
        if(cont4>0){
            System.out.println("Se encontro "+cont4+" numeros de 4 digitos");
        }else if(cont4==0){
            System.out.println("Su contador de 4 digitos no contiene num");
        }
        
        if(cont5>0){
            System.out.println("Se encontro "+cont5+" numeros de 5 digitos");
        }else if(cont5==0){
            System.out.println("Su contador de 5 digitos no contiene num");
        }
        
        return 0;
    }
}
