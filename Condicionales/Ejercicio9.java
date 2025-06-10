package Condicionales;
import java.util.Scanner;

public class Ejercicio9 {
    public void ejercicio9(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        double numero = sc.nextDouble();

        System.out.println("Ingrese que porcentaje desea calcular");
        double porcentaje = sc.nextDouble();

        double resultado = (numero * porcentaje) / 100;

        System.out.printf("El %.2f%% de %.2f es: %.2f\n", porcentaje, numero, resultado);
    }
}
