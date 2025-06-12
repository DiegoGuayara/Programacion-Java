package Ciclos;

import java.util.Scanner;

public class Ejercicio11 {
    public void ejercicio11() {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double numero;

        System.out.println("Ingrese numeros (Ingrese 0 para salir)");

        while (true) {
            System.out.print("> ");
            numero = sc.nextDouble();

            if (numero == 0) {
                break;
            }

            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.printf("La suma de los numeros es: %.2f%n", suma);
            System.out.printf("El promedio de los numeros es: %.2f%n", promedio);
        } else {
            System.out.println("No se ingresaron numeros para calcular el promedio.");
        }
    }
}
