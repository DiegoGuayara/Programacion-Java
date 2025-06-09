import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base");
        double base = sc.nextDouble();

        System.out.println("Ingrese la altura");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.printf("El área del triángulo es: %.2f\n", area);
    }
}
