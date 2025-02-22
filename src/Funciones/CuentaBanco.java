package Funciones;

import java.util.Scanner;

public class CuentaBanco {
    public static double saldo = 921.1;
    //Funciones
    public static double consultarSaldo(){
        return saldo;
    }

    public static double hacerRetiro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a retirar");
        double retiro = sc.nextDouble();

        if(retiro > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Retirando saldo.......... ");
            saldo -= retiro;
        }
        return retiro;
    }

    public static void Consignar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a consignar: ");
        double valor = sc.nextDouble();
        saldo += valor;
    }

    //Metodo main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su Nombre: ");
        String usuario = sc.nextLine();
        System.out.println();
        while(true){
            System.out.println("Hola Usuario " + usuario+"\n");
            System.out.println("---BIENVENIDO AL BANCO DE JOSELITO CARNAVAL---");
            System.out.println("¿Que quieres hacer el dia de hoy?\n");
            System.out.println("1: Consultar Saldo");
            System.out.println("2: Hacer Retiro");
            System.out.println("3: Hacer Consignación");
            System.out.println("4: Salir");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    double saldo = consultarSaldo();
                    System.out.println("Consultando saldo .......");
                    System.out.println(saldo);
                    break;
                case 2:
                    hacerRetiro();
                    break;
                case 3:
                    Consignar();
                    System.out.println("Consignando......");
                    System.out.println("Consignacion exitosa");

                    break;
                case 4:
                    System.out.println("Gracias ae");
                    System.exit(0);
                    break;
                default:

                    break;
            }
        }
    }
}
