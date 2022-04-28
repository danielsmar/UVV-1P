import java.util.Date;

public class Pedidos {
    private String pedidoNome;
    private int pedidoID;
    private Date dataEmissao;
    private float valorTotalCalculado;
    private float valor;
    


    public Pedidos(String nome, int id, float valor) {
        this.pedidoNome = nome;
        this.pedidoID = id;
        this.valor = valor;        
    }

  

    public String getPedidoNome() {
        return this.pedidoNome;
    }

    public void setPedidoNome(String pedidoNome) {
        this.pedidoNome = pedidoNome;
    }

    public int getPedidoID() {
        return this.pedidoID;
    }

    public void setPedidoID(int pedidoID) {
        this.pedidoID = pedidoID;
    }

    public Date getDataEmissao() {
        return this.dataEmissao;
    }

    public void setDataEmissao(Date data) {
        this.dataEmissao = data;
    }

    public  float getValorTotalCalculado() {
        return this.valorTotalCalculado;
    }

    public void setValorTotalCalculado(float soma) {
        this.valorTotalCalculado = soma;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    

}
