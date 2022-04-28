
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Loja {

    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    static Scanner scanner = new Scanner(System.in);
    public Funcionario Chefe = new Funcionario();
    private static List<Pedidos> listaPedidos = new ArrayList<>();
    
    public static void inserirPedido(){
        int n = 1;

        while(n != 0){
            System.out.println("--------INSERIR PEDIDO--------");
            System.out.println("Digite o nome do produto:");
            
            String nomeProduto = scanner.nextLine();
            

            System.out.println("Digite o codigo do produto(ID):");
            int idProduto = scanner.nextInt();
            
           
            System.out.println("Digite o Valor do produto(R$):");
            float valor = scanner.nextFloat();
           
            
            Date data = new Date();  

            listaPedidos.add(new Pedidos(nomeProduto, idProduto, valor));

            System.out.println("\nSeu pedido  ("+ nomeProduto +") foi confirmado.");
            System.out.printf("\nNome: %s\nID: %d\nPreço: R$%.2f\n", nomeProduto, idProduto, valor);
            System.out.println("Emitido em :"+ data);
            
            System.out.println("\n----Novo pedido(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }
        
    }
    

    public static void removerPedidoID(){
        int j = 1;

        do{
            System.out.println("\n--------Remover Pedido--------\n Digite o ID pedido:");
            int id = scanner.nextInt();
            boolean pedido = false;
            Date data = new Date();  
    
            for (Pedidos i: listaPedidos) 
            {
                if (i.getPedidoID() == id){
                    pedido = true;
                    listaPedidos.remove(i);
                    System.out.println("Pedido: " + i.getPedidoNome() + " removido com sucesso!");                    
                    System.out.println("Consultado em :"+ data);
                    break; 
                };
            }    

            if (listaPedidos.isEmpty())
            {
                System.out.println("Lista vazia!");
            } 
            else if(pedido == false) 
            {
                System.out.println("Erro: Este pedido não encontrado.\n");
            }

            System.out.println("\n----Remover outro(1) -------- Voltar(0)----");
            j = scanner.nextInt();
            scanner.nextLine();
        }while(j == 1);
        
    }
    
    public static void buscarPedidoID(){
        int j = 1;
        Date data = new Date();  
        do{
        System.out.println("\n--------Buscar Pedidos--------\n Digite o ID do pedido:");
        int id = scanner.nextInt();
        boolean pedido = false;

        for (Pedidos i : listaPedidos) {
            if (i.getPedidoID() == id){
                pedido = true;
                System.out.println("\nPedido: " + i.getPedidoNome() +" | "+"Valor: R$ "+ i.getValor() );
                System.out.println("Pedido consultado em :"+ data);
                break;
            };
        }
       
        if (listaPedidos.isEmpty()){
            System.out.println("Lista vazia!");
        } 

        else if(pedido == false){
            System.out.println("Erro: pedido não encontrado!\n");
        } 

        System.out.println("\n--------Buscar outro Pedido(1) -------- Voltar(0)----");
        j = scanner.nextInt();
        scanner.nextLine();

        }while(j == 1);
    }

    public static void listarPedido(){
        System.out.printf("\n--------Lista de pedidos--------\n");
        int i = 1;
        
        for (Pedidos lista: listaPedidos) {
            System.out.printf("%d- %s | ID: %d | R$ %.2f\n", i, lista.getPedidoNome(), lista.getPedidoID(), lista.getValor());
            i++;
        }
    }

    public static void valorTotal(){
        System.out.printf("\n--------Valor total dos pedidos--------\n");
        int i = 1;
        float soma=0;
        
        for (Pedidos lista: listaPedidos) {
            System.out.printf("%d- %s | ID: %d | R$ %.2f\n", i, lista.getPedidoNome(), lista.getPedidoID(), lista.getValor());
            soma+= lista.getValor();     
            //lista.setValorTotalCalculado(soma);       
            i++;
        }

        System.out.println("------------------------------------------");
        System.out.printf("Total da Soma dos Pedidos\n R$%.2f", soma);
    }

    public static void produtos(){
        listaPedidos.add(new Pedidos("Mousepad Gamer RGB Redragon Neptune 80 X 30 cm ", 1201,(float) 98.00));
        listaPedidos.add(new Pedidos("Headset Gamer Redragon Zeus X RGB USB 7.1", 3240, (float) 389.90));
        listaPedidos.add(new Pedidos("Mouse Gamer Redragon STORM RGB 12400dpi preto, M808-RGB", 398, (float)159.90));
        listaPedidos.add(new Pedidos("Teclado Gamer Redragon Membrana Dyaus 2 Rgb - K509RGB", 4,(float) 149.90));
    };

    

    public static void main(String[] args) throws Exception {
    Loja.limparTela();
    produtos();
    
    Scanner menu = new Scanner(System.in);
    Scanner funcionario = new Scanner( System.in);  
    

    Funcionario funcionarios  = new Funcionario(); // novo funcionario no map

    
    System.out.println("--------LOGIN SISTEMA--------");    
    System.out.println("Digite sua Matrícula:");           
    int x=funcionario.nextInt();  
    System.out.println("-------------------");  
    System.out.println("Você entrou como: "+ funcionarios.getMap(x));
    int i=0;
    

    
    
        do{
            System.out.println("\n--------MENU PRINCIPAL--------");
            System.out.println("0- Sair"); //feito
            System.out.println("1- Inserir Pedido"); //feito
            System.out.println("2- Lista de Pedidos"); //feito
            System.out.println("3- Soma dos Pedidos"); //feito
            System.out.println("4- Buscar Pedido");//feito
            System.out.println("5- Remover Pedido");//feito
            System.out.println("6- Adicionar novo Funcionário");//feito
            System.out.println("7- Lista de Funcionários");//feito
            System.out.println("-------------------");
            int opcao = menu.nextInt();
            
            switch (opcao) {

                case 0:{
                    System.out.println("Sessão Finalizada!");
                    i=0;
                    break;
                }

                case 1: {
                    inserirPedido();
                    i=1;            
                    break;
                }
                case 2: {
                    listarPedido();                    
                    i=1; 
                    break;
                }

                case 3: {
                    valorTotal();                    
                    i=1; 
                    break;
                }

                case 4: {
                    buscarPedidoID();
                    i=1; 
                    break;
                }
                case 5: {
                    removerPedidoID();
                    i=1;            
                    break;
                }

                case 6: {
                    Funcionario.novoFuncionario();
                    i=1; 
                    break;
                }

                case 7: {
                    Funcionario.ListaDeFuncionarios();
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
     funcionario.close();
     
     
     
    }

}