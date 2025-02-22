package Ifs;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1=0, nota2=0, nota3=0;
        double promedio=0;

        System.out.println("Ingrese las 3 notas del alumno: ");
        System.out.print("1: ");
        nota1 = sc.nextInt();
        System.out.print("2: ");
        nota2 = sc.nextInt();
        System.out.print("3: ");
        nota3 = sc.nextInt();

        promedio = (double) (nota1 + nota2 + nota3) /3;

        if(promedio >= 70){
            System.out.println("El estudiante ha pasado");
        }else{
            System.out.println("El estudiante ha reprobado");
        }

    }
}
