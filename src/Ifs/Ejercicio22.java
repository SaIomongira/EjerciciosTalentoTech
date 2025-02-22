package Ifs;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioFinal = 0;
        System.out.println("Ingrese el precio de la compra: ");
        double precio = sc.nextDouble();

        if(precio >= 1000){
            precioFinal = precio*0.80;
            System.out.println("Descuento aplicado");
        }else{
            precioFinal = precio;
        }

        System.out.println("El precio total a pagar es: " + precioFinal);
    }
}
