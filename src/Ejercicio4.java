import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        System.out.print("1: ");
        int a = sc.nextInt();
        System.out.print("2: ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println(a+" is greater than "+b);
        } else if (a < b){
            System.out.println(a+" is less than "+b);
        } else{
            System.out.println(a+" is equal to "+b);
        }
    }
}
