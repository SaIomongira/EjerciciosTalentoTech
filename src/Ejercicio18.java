import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Indicador = "";
        double tasaMaxima = 0.1, puntaje = 0;

        System.out.println("Ingrese el indicador correspondiente a su vehiculo: ");
        System.out.println("Camion : C");
        System.out.println("Autobus : A");
        System.out.println("Turismo : T");
        System.out.println("Motocicleta : M");
        Indicador = sc.nextLine();

        System.out.println("Ingrese el puntaje obtenido en alcoholemia");
        puntaje = sc.nextDouble();

        if(Indicador.equals("C") || Indicador.equals("A") || Indicador.equals("M")) {
            tasaMaxima = 0.3;
        }else if(Indicador.equals("T")){
            tasaMaxima = 0.5;
        }

        if(puntaje>=tasaMaxima){
            System.out.println("Positivo para alcoholemia");
        }else{
            System.out.println("Negativo para alcoholemia");
        }

    }
}
