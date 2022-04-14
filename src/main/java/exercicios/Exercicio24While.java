package exercicios;

import java.util.Scanner;

public class Exercicio24While {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        char desejaContinuar='S';

        while (desejaContinuar == 'S' || desejaContinuar=='s'){
            System.out.println("Digite um numero: ");
            int num = scanner.nextInt();
            if(num<0){
                System.out.println("Numero "+num+ " negativo");
            }else if(num == 0){
                System.out.println("Numero é zero");
            }else{
                System.out.println("Numero "+num+ " é positivo");
            }

            System.out.println("Deseja continuar : S - sim e N -Não");
            desejaContinuar = scanner.next().charAt(0);
        }
    }




}
