package Loops;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int promedioNiños = 0, numeroNiños = 0, pesoNiños=0, promedioAdultos=0,numeroAdultos=0,pesoAdultos=0
                ,pesoJovenes = 0, promedioJovenes=0,numeroJovenes=0,pesoViejos = 0, numeroViejos=0, promedioViejos=0, i = 1;
        int limite = 50;

        while(i <= limite){
            System.out.println("Ingrese la edad de la persona");
            int edad = sc.nextInt();


            if(edad > 0 && edad <= 13){
                numeroNiños++;
                System.out.println("Ingrese el peso del niño");
                int peso = sc.nextInt();
                pesoNiños+=peso;
            }

            i++;
        }
    }
}
