package Loops;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = 10;
        int suma = 0;
        double media = 0;

        for(int i=0; i<limite; i++){
            System.out.println("Ingrese un número: ");
            int numero = sc.nextInt();
            suma += numero;

        }
        media = suma / limite;

        System.out.println("La media es: " + media);
        System.out.println("La suma es: " + suma);
    }
}
