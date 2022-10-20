/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem6;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EJERCICIO5P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String n;
    int nc, op, e;
    double p, suma=0;
    p=15;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese su nombre: ");
    n = scanner.next();
    System.out.println("Ingrese el número de boletos que desea comprar: ");
    op = scanner.nextInt();
    for(int i=1 ; i<= op; i++){
        System.out.println("Ingrese edad: ");
        e = scanner.nextInt();
        if (e<5) {
            System.out.println("No está permitido el ingreso a niños menores de 5 años al teatro");
        }else if( e>=5 && e<=14){
            System.out.println("Tiene un descuento del 35%");
            p=15*0.35;
            suma=suma+p;
        }else if ( e>=15 && e<=19){
            System.out.println("Tiene un descuento del 25%");
            p=15*0.25;
            suma=suma+p;
        }else if ( e>=20 && e<=45){
            System.out.println("Tiene un descuento del 10%");
            p=15*0.10;
            suma=suma+p;
        }else if ( e>=46 && e<=65){
            System.out.println("Tiene un descuento del 25%");
            p=15*0.25;
            suma=suma+p;
        }else if ( e>=15 && e<=19){
            System.out.println("Tiene un descuento del 25%");
            p=15*0.25;
            suma=suma+p;
        }else if (e<=66){
            System.out.println("Tiene un descuento del 35%");
            p=15*0.35;
            suma=suma+p;
            
    }
    }
        System.out.println(n+" su total a pagar es: "+suma);    
}
}
