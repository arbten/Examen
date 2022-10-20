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
public class EJERCICIO2P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom, ie, op;
        int t, nie, ct, cf;
        double pt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nom = scanner.next();
        System.out.println("Ingrese el tamaño de pizza que desee: (10 pulgadas es pequeña, "
                + "12 pulgadas es mediana, 16 pulgadas es grande)");
        t = scanner.nextInt();
        System.out.println("Ingrese si desea ingredientes extras: (Cada ingrediente extra tiene un costo de 2 soles)");
        op = scanner.next();
        switch (op) {
            case "si":
            case "SI":
                System.out.println("Ingrese el numero de ingredientes extras que desee y los nombres de estos: ");
                nie = scanner.nextInt();
                ie = scanner.next();
                ct = 12 + t + (nie * 2);
                pt = 1.5 * ct;
                System.out.println(nom + " su pizza con " + nie + " ingredientes extras que son: " + ie + " cuesta: " + pt);
                break;
            default:
                ct = 12 + t;
                pt = 1.5 * ct;
                System.out.println(nom + " su pizza cuesta: " + pt);

        }

    }
}
