package Condicionales;
import java.util.Scanner;

public class Ejercicio12 {
    public void ejercicio12(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Fahrenheit:");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("La temperatura en grados Celsius es: %.2f°C%n", celsius);
    }
}
