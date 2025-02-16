import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha (dd:mm:aaaa)");
        System.out.print("Dia: ");
        int day = sc.nextInt();
        System.out.print("Mes: ");
        int month = sc.nextInt();
        System.out.print("Año: ");
        int year = sc.nextInt();

        Boolean fecha = false;

        if(year > 0 && month >= 1 && month <=12){
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if(day > 0 && day <= 31){
                    fecha = true;
                }


            }else if(month == 4 || month == 6 || month == 9 || month == 11 && day <= 30){
                if(day > 0 && day <= 30){
                    fecha = true;
                }
            }else if(month == 2) {
                if(year%4==0 && year%100!=0 || year%400==0){
                    if(day > 0 && day <= 29){
                        fecha = true;
                    }
                }else{
                    if(day > 0 && day <= 28){
                        fecha = true;
                    }
                }
            }
        }
        if(fecha){
            System.out.println("La fecha de ingreso es correcta");
        }else{
            System.out.println("La fecha de ingreso no es correcta");
        }


    }
}
