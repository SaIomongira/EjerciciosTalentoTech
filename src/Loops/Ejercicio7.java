package Loops;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = 1;

        for(int i=0; i<limite; i++){
            System.out.println("Ingrese un número negativo: ");
            int numero = sc.nextInt();
            int numeroPositivo = numero*(-1);

            System.out.printf(String.valueOf(numeroPositivo));
        }
    }
}
