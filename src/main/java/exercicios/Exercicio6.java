package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Informe um valor:");
        int a = scanner.nextInt();
        System.out.println("Informe outro valor:");
        int b = scanner.nextInt();

        if(a == a){
            System.out.println(b);
        }
        if(b == b){
            System.out.println(a);
        }




    }
}
