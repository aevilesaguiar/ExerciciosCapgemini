package exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        /*
        Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
        por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
        efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome:");
        String nome = scanner.next();
        System.out.println("Informe o salário:");
        Double salario = scanner.nextDouble();
        System.out.println("Informe o total de vendas:");
        Double totalVendas = scanner.nextDouble();

        Double comissao= (totalVendas * 0.15)+salario;

        System.out.println("Nome vendedor: " + nome +"\n Salário fixo: "+ salario + "\n Salário Final: "+ (comissao));


    }
}
