package Loops;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = 10, contador = 0;

        for(int i=0; i<limite; i++){
            System.out.println("Ingrese un número");
            int numero = sc.nextInt();

            double cubo = numero*numero;
            int cuarta = numero/4;

            System.out.println("El cubo de su numero es igual a: "+cubo);
            System.out.println("La cuarta de su numero es igual a: "+cuarta);
        }
    }
}
