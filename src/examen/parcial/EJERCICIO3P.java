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
public class EJERCICIO3P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom, op = "";
        int ht, he, s;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese su nombre");
            nom = scanner.next();
            System.out.println("Ingrese el numero de horas trabajadas: ");
            ht = scanner.nextInt();
            if (ht > 35) {
                he = ht - 35;
                s = (35 * 15) + he * 22;
                System.out.println(nom + " su salario semanal es: " + s);
            } else {
                he = 0;
                s = ht * 15 + he * 22;
                System.out.println(nom + " su salario semanal es: " + s);
            }
            System.out.println("¿Desea continuar?");
            op = scanner.next();
        } while (op != "si");

    }
}
