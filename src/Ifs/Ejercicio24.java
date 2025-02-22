package Ifs;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario = 0, valorHoras = 16, valorExtra = 20;
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        int horas = sc.nextInt();

        if(horas<=40){
            salario = horas*valorHoras;
        }else{
            salario = 40*valorHoras + (horas-40)*20;
        }
        System.out.println(salario);
    }
}
