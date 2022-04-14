package exercicios;

/*
0. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
 */

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        float valorVeiculo =0.00f;

        int ano=0;
        int totalCarrosSemiNovos=0;
        int totalCarros=0;

        char desejaRepetir = 's';

        float porcDesconto=0.0f;
        float valorDesconto = 0.0f;


        while (desejaRepetir== 's' || desejaRepetir=='S'){

            System.out.println("Informe o valor do veiculo: ");
            valorVeiculo = scanner.nextFloat();

            System.out.println("Informe o ano do veiculo: ");
            ano=scanner.nextInt();

            if (ano <=2000){
                porcDesconto=0.12f;



            }else{
                porcDesconto=0.07f;
                totalCarrosSemiNovos++;
            }

            totalCarros++;

            valorDesconto = valorVeiculo*porcDesconto;

            valorVeiculo=valorVeiculo-valorDesconto;


            System.out.println("Valor Desconto: " + valorDesconto);

            System.out.println("Valor do Veiculo a ser pago: " + valorVeiculo);


            System.out.println("Deseja continuar o Atendimento? S-sim / N -não");
            desejaRepetir = scanner.next().charAt(0);

        }


        System.out.println("Total Carros Semi novos: " + totalCarrosSemiNovos);

        System.out.println("Total Carros: " + totalCarros);



    }
}
