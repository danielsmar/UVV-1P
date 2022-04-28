import java.io.IOException;


public class Principal {
    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      }

    
    public static void main(String[] args) throws Exception {
        Principal.limparTela();
        Endereco endereco = new Endereco("Marajó", 562,"Glória", "Vila Velha-ES");
        

        Construtora constroiSuperRapido = new Construtora("34280090000133", "Constroi Super Rapido");

        Corretor c1 = new Corretor("Erick",202197158,1500.00,2000.00);
        Corretor c2 = new Corretor("Daniel",202197434,1500.00,2500.00);
        Corretor c3 = new Corretor("Guilherme",202189757,1500.00,1800.00);  

        constroiSuperRapido.setC1(c1);
        constroiSuperRapido.setC2(c2);
        constroiSuperRapido.setC3(c3);
                     
        System.out.println("------CONSTRUTORA CONSTROI SUPER RAPIDO------");                   
        Construtora.validadorCNPJ();    

        c1.mostrarDados();
        c2.mostrarDados();
        c3.mostrarDados();
        
        constroiSuperRapido.atualizaTotalVenda();
        System.out.println("\nTotal de Vendas da Empresa: R$" + constroiSuperRapido.getTotalDeVendas() );

        endereco.mostrarEndereco();

        
        
        

        

        
                
          
  
  }
}      


