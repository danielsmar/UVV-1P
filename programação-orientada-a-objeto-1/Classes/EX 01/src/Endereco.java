public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    
    public Endereco(String rua, int numero,String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public void mostrarEndereco(){

        System.out.println("\n------LOCALIZAÇÃO DA CONSTRUTORA------");
        System.out.println("\nRua "+getRua()+ " Nº " +getNumero() +"\nCidade:" + getCidade()+"\n");
                
     }

    
    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
