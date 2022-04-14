package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Informe dois numeros:");
        double num1=scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("O resultado da Soma é:"+(num1+num2));
        System.out.println("O resultado da Subtracao é:"+(num1-num2));
        System.out.println("O resultado da Divisao é:"+(num1/num2));
        System.out.println("O resultado da Multiplicacao é:"+(num1*num2));




    }
}
