import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su codigo identificador: ");
        int codigo = sc.nextInt();
        String categoria = "";

        if(codigo%2==0 && codigo%3==0 && codigo%5==0){
            categoria = "Director General";
        } else if(codigo%2!=0 && codigo%3==0 && codigo%5==0){
            categoria = "Directivo";
        }else if(codigo%2==0 && codigo%3!=0 && codigo%5!=0){
            categoria = "Staff";
        }else if(codigo%2!=0 && codigo%3!=0 && codigo%5!=0){
            categoria = "Seguridad";
        }

        System.out.println("La categoria del empleado es: "+categoria);
    }
}
