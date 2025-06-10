package Condicionales;
import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del cubo");

        double lado = sc.nextDouble();

        double volumen = Math.pow(lado, 3);

        System.out.printf("El volumen del cubo es: %.2f\n", volumen);
    }
}
