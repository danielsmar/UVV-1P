

public class Fornecedor extends Pessoa {

   
    private Float plafond;
    private Float valorEmDivida;
    
    
    public Fornecedor(String nome, Long contribuinte, int idade, float plafond, float valorEmDivida) {  //construtor Fornecedor
        super(nome, contribuinte, idade);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;       
    }
    
    public Fornecedor(String nome, Long contribuinte, int idade, float plafond, float valorEmDivida, CodigoPostal cp) { //Construtor fornecedor Vinculado ao CEP;
        super(nome, contribuinte, idade, cp);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;       
    }
    

    public Float getPlafond() {
        return this.plafond;
    }

    public void setPlafond(Float plafond) {
        this.plafond = plafond;
    }

    public Float getValorEmDivida() {
        return this.valorEmDivida;
    }

    public void setValorEmDivida(Float valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }


   


    
    


    
}
