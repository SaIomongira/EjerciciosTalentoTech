package Ifs;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoVehiculo = 0, numeroPasajeros = 0, altaCongestion = 0;
        double valorPeaje = 0;

        System.out.println("Ingrese el tipo de vehiculo: ");
        System.out.println("Automovil: 1");
        System.out.println("Camion: 2");
        tipoVehiculo = sc.nextInt();

        System.out.println("Ingrese el numero de pasajeros: ");
        numeroPasajeros = sc.nextInt();

        System.out.println("Ingrese si la hora era de alta congestion(1) o si la hora era de baja congestion(0)");
        altaCongestion = sc.nextInt();

        System.out.println();

        if(altaCongestion == 1){
            if(tipoVehiculo == 1 && numeroPasajeros >= 3){
                valorPeaje = 0;
            }else if(tipoVehiculo==2){
                valorPeaje = 50;
            }
        }else if(altaCongestion == 0){
            if(tipoVehiculo == 1){
                valorPeaje = 25;
            }else if(tipoVehiculo==2){
                valorPeaje = 30;
            }
        }

        System.out.println("El valor a pagar de su vehiculo es igual a: "+valorPeaje+" euros");





    }
}
