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
public class EJERCICIO4P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n, c;
        double p, pt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        n = scanner.next();
        System.out.println("Ingrese su total a pagar: ");
        p = scanner.nextDouble();
        System.out.println("Ingrese el color de la bolita: ");
        c = scanner.next().toUpperCase();
        switch (c) {
            case "BLANCO":
                System.out.println(n + " usted no tiene descuento, su total a pagar es: " + p);
                break;
            case "AMARILLO":
                pt = p - (p * 0.25);
                System.out.println(n + " su descuento es del 25%, su total a pagar es: " + pt);
            case "ROJO":
                pt = p - (p * 0.40);
                System.out.println(n + " su descuento es del 40%, su total a pagar es: " + pt);
        }

    }
}
