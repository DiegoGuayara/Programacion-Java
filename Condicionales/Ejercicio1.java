package Condicionales;
import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuantos años tiene");
        int edad = sc.nextInt();

        System.out.println("Ingrese cuantos años quiere sumar");
        int suma = sc.nextInt();

        int resultado = edad + suma;

        System.out.printf("Usted tiene %d años y en %d años va a tener %d años\n", edad, suma, resultado);
    }
}