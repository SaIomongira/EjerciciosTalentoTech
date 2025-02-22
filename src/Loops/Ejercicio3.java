package Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroNotas = 7, i = 1, contador = 0;
        float promedio = 0;

        while(i<=numeroNotas){
            System.out.print("Ingrese la nota numero "+i+" :");
            int nota = sc.nextInt();
            contador+=nota;
            i++;
        }
        promedio= (float) contador /numeroNotas;

        System.out.println("El promedio es: "+promedio);
    }
}
