import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo");

        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
}
