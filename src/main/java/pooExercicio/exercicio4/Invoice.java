package pooExercicio.exercicio4;

public class Invoice {
    private int codigoItem;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Invoice() {

    }

    public Invoice(int numItem, String descricao, int quantidade, double precoUnitario) {
        codigoItem = numItem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;


    }


    public int getNumItem() {
        return codigoItem;
    }

    public void setNumItem(int numItem) {
        codigoItem = numItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(this.quantidade<0){
            this.quantidade=0;
        }else{
            this.quantidade=quantidade;
        }

    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {


        if(this.precoUnitario<0){
            this.precoUnitario=0;
        }else{
            this.precoUnitario=precoUnitario;
        }

    }



    public double getInvoiceAmount(int quantidade, double valorUnitario){


        return quantidade *valorUnitario;


    }

}
