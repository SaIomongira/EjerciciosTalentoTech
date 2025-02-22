package Ifs;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha actual");
        System.out.print("Año: ");
        int year = sc.nextInt();
        System.out.print("Mes: ");
        int month = sc.nextInt();
        System.out.print("Dia: ");
        int day = sc.nextInt();

        if(month == 2 && day == 28){
            day = 1;
            month++;
        } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 && day == 31){
            day = 1;
            month++;
        } else if(month == 4 || month == 6 || month == 9 || month == 11 && day == 30){
            day = 1;
            month++;
        } else if(month == 12 && day == 31) {
            month = 1;
            day = 1;
            year++;
        }

        System.out.println("La fecha es: " + year + "-" + month + "-" + day);
    }
}
