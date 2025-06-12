package Ciclos;

import java.util.Scanner;

public class Ejercicio10 {
    public void ejercicio10() {
        Scanner sc = new Scanner(System.in);

        double suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Ingrese el numero %d: ", i);
            double numero = sc.nextDouble();
            suma += numero;
        }

        double promedio = (double) suma / 10;
        System.out.printf("La suma de los numeros es: %.2f%n", suma);
        System.out.printf("El promedio de los numeros es: %.2f%n", promedio);
    }
}
