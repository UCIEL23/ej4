package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a; Scanner x = new Scanner(System.in);
        System.out.println("Dame un numero: "); a =x.nextInt();  
        if (a % 2 ==0){System.out.println("Es par");}
        else {System.out.println("Es impar");}
    }
    
}
