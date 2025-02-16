import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num2 = 0, suma = 0, resta = 0, producto = 0;


        System.out.println("Enter a number: ");
        float num = sc.nextInt();

        if(num>0){
            System.out.println("Enter another number: ");
            num2 = sc.nextInt();

            suma = num + num2;
            resta = num - num2;
            producto = num * num2;
            System.out.println("El resultado de la suma entre "+num+" + "+num2+" es "+suma);
            System.out.println("El resultado de la resta entre "+num+" - "+num2+" es "+resta);
            System.out.println("El resultado del producto entre "+num+" * "+num2+" es "+producto);
        } else{
            System.out.println("El número ingresado es negativo");
        }
    }
}
