package Ciclos;

import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el final del rango: ");
        int finalRango = sc.nextInt();

        int i = 1;

        while (i <= finalRango) {
            System.out.println(i);
            i++;
        }

    }
}
