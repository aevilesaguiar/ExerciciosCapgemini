package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa=new Pessoa();
        Pessoa pessoa2 = new Pessoa(70.0f, 1.65f);

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso: ");

       pessoa.setPeso(leitor.nextFloat());

        System.out.println("Digite altura: ");

        pessoa.setAltura(leitor.nextFloat());

        System.out.println("IMC pessoa= "+pessoa.calcularImc());

        System.out.println("IMC pessoa2= "+pessoa2.calcularImc());


    }
}
