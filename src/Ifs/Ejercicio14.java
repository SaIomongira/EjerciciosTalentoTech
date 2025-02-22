package Ifs;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ganancia = 1;
        double pvp = 0;
        System.out.println("Ingrese el coste del producto: ");
        double coste = sc.nextFloat();

        if(coste < 3){
            ganancia = coste * 0.15;
            pvp = coste + ganancia;
        }else if(coste >= 3 && coste <=6 ){
            ganancia = 0.50;
            pvp = coste + ganancia;
        }else if(coste >= 6){
            ganancia = coste * 0.25;
            pvp = coste + ganancia;
        }

        System.out.println("El pvp es igual a : "+pvp+" Bs");
    }
}
