package Loops;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = 0, nMaterias = 7, contador=0;
        double promedio=0,nota=0;

        while(i<=nMaterias){
            System.out.println("Ingrese la"+i+" nota");
            int notas  = sc.nextInt();
            i++;
            contador+=notas;

        }
        promedio= (double) contador /nMaterias;

        System.out.println("El promedio: "+promedio);
    }

    }
}
