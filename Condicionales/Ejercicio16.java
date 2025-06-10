package Condicionales;
import java.util.Scanner;

public class Ejercicio16 {
    public void ejercicio16(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = sc.nextDouble();

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Soluciones reales: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            // Una sola solución real
            double x = -b / (2 * a);
            System.out.println("Solución única: x = " + x);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Soluciones complejas:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }

    }
}
