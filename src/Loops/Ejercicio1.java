package Loops;

import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].toUpperCase(Locale.ROOT));
        }
    }
}
