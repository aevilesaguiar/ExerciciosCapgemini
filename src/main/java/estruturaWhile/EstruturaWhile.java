package estruturaWhile;

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {

        int totalAlunos = 10;

        Scanner scanner = new Scanner(System.in);


    while (totalAlunos>0 ){

        System.out.println("Insira o nome");
        String nomeAluno = scanner.nextLine();
        System.out.println("Insira a idade");
        int idade= scanner.nextInt();

        System.out.println("Nome do aluno: " + nomeAluno +"\n Idade:"+idade);
        totalAlunos-= totalAlunos;

    }

    }
}
