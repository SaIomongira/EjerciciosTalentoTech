import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        System.out.print("1: ");
        int a = sc.nextInt();
        System.out.print("2: ");
        int b = sc.nextInt();
        System.out.print("3: ");
        int c = sc.nextInt();

        int greater = Math.max(a, Math.max(b, c));

        System.out.println("The greater number is: " + greater);
    }
}
