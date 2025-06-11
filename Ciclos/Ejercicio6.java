package Ciclos;

import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el final del rango: ");
        int finalRango = sc.nextInt();
        int suma = 0;

        for(int i = 1; i<=finalRango; i++){
            suma+=i;
        }

        System.out.printf("El resultado de la suma de los números del 1 al %d es: %d%n", finalRango, suma);
    }
}
