package heranca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor();



        vendedor.setNome("Joao da Silva");
        vendedor.setSalario(2000.0f);
        vendedor.setCpf("123456789");
        vendedor.setDataNascimento(new Date());
        vendedor.setComissaoItem(10);
        vendedor.setTotalItensVendidos(30);


        Motorista motorista = new Motorista();

        motorista.setNome("Pedro Santos");
        motorista.setCpf("123458795");
        motorista.setSalario(1562.0f);
        motorista.setDataNascimento(new Date(15/05/2022));




        System.out.println("O salário do vendedor é: "+vendedor.calcularSalario());

        System.out.println("O salário do motorista é: "+motorista.toString());





    }
}
