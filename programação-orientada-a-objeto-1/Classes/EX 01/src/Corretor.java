public class Corretor {

   public static Object c1;
private String nome;
   private int matricula;
   private Double metaMensal;
   private Double totalVenda;
   private String enderecoResidencial;
   
  
 public void mostrarDados(){
    System.out.println("\nCorretor: " + this.getNome());
    System.out.println("Matrícula: " + this.getMatricula());
    System.out.println("Meta Mensal R$" + this.getMetaMensal());
    System.out.println("Venda Mensal R$" + this.getTotalVenda());
 }
 
 public Corretor (String nome, int matricula, Double metaMensal, Double totalVenda){
     this.nome = nome;
     this.matricula = matricula;
     this.metaMensal = metaMensal;
     this.totalVenda = totalVenda;
 }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Double getMetaMensal() {
        return this.metaMensal;
    }

    public void setMetaMensal(Double metaMensal) {
        this.metaMensal = metaMensal;
    }

    public Double getTotalVenda() {
        return this.totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public String getEnderecoResidencial() {
        return this.enderecoResidencial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    
    

    
    




}
