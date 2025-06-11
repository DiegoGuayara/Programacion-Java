package Ciclos;

import java.util.Scanner;

public class Ejercicio8 {
    public void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el final del rango: ");

        int finalRango = sc.nextInt();

        for(int i = 1; i <= finalRango; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
