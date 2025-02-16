import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la duracion total de la llamada en minutos: ");
        int duracion = sc.nextInt();
        int costo = 0;

        if(duracion <= 5){
            costo = 10;
        }else{
            costo = 10 + (duracion - 5) * 2;
        }

        System.out.println("El coste de la llamada es: " + costo);


    }
}
