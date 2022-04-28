import java.io.IOException; 
import java.util.Scanner;

public class Sistema {
    static Scanner menu = new Scanner(System.in);
    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    
    public static void main(String[] args) throws Exception {
        Empresa emp = new Empresa(); //objeto empresa

        Sistema.limparTela();  
        emp.Produtos();  //adiciona produtos
        emp.Fornecedores(); // adiciona Fornecedores
        emp.Empregados();     // adiciona Empregados 
        emp.Clientes(); // adiciona CLientes.
        
        
        int i = 0;

        do{     
            
            
            System.out.println("--------SISTEMA EMPRESARIAL--------");
            System.out.println("0- Sair"); //feito             
            System.out.println("1- Menu Produtos"); //feito       
            System.out.println("2- Menu Pessoas"); //feito       
            System.out.println("3- Dados Empresa"); //feito     
            System.out.println("------------------------------------");                
            int opcao = menu.nextInt();
            
            switch (opcao) {

             case 0:{
                System.out.println("Sessão Finalizada!");
                i=0;
                break;
                }

             case 1: {
                emp.menuProdutos();
                i=1;            
                break;
                }
            
                case 2: {
                emp.menuPessoas();
                i=1;            
                break;
                }

                case 3: {
                emp.mostrar(); 
                    
                    
                    i=1;            
                    break;
                    }
             default: {
                System.out.println("Opção Inválida, Digite Novamente");
                i=1; 
                } 
            }               
            
        }while(i != 0);
        menu.close();

     
     
       
        

    }
}
