package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero:");
        double num1=scanner.nextDouble();

        if((num1 >=100) && (num1<=200)){
            System.out.println( "Está no intervalo entre 100 e 200 ");
        }else{
            System.out.println( "Está fora do intervalo ");
        }
    }
}
