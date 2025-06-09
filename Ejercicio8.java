import java.util.Scanner;

public class Ejercicio8 {
    public void ejercicio8(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");

        double precio = sc.nextDouble();
        double descuento = precio * 0.10;
        double precioFinal = precio - descuento;

        System.out.printf("El precio del producto es: %.2f\n", precio);
        System.out.printf("El descuento del producto es: %.2f\n", descuento);
        System.out.printf("El precio final del producto es: %.2f\n", precioFinal);
    }
}
