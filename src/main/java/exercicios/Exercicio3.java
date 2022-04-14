package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Qual a distancia total percorrida:");

        double distancia=scanner.nextDouble();

        System.out.println("Total de combustível gasto:");

        double totalCombustivel = scanner.nextDouble();

        double consumoMedio = distancia/totalCombustivel;

        System.out.println("Consumo Médio de Combustível:" + consumoMedio);

    }
}
