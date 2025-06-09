import java.util.Scanner;

public class Ejercicio15 {
    public void ejercicio15(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los segundos a convertir");
        int segundos = sc.nextInt();

        double minutos = segundos / 60.0;
        double horas = minutos / 60.0;

        System.out.printf("%d segundos son %.2f minutos y %.2f horas%n", segundos, minutos, horas);
    }
}
