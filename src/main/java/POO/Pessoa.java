package POO;

public class Pessoa {

    private  float peso;
    private float altura;

    public Pessoa() {
    System.out.println("Executando o método construtor");
    }

    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double calcularImc(){
        double imc = this.peso/(this.altura*this.altura);
        return imc;
    }


}
