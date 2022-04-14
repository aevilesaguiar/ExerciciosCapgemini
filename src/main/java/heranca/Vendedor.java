package heranca;

import java.util.Date;

public class Vendedor extends  Funcionario{

    private int totalItensVendidos;
    private  float comissaoItem;



    public Vendedor() {
        super();

    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoItem() {
        return comissaoItem;
    }

    public void setComissaoItem(float comissaoItem) {
        this.comissaoItem = comissaoItem;
    }



    public float calcularSalario(){
        return  this.getSalario()+(this.getComissaoItem()*this.totalItensVendidos);
    }
}
