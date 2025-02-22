package Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, limite = 5, contador=0;
        double promedio=0;

        while(i<=limite){
            System.out.println("Ingrese su edad");
            int edad = sc.nextInt();
            i++;
            contador+=edad;

        }
        promedio=contador/limite;

        System.out.println("El promedio de edad es: "+promedio);
    }
}
