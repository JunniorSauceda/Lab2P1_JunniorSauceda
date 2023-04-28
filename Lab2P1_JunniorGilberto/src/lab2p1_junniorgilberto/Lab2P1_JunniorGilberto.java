/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_junniorgilberto;
import java.util.Scanner;
/**
 *
 * @author Junnior Sauceda
 */
public class Lab2P1_JunniorGilberto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean seguir=true;
    while(seguir){
        System.out.println("Menu");
        System.out.println("1.-Clasificando numeros");
        System.out.println("2.-Aproximando Pi");
        System.out.println("3.-MCD");
        System.out.println("4.-Salir");
        System.out.println("Ingrese una opcion: ");
        int ejercicio=sc.nextInt();
        switch (ejercicio){
            case 1:
                System.out.println("Ingrese el numero que desea evaluar: ");
                int numero=sc.nextInt();
                while (numero<=0){
                    System.out.println("Porfavor ingrese un numero positivo:");
                    numero=sc.nextInt();
                }
                boolean par=false;
                boolean impar=false;        
                if (numero%2==0){
                    par=true;
                }
                else{
                    impar=true;
                }
                if(par){
                    System.out.print("El numero ingresado es par ");
                }
                if(impar){
                    System.out.print("El numero ingresado es impar ");
                }
                int contador=1;
                int acumulador=0;
                while(contador<=numero){
                    if((numero%contador)==0){
                        acumulador++;
                    }
                    contador++;
                }
                boolean primo=false;
                if(acumulador<=2){
                    primo=true;
                }
                if (primo){
                    System.out.print("y primo");
                }
                System.out.println("");
                break;
            case 2:
                System.out.println("Ingrese la precision del calculo: ");
                numero=sc.nextInt();
                while(numero<=0){
                    System.out.println("Ingrese un numero positivo: ");
                    numero=sc.nextInt();
                }
                double sumatoria=1;
                double numerador=1;
                double denominador=1;
                double resultado=1;
                int limitador=1;
                while (limitador<=numero){
                   numerador=4* (Math.pow(limitador,2));
                   denominador=4*(Math.pow(limitador,2))-1;
                   resultado=resultado*(numerador/denominador);
                   limitador++;
                }
                sumatoria=resultado;
                System.out.println("Pi: "+sumatoria*2);
                break;
            case 3:
               System.out.println("Ingrese A: ");
               int A=sc.nextInt();
               while(A<=0){
                   System.out.println("Ingrese un numero positivo: ");
                   A=sc.nextInt();
               }
                System.out.println("Ingrese B: ");
                int B=sc.nextInt();
                while(B<=0){
                    System.out.println("Ingrese un numero positivo: ");
                    B=sc.nextInt();   
                }
                int respaldoA=A;
                int respaldoB=B;
                while (A!=B){
                    if(A>B){
                        A=A-B;
                    }
                    else{
                        B=B-A;
                    }
                }
                System.out.println("El MCD de "+respaldoA+" y "+respaldoB+" es: "+A);
                break;
            case 4:
                seguir=false;
                break;
        }
                
             
                    
        
        // TODO code application logic here
    }
    
}
}
