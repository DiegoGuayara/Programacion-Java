package Ciclos;

import java.util.Scanner;

public class Ejercicio9 {
    public void ejercicio9() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quiere salir del programa? (S/N)");
        String respuesta = sc.nextLine().toUpperCase();
        while (!respuesta.equals("S")) {
            System.out.println("Quiere salir del programa? (S/N)");
            respuesta = sc.nextLine().toUpperCase();
        }
    }
}
