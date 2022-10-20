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
public class EJERCICIO1P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n;
        int vt;
        double vc;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese su nombre: ");
            n = scanner.next();
            System.out.println(n + " Ingrese el numero de sus ventas totales");
            vt = scanner.nextInt();
            if (vt < 1000000) {
                System.out.println("NO HAY COMISIÓN");
            } else if (1000000 <= vt && vt < 3000000) {
                vc = vt * 0.03;
                System.out.println("Su comisión es del 3%: " + vc);
            } else if (3000000 <= vt && vt < 5000000) {
                vc = vt * 0.04;
                System.out.println("Su comisión es del 4%: " + vc);
            } else if (5000000 <= vt && vt < 7000000) {
                vc = vt * 0.05;
                System.out.println("Su comisión es del 5%: " + vc);
            } else if (7000000 <= vt) {
                vc = vt * 0.06;
                System.out.println("Su comisión es del 6%: " + vc);
            }
        }
    }
}
