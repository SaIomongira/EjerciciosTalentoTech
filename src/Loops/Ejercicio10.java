package Loops;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea continuar? (S(1)/N(0))");
        int desicion = sc.nextInt();

        while(desicion==1){
            System.out.println("Ingrese el numero 1");
            int multiplicando = sc.nextInt();
            System.out.println("Ingrese el numero 2");
            int multiplicador = sc.nextInt();

            int producto = multiplicando*multiplicador;

            System.out.println("El multiplicando es :"+multiplicando);
            System.out.println("El multiplicador es :"+multiplicador);
            System.out.println("El producto de la nota es:"+producto);

            System.out.println("Desea continuar? (S(1)/N(0))");
            desicion = sc.nextInt();
        }

        System.out.println("FIN");
    }
}
