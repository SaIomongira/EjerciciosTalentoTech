package Ifs;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año");
        int año = sc.nextInt();
        double a = año%19, b = año%4, c=año%7;
        double d = (19*a+24) % 30;
        double e = (2*b+4*c+6*d+5) % 7;
        double n = (22+d+e);



        if(n<=31){
            System.out.println("La pascua en el año "+año+"se celebro el "+ n+" de marzo");
        }else{
            n=n-31;
            System.out.println("La pascua en el año "+año+" se celebro el "+ n+" de abril");

        }



    }
}
