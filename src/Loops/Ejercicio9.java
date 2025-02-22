package Loops;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = 4, notaBaja = 100;
        int suma = 0;
        double media = 0;

        for(int i=0; i<limite; i++){
            System.out.println("Ingrese una nota: ");
            int numero = sc.nextInt();

            if(numero < notaBaja){
                notaBaja = numero;
            }
            suma += numero;

        }
        media = (double) suma / limite;

        System.out.println("Media: "+media);
        System.out.println("Nota mas baja: "+notaBaja);

    }
}
