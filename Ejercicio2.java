import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");

        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero");

        double num2 = sc.nextDouble();

        System.out.printf("%f.2 + %f.2 = %f.2\n", num1, num2, (num1 + num2));
        System.out.printf("%f.2 - %f.2 = %f.2\n", num1, num2, (num1 - num2));
        System.out.printf("%f.2 * %f.2 = %f.2\n", num1, num2, (num1 * num2));
        System.out.printf("%f.2 / %f.2 = %f.2\n", num1, num2, (num1 / num2));
        System.out.printf("%f.2 %% %f.2 = %f.2\n", num1, num2, (num1 % num2));
        
    }
}