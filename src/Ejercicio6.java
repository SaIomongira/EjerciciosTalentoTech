import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        System.out.print("1: ");
        int a = sc.nextInt();
        System.out.print("2: ");
        int b = sc.nextInt();
        System.out.print("3: ");
        int c = sc.nextInt();
        System.out.print("4: ");
        int d = sc.nextInt();

        int greater = Math.max(a, Math.max(b, c));

        if (greater > d) {
            System.out.println("The greater number is: " + greater);
        } else{
            System.out.println("The greater number is: " + d);
        }


    }
    }

