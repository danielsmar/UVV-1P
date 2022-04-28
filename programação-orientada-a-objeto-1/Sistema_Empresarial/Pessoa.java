public class Pessoa {

    protected String nome;
    protected Long contribuinte;
    protected int idade;
    protected CodigoPostal cp;

    public Pessoa(){

    }
  
    public Pessoa(String nome, Long contribuinte, int idade) { //Construtor da classe Pessoa
        
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;  
    }
    
    public Pessoa(String nome, Long contribuinte, int idade, CodigoPostal cp){      // Construtor da Classe Pessoa Vinculado ao CEP;
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;
        this.cp = cp;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getContribuinte() {
        return this.contribuinte;
    }

    public void setContribuinte(Long contribuinte) {
        this.contribuinte = contribuinte;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public CodigoPostal getCp() {
        return this.cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }


    
   

    
}
