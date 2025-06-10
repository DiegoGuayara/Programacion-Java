package Condicionales;
import java.util.Scanner;

public class Ejercicio10 {
    public void ejercicio10(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        double num = sc.nextDouble();

        double valorAbsoluto = Math.abs(num);

        System.out.printf("El valor absoluto de %.2f es: %.2f\n", num, valorAbsoluto);
    }
}
