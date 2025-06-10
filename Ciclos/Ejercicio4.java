package Ciclos;

import java.util.Scanner;

public class Ejercicio4 {
    //forma 1
    Scanner sc = new Scanner(System.in);

    public void ejercicio4F1(){

        System.out.println("Ingrese cuantos estudiantes va a calificar: ");
        int est = sc.nextInt();

        for(int i = 1; i <= est; i++){
            System.out.printf("Nota 1 del estudiante %d: ", i);
            double calificacion1 = sc.nextDouble();

            System.out.printf("Nota 2 del estudiante %d: ", i);
            double calificacion2 = sc.nextDouble();

            System.out.printf("Nota 3 del estudiante %d: ", i);
            double calificacion3 = sc.nextDouble();

            double promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;
            System.out.printf("El promedio del estudiante %d es: %.2f%n", i, promedio);
        }
    }

    //forma 2
    public void ejercicio4F2(){
        double[] calificaciones = new double[3];

        System.out.println("Ingrese cuantos estudiantes va a calificar: ");
        int est = sc.nextInt();

        for(int i = 1; i <= est; i++){
            System.out.printf("Ingrese la nota 1 del estudiante %d: ", i);
            calificaciones[0] = sc.nextDouble();

            System.out.printf("Ingrese la nota 2 del estudiante %d: ", i);
            calificaciones[1] = sc.nextDouble();

            System.out.printf("Ingrese la nota 3 del estudiante %d: ", i);
            calificaciones[2] = sc.nextDouble();

            double promedio = (calificaciones[0] + calificaciones[1] + calificaciones[2]) / 3.0;
            System.out.printf("El promedio del estudiante %d es: %.2f%n", i, promedio);
        }
    }
}
