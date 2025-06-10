package Condicionales;
import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el precio del electrodoméstico
        System.out.print("Ingrese el precio del electrodoméstico: ");
        double precio = scanner.nextDouble();

        // Solicitar el plazo en meses
        System.out.print("Ingrese el plazo en meses para pagarlo a crédito: ");
        int meses = scanner.nextInt();

        // Calcular el valor total con el aumento del 5% por cada mes
        double porcentajeAumento = 0.05 * meses; // 5% por cada mes
        double precioFinal = precio * (1 + porcentajeAumento);

        // Calcular la cuota mensual fija
        double cuotaMensual = precioFinal / meses;

        // Mostrar el resultado
        System.out.printf("El valor total a pagar es: %.2f\n", precioFinal);
        System.out.printf("La cuota mensual fija es: %.2f\n", cuotaMensual);
    }
}
