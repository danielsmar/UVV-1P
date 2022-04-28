public class Empregado extends Pessoa {

    private int numeroSeccao;
    private Float salarioBase;
    private Float iRS;
    private String cargo;
    private Float salario;


    public Empregado(String nome, Long contribuinte, int idade, int numeroSeccao, Float salarioBase, String cargo) {  //construtor  do Empregado
        super(nome, contribuinte, idade);
        this.numeroSeccao = numeroSeccao;
        this.salarioBase = salarioBase;             
        this.cargo = cargo;
        
    }  

    public Empregado(String nome, Long contribuinte, int idade, int numeroSeccao, Float salarioBase, String cargo, CodigoPostal cp) { // Construtor com CEP vinculado ao Empregado
        super(nome, contribuinte, idade, cp); 
        this.numeroSeccao = numeroSeccao;
        this.salarioBase = salarioBase;             
        this.cargo = cargo;
        
    } 

    // fonte: https://info.portaldasfinancas.gov.pt/pt/informacao_fiscal/codigos_tributarios/cirs_rep/Pages/irs68.aspx
    public Float calcularSalario() {      //Calcula o Salário liquido de acordo com a taxa iRS.
        if(salarioBase <= 7112){
            iRS = 0.145F;
        }  
        else if(salarioBase <= 10732 ){
            iRS = 0.23F;            
        }
        else if(salarioBase <=20322){
            iRS = 0.28F;
        }
        else if(salarioBase <= 25075){
            iRS = 0.35F;
        }
        else if(salarioBase <= 36967){
            iRS = 0.37F;
        }
        else if(salarioBase <= 80882){
            iRS = 0.45F;
        }
        else{
            iRS=0.48F;
        }                          
        return this.salario = this.salarioBase*(1-this.iRS);     
    }
    


    public int getNumeroSeccao() {
        return this.numeroSeccao;
    }

    public void setNumeroSeccao(int numeroSeccao) {
        this.numeroSeccao = numeroSeccao;
    }

    public Float getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(Float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Float getIRS() {
        return this.iRS;
    }

    public void setIRS(Float iRS) {
        this.iRS = iRS;
    }


    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public Float getSalario() {
       calcularSalario();
        return this.salario;
    }

    public void setSalario(Float salario) {

        this.salario = salario;
    }

    

}
