package Funciones;

import java.util.Scanner;

public class Funciones {

    public static int suma(int a, int b) {
        return a+b;
    }

    public static float division(int a, int b) {
        return (float) a /b;
    }

    public static void letraRepetida(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static void rotulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto");
        StringBuilder cadena = new StringBuilder();
        String texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            cadena.append("-");
        }

        System.out.println(cadena+texto+cadena);
    }

    public static double raizCubica(int a) {
        return Math.cbrt(a);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Hola Usuario "+"\n");
            System.out.println("---BIENVENIDO A LOS EJERCICIOS DE FUNCIONES---");
            System.out.println("¿Que quieres hacer el dia de hoy?\n");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("Ejercicio 5");
            System.out.println("Ejercicio 6");
            System.out.println("0: Salir");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese dos numeros para sumar");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int suma = suma(num1,num2);
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    System.out.println("Ingrese dos numeros para sumar");
                    int div1 = sc.nextInt();
                    int div2 = sc.nextInt();
                    int div = suma(div1,div2);
                    System.out.println("La suma es: " + div);
                    break;
                case 3:
                    System.out.println("Ingrese una letra");
                    String letra = sc.next();
                    System.out.println("Ingrese la cantidad de veces que la desea repetir");
                    int repetir = sc.nextInt();
                    letraRepetida(letra,repetir);
                    break;
                case 4:
                    rotulo();
                    break;
                case 5:
                    break;
                case 6:
                    double raizC = raizCubica(10);
                    System.out.println(raizC);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
