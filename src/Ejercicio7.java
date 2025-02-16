import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura del agua: ");
        int temperatura = sc.nextInt();

        if(temperatura >= 100){
            System.out.println("El estado del agua es Gaseoso");
        }else{
            System.out.println("El estado del agua es Liquido");
        }
    }
}
