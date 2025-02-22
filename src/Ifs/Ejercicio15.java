package Ifs;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del prestamo que desea realizar: ");
        double valor = sc.nextDouble();
        double total = 0,valorPorCuota=0;
        double intereses = 0;
        int cuotas = 0;

        if(valor >= 5000){
            cuotas = 3;
        } else if (valor <= 1000){
            cuotas = 1;
        } else if (valor >= 2000 && valor <= 3000){
            cuotas = 2;
        } else{
            cuotas = 5;
        }

        if(valor < 4000){
            intereses = 1.12;
        } else{
            intereses = 1.10;
        }

        total = valor * intereses;

        valorPorCuota=total/cuotas;

        System.out.println("El pago del prestamo debera realizarlo en "+cuotas+" cuotas"+" el valor de cada cuota es igual a:" +
                valorPorCuota+" Bs"+" y el total: "+total);




    }
}
