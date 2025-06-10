package Condicionales;
import java.util.Scanner;

public class Ejercicio14 {
    public void ejercicio14(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el comienzo del rango de numeros aleatorios:");
        int inicio = sc.nextInt();

        System.out.println("Ingrese el final del rango de numeros aleatorios:");
        int fin = sc.nextInt();

        if (inicio >= fin) {
            System.out.println("El comienzo del rango debe ser menor que el final.");
            return;
        }

        int numeroAleatorio = (int) (Math.random() * (fin - inicio + 1)) + inicio;
        System.out.printf("El numero aleatorio generado entre %d y %d es: %d%n", inicio, fin, numeroAleatorio);
    }
}
