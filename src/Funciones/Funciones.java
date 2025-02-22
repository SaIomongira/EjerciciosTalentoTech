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

    public static void rotulo(int a, int b) {

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
                    System.out.println("Gracias ae");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
