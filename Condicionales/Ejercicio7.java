package Condicionales;
import java.util.Scanner;

public class Ejercicio7 {
    public void ejercicio7(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");

        double precio = sc.nextDouble();
        double iva = precio * 0.19;

        double precioFinal = precio + iva;

        System.out.printf("El precio del producto es: %.2f\n", precio);
        System.out.printf("El IVA del producto es: %.2f\n", iva);
        System.out.printf("El precio final del producto es: %.2f\n", precioFinal);
    }
}
