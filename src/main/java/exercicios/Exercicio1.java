package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Informe dois numeros:");
        int num1=scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("O resultado da Soma é:"+(num1+num2));


    }
}
