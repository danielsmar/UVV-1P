public class Produto {

    private String designacao;
    private Float precoVendaPublico;
    private int stock; 
    private int produtoID;
    

    public Produto(String designacao, Float precoVendaPublico, int stock, int produtoID) { // Construtor da Classe Produtos
        this.designacao = designacao;
        this.precoVendaPublico = precoVendaPublico;
        this.stock = stock;
        this.produtoID = produtoID;
    }

    

    public String getDesignacao() {
        return this.designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public Float getPrecoVendaPublico() {
        return this.precoVendaPublico;
    }

    public void setPrecoVendaPublico(Float precoVendaPublico) {
        this.precoVendaPublico = precoVendaPublico;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public int getProdutoID() {
        return this.produtoID;
    }

    public void setProdutoID(int produtoID) {
        this.produtoID = produtoID;
    }




    






    
}
