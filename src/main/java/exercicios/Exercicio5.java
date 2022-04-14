package exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome:");
        String nome = scanner.next();

        System.out.println("Informe a nota das tres provas:");

        Double nota1=scanner.nextDouble();
        Double nota2=scanner.nextDouble();
        Double nota3=scanner.nextDouble();

        Double media = (nota1+nota3+nota2)/3;

        System.out.println("Nome do Aluno: " + nome + "\n Media: "+media);

    }
}
