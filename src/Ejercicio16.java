import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas: ");
        int numeroHoras = sc.nextInt();
        System.out.println("Ingrese el valor por hora: ");
        float valorHora = sc.nextFloat();
        int horasNormales = 140;
        int horasExtra = 0;
        double extra = 0;
        double sueldo = 0;
        double valorHorasExtra = valorHora * 1.50;

        //Calcular el sueldo sin impuestos
        if(numeroHoras <= horasNormales){
            sueldo = numeroHoras * valorHora;
        }else{
            sueldo=(horasNormales*valorHora);
            horasExtra = numeroHoras - horasNormales;
            extra = horasExtra * valorHorasExtra;
            sueldo+=extra;
        }

        //Calcular sueldo con impuestos
        if(sueldo<=600){
            sueldo = sueldo;
        }else if(sueldo>=600 && sueldo<=1000){
            sueldo = sueldo * 0.80;
        }else if(sueldo>1000){
            sueldo = sueldo * 0.70;
        }

        System.out.println("Salario final: "+sueldo);

    }
}
