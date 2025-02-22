package Ifs;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("El número ingresado es negativo");

        }else{
            System.out.println("El numero es positivo");
        }
    }
}
