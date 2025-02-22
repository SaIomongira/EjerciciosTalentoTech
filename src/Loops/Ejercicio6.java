package Loops;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = 3, positivos = 0, negativos = 0, neutros = 0;

        for(int i=0; i<limite; i++){
            System.out.println("Ingrese un número");
            int numero = sc.nextInt();

            if(numero>0){
                positivos++;
            }else if(numero<0){
                negativos++;
            }else if(numero==0){
                neutros++;
            }
        }

        System.out.println("La cantidad de numeros positivos es igual a: " + positivos);
        System.out.println("La cantidad de numeros negativos es igual a: "+negativos);
        System.out.println("La cantidad de numeros neutros es igual: " + neutros);
    }
}
