public class Cliente extends Pessoa{ //cliente tem herança com a superclasse pessoa
    

    private Float plafond;
    private Float valorEmDivida;
    private Float saldo;

    public Cliente(String nome, Long contribuinte, int idade, float plafond, float valorEmDivida) {  //construtores
        super(nome, contribuinte, idade);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;        
    }

    public Cliente(String nome, Long contribuinte, int idade, float plafond, float valorEmDivida, CodigoPostal cp) { // construtor com CEP vinculado ao  Cliente
        super(nome, contribuinte, idade, cp);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;        
    }

    public Float obterSaldo() {       // Método para obter o saldo do cliente ( saldo = limite de gasto(plafond) - o valor da divida que já possui)

        return this.saldo = this.plafond - this.valorEmDivida;
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


    public Float getSaldo() {
        obterSaldo();
        return this.saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
    
}
