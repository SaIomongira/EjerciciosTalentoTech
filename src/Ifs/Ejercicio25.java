package Ifs;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        System.out.print("1: ");
        int a = sc.nextInt();
        System.out.print("2: ");
        int b = sc.nextInt();

        if (a < b) {
            System.out.println(a+","+b);
        }else{
            System.out.println(b+","+a);
        }
    }
}
