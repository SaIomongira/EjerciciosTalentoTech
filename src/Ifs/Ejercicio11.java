package Ifs;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la inicial de un dia de la semana: ");
        String dia = sc.nextLine();
        dia = dia.toLowerCase();

        switch (dia){
            case "l":
                System.out.println("Lunes");
                break;
            case "m":
                    System.out.println("Martes");
                    break;
            case "x":
                    System.out.println("Miercoles");
                        break;
            case "j":
                     System.out.println("Jueves");
                            break;
            case "v":
                     System.out.println("Viernes");
                                break;
            case "s":
                     System.out.println("Sabado");
                               break;
            case "d":
                System.out.println("Domingo");

        }
    }
}
