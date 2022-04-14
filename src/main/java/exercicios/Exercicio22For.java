package exercicios;

import java.util.Scanner;

public class Exercicio22For {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que receba:
         o preço de custo e o preço de venda de 40 produtos.
         Mostre como resultado:
        - houve lucro,  prejuízo ou empate para cada produto.
        - Informe o valor de custo de cada produto,
        -o valor de venda de cada produto,
        - a média de preço de custo
        - preço de venda;
         */

        Scanner scanner = new Scanner(System.in);


        String nomeProduto;
        double precoCusto;
        double precodeVenda;
        double totalCusto=0;
        double totalVenda=0;

        int i =1;
        for (; i<=2;i++){

            System.out.println("Digite o nome do produto");
             nomeProduto=scanner.next();

            System.out.println("Digite o preco de custo");
             precoCusto = scanner.nextDouble();

            System.out.println("Digite o preco de venda");
             precodeVenda = scanner.nextDouble();

             totalCusto=totalCusto+ precoCusto;
             totalVenda=totalVenda+precodeVenda;

             if(precoCusto==precodeVenda){
                 System.out.println("Houve empate entre o preço de custo e de vendas");
             }else{
                 if(precoCusto> precodeVenda){
                     System.out.println("Prejuizo");
                 }else{
                     System.out.println("Lucro!");
                 }
             }

             System.out.println(nomeProduto + " , preço de custo = R$ "+precoCusto +" ,preco de venda = R$ "+precodeVenda);


        }

        System.out.println("O Media do preço de custo é: R$ " + (totalCusto/i));
        System.out.println("O Media do preço de venda é: R$ " + (totalVenda/i));

    }
}
