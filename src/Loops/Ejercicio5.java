package Loops;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = 10;

        for(int i=0; i<limite; i++){
            System.out.println("Ingrese un número");
            int numero = sc.nextInt();

            if(numero>0){
                System.out.println(numero);
            }
        }
    }
}
