import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    
    private String nome;
    private String dataFundacao;
    private String cnpj;
    private String email;
    private String telefone;
    private CodigoPostal cp= new CodigoPostal(); //novo objeto codigo postal

    static Scanner scanner = new Scanner(System.in); 
    static Scanner menu = new Scanner(System.in);   

    

    public Empresa(){                                                         //Construtor da classe Empresa;
        this.nome = "INSIGHT SOLUCOES EM TECNOLOGIA E COMPLIANCE LTDA.";
        this.cnpj = "29.779.498/0001-14";
        this.dataFundacao = ("26/08/2018");
        this.email = "contato@insight.com.br";
        this.telefone= "(27)3030-7045";    
        cp.setIndicativo(29122);
        cp.setExtensao(125);
    }

    public  void mostrar(){                                                     //Método para mostrar os dados da empresa;
                                         
        System.out.println("---------DADOS EMPRESARIAIS---------");             
        System.out.printf(getNome());    
        System.out.println("\nCNPJ: " + getCnpj());    
        System.out.println( "E-mail: "+ getEmail()); 
        System.out.println("Contato: " + getTelefone());         
        System.out.println("Data de Fundação: " + getDataFundacao()); 
        System.out.println("CEP: "+ cp.getIndicativo() + "-" +cp.getExtensao()) ;            
        System.out.println("");
        socios();
        System.out.println("");

        System.out.println("---------CADASTROS---------");
        System.out.println("Produtos Cadastrados: " + listaProduto.size()); 
        System.out.println("Fornecedores Cadastrados: " + listaFornecedor.size());
        System.out.println("Empregados Cadastrados: " + listaEmpregados.size());
        System.out.println("Cliente Cadastrados: " + listaClientes.size());
        System.out.println("");
    

    }

    public void socios(){
        System.out.println("--------FUNDADORES DA EMPRESA--------");
        System.out.println("Daniel Valadares Marculano");
        System.out.println("Danillo Hubner de Souza ");
        System.out.println("Erick Vinicius Mariz Magalhães");
        System.out.println("Guilherme Araujo Lopes");
        System.out.println("Luiz Gustavo Barcelos  Fernandes Perez");
    }
    
   
    private  List<Produto> listaProduto = new ArrayList<>();                    //Lista de Produtos

    public  void Produtos(){                                                   //Método para setar os produtos na lista
        listaProduto.add(new Produto("Headset Gamer HyperX Cloud Stinger, Drivers 50mm",(float) 229.90, 19, 2525));
        listaProduto.add(new Produto("HD Seagate BarraCuda, 2TB, 3.5´, SATA - ST2000DM008",(float) 329.90, 18, 2526));
        listaProduto.add(new Produto("Teclado Mecânico Gamer T-Dagger Bora, RGB, Switch Outemu Blue, ABNT2",(float) 179.90, 17, 2527));
        listaProduto.add(new Produto("Processador AMD Ryzen 7 5700G, 3.8GHz (4.6GHz Max Turbo)", (float)2139.90, 30, 45474));
        listaProduto.add(new Produto("Computador PC Gamer Skill AMD Ryzen 3, Placa de vídeo Radeon VEGA 8, 8GB DDR4, HD 1TB", (float)2468.90, 30, 84544));
        listaProduto.add(new Produto("Cadeira Gamer Husky Gaming Tempest 500", (float)1139.90, 30, 45474));
        listaProduto.add(new Produto("Notebook Gamer Acer Nitro 5 AMD Ryzen 5 4600H, NVIDIA GeForce GTX 1650, 8GB RAM", (float)5439.90, 30, 45474));

    }

    public  void mostrarProdutos(){                                            //Método para mostrar a lista de produtos
        System.out.printf("\n--------Lista de Produtos--------\n");
        int i = 1;
        
        for (Produto lista: listaProduto) {
            System.out.printf("%d- Produto: %s | Preço de venda: R$%.2f\n Quantidade em estoque: %d unidades | ID PRODUTO: %d | \n\n", i, lista.getDesignacao(), lista.getPrecoVendaPublico(), 
            lista.getStock(), lista.getProdutoID());
            i++;
        }

        if (listaProduto.isEmpty())
            {
                System.out.println("\nLista vazia!");
            } 
    }     

    public  void addProdutos(){                                                // Método para adicionar novos Produtos
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR PRODUTO--------");
            System.out.println("Digite o nome do produto:");
            
            String nomeProduto = scanner.nextLine();                        
           
            System.out.println("Digite o Valor do produto(R$):");
            float valor = scanner.nextFloat();

            System.out.println("Digite a quantidade do produto(Uni):");
            int estoque = scanner.nextInt();   
            
            System.out.println("Digite o codigo do produto(ID):");
            int idProduto = scanner.nextInt();

            listaProduto.add(new Produto(nomeProduto, valor, estoque, idProduto));

            System.out.println("\n Produto ("+ nomeProduto +") foi Adicionado.");
            System.out.printf("\nProduto: %s | Preço de venda: R$%.2f\n Quantidade em estoque: %d unidades | Código do Produto: %d\n", nomeProduto,valor, estoque, idProduto);          
            
            System.out.println("\n----Novo Produto(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }

    }

    public  void removerProduto(){                                          //Remove um produto da Lista
        int j = 1;

        do{
            System.out.println("\n--------Remover Produto--------\n Digite o ID do Produto:");
            int id = scanner.nextInt();
            boolean produto = false;            
    
            for (Produto i: listaProduto)
            {
                if (i.getProdutoID() == id){
                    produto = true;
                    listaProduto.remove(i);
                    System.out.println("Produto: " + i.getDesignacao() + " removido com sucesso!");                    
                    break; 
                };
             }    

             if (listaProduto.isEmpty())
            {
                System.out.println("Lista vazia!");
            } 

             else if(produto == false){
                System.out.println("Erro: Produto não encontrado.\n");
            }

            System.out.println("\n----Remover outro(1) -------- Voltar(0)----");
            j = scanner.nextInt();
            scanner.nextLine();

        }while(j == 1);
    }
   
    public  void menuProdutos(){                                            //Menu dos produtos
        
        int i = 0;

        do{
            System.out.println("--------MENU PRODUTOS--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Mostrar Produtos"); //feito
            System.out.println("2- Adicionar Produto"); //feito
            System.out.println("3- Remover Produto"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    mostrarProdutos();
                    i=1;            
                    break;
                }
                case 2: {
                    addProdutos();    
                    i=1;            
                    break;
                }
               
                case 3: {
                    removerProduto();                    
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }

    
    public void menuPessoas(){
        
        int i = 0;

        do{
            System.out.println("--------MENU PESSOAS--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Fornecedores"); //feito
            System.out.println("2- Empregados"); //feito
            System.out.println("3- Clientes"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    menuFornecedor();;
                    i=1;            
                    break;
                }
                case 2: {
                    menuEmpregado();   
                    i=1;            
                    break;
                }
               
                case 3: {
                    menuCliente();                  
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }
    

    private  List<Fornecedor> listaFornecedor = new ArrayList<>();

    public  void Fornecedores(){                                    //Método para setar os Fornecedores na lista
        listaFornecedor.add(new Fornecedor("Evelyn Melo Barbosa", 15915815980L, 25, 2500F,3000F, new CodigoPostal(83030,370)));
        listaFornecedor.add(new Fornecedor("Julia Dias Goncalves", 15945815980L, 30, 2500F,3000F, new CodigoPostal(72872,063)));
        listaFornecedor.add(new Fornecedor("Nicolas Cunha Almeida", 15914747880L, 50, 2500F,3000F, new CodigoPostal(35900,017)));
        listaFornecedor.add(new Fornecedor("Alice Sousa Castro", 17852196112L, 34, 2500F,3000F, new CodigoPostal(13082,632)));

    }

    public  void mostrarFornecedor(){
        System.out.printf("\n--------Lista de Fornecedores--------\n");
        int i = 1;
        
        for (Fornecedor lista: listaFornecedor) {
            System.out.printf("\n%d-Nome: %s | Idade: %d idade | CPF: %d |\n  Limite de Gastos: R$%.2f | Total de Dívida: R$%.2f |\n", i, lista.getNome(), lista.getIdade(),
             lista.getContribuinte(),lista.getPlafond(), lista.getValorEmDivida());
             lista.getCp().mostraCp();
            i++;
        }

        if (listaFornecedor.isEmpty())
            {
                System.out.println("\nLista vazia!");
            } 
    }     
    
    public  void addFornecedor(){
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR FORNECEDOR--------");
            System.out.println("Digite o nome:");            
            String nomeFornecedor = scanner.nextLine();                        
           
            System.out.println("\nDigite a Idade:");
            int idade = scanner.nextInt();

            System.out.println("\nDigite o CPF:");
            long cpf = scanner.nextLong();               
            int i=1;

            while(i!=0){
                String s = Long.toString(cpf);
                if(s.length() != 11){
                    
                    System.out.println("ERRO: Digite os 11 números do CPF");
                    System.out.println("\nDigite o CPF:");
                    cpf = scanner.nextLong();
                    i=1;
                }
                else{
                    i=0;
                }
            }
            
            System.out.println("\nDigite o Limite de Gastos:");
            float limite= scanner.nextFloat();

            System.out.println("\nDigite a Dívida Atual:");
            float divida= scanner.nextFloat();

            System.out.println("\nDigite os 5 primeiros Digitos do CEP:");
            int indicativo = scanner.nextInt();
            int j=1;
            
            while(j!=0){
                String s = Integer.toString(indicativo);
                if(s.length() != 5){
                    
                    System.out.println("ERRO: Digite os 5 primeiros números do CEP");
                    System.out.println("\nDigite os 5 primeiros Digitos do CEP:");
                    indicativo = scanner.nextInt();
                    j=1;
                }
                else{
                    j=0;
                }
            }

            System.out.println("\nDigite os 3 ultimos Digitos do CEP:");
            int extensao = scanner.nextInt();
            int k=1;
            
            while(k!=0){
                String s = Integer.toString(extensao);
                if(s.length() != 3){
                    
                    System.out.println("ERRO: Digite os 3 últimos números do CEP");
                    System.out.println("\nDigite os 3 últimos Digitos do CEP:");
                    extensao = scanner.nextInt();
                    k=1;
                }
                else{
                    k=0;
                }
            }

            listaFornecedor.add(new Fornecedor(nomeFornecedor, cpf, idade, limite, divida, new CodigoPostal(indicativo,extensao)));

            System.out.println("\nFornecedor ("+ nomeFornecedor +") foi Adicionado.");
            System.out.printf("Nome: %s | Idade: %d idade | CPF: %d |\nLimite de Gastos: R$%.2f | Total de Dívida: R$%.2f | CEP: %d-%d\n\n", nomeFornecedor, idade, cpf, limite, divida, indicativo, extensao);          
            
            System.out.println("\n----Novo Fornecedor(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }

    }

    public  void removerFornecedor(){
        int j = 1;

        do{
            System.out.println("\n--------Remover Fornecedor--------\n Digite o CPF:");
            long id = scanner.nextLong();
            boolean fornecedor = false;            
    
            for (Fornecedor i: listaFornecedor)
            {
                if (i.getContribuinte() == id){
                    fornecedor = true;
                    listaFornecedor.remove(i);
                    System.out.println("Fornecedor: " + i.getNome() + " removido com sucesso!");                    
                    break; 
                };
             }    

             if (listaFornecedor.isEmpty())
            {
                System.out.println("Lista vazia!");
            } 

             else if(fornecedor == false){
                System.out.println("Erro: Fornecedor não encontrado.\n");
            }

            System.out.println("\n----Remover outro(1) -------- Voltar(0)----");
            j = scanner.nextInt();
            scanner.nextLine();

        }while(j == 1);
    }

    public  void menuFornecedor(){
        
        int i = 0;

        do{
            System.out.println("--------MENU FORNECEDORES--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Mostrar Fornecedores"); //feito
            System.out.println("2- Adicionar Fornecedores"); //feito
            System.out.println("3- Remover Fornecedores"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    mostrarFornecedor();
                    i=1;            
                    break;
                }
                case 2: {
                    addFornecedor();    
                    i=1;            
                    break;
                }
               
                case 3: {
                    removerFornecedor();                    
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }
    
    
    private  List<Empregado> listaEmpregados = new ArrayList<>();

    public  void Empregados(){
        listaEmpregados.add(new Empregado("Leonardo Castro Melo", 38927424050L, 25, 21704555, 5000F, "Analista de Sistema", new CodigoPostal(89066, 705)));
        listaEmpregados.add(new Empregado("Joao Fernandes Martins", 97780895076L, 35, 21754555, 1500F,  "Estagiário", new CodigoPostal(31365, 260)));
        listaEmpregados.add(new Empregado("Otávio Oliveira Costa", 47396640032L, 19, 21764555, 1100F, "Engenheiro de Software", new CodigoPostal(85869,636)));
        listaEmpregados.add(new Empregado("Vinícius Cunha Castro", 96627689049L, 23, 21774555, 25075F,  "CEO", new CodigoPostal(17194, 010)));

    }

    public  void mostrarEmpregados() {
        System.out.printf("\n--------Lista de Empregados--------\n");
        int i = 1;
        
        for (Empregado lista: listaEmpregados) {
            System.out.printf("\n%d-Nome: %s | Idade: %d idade | CPF: %d | Matrícula: %d |\n  Cargo: %s | Salário Bruto: %.2f | Salário Líquido: %.2f |\n", i, lista.getNome(), lista.getIdade(), lista.getContribuinte(), lista.getNumeroSeccao(),
            lista.getCargo(),lista.getSalarioBase(), lista.getSalario());
            lista.getCp().mostraCp();
            i++;
        }

        if (listaEmpregados.isEmpty())
            {
                System.out.println("\nLista vazia!");
            } 
    }     
 
    public  void addEmpregados(){
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR EMPREGADO--------");
            System.out.println("Digite o nome:");            
            String nomeEmpregado = scanner.nextLine();                        
           
            System.out.println("\nDigite a Idade:");
            int idade = scanner.nextInt();

            System.out.println("\nDigite o CPF:");
            long cpf = scanner.nextLong();   
            int i=1;
            
            while(i!=0){
                String s = Long.toString(cpf);
                if(s.length() != 11){
                    
                    System.out.println("ERRO: Digite os 11 números do CPF");
                    System.out.println("\nDigite o CPF:");
                    cpf = scanner.nextLong();
                    i=1;
                }
                else{
                    i=0;
                }
            }

            System.out.println("\nDigite a matrícula:");
            int matricula= scanner.nextInt();

            System.out.println("\nDigite o Cargo:");
            String cargo= scanner.next();
            scanner.nextLine();

            System.out.println("\nDigite o Salário Bruto: ");
            Float salarioBruto = scanner.nextFloat();

            System.out.println("\nDigite os 5 primeiros Digitos do CEP:");
            int indicativo = scanner.nextInt();
            int j=1;
            
            while(j!=0){
                String s = Integer.toString(indicativo);
                if(s.length() != 5){
                    
                    System.out.println("ERRO: Digite os 5 primeiros números do CEP");
                    System.out.println("\nDigite os 5 primeiros Digitos do CEP:");
                    indicativo = scanner.nextInt();
                    j=1;
                }
                else{
                    j=0;
                }
            }

            System.out.println("\nDigite os 3 ultimos Digitos do CEP:");
            int extensao = scanner.nextInt();
            int k=1;
            
            while(k!=0){
                String s = Integer.toString(extensao);
                if(s.length() != 3){
                    
                    System.out.println("ERRO: Digite os 3 últimos números do CEP");
                    System.out.println("\nDigite os 3 últimos Digitos do CEP:");
                    extensao = scanner.nextInt();
                    k=1;
                }
                else{
                    k=0;
                }
            }

            listaEmpregados.add(new Empregado(nomeEmpregado, cpf, idade, matricula, salarioBruto, cargo, new CodigoPostal(indicativo, extensao)));

            System.out.println("\nEmpregado ("+ nomeEmpregado +") foi Adicionado.");
            System.out.printf("Nome: %s | Idade: %d idade | CPF: %d | Matrícula: %d |\nCargo: %s | Salário Bruto: R$%.2f | CEP: %d-%d  \n\n", nomeEmpregado, idade, cpf,matricula, cargo,salarioBruto,indicativo, extensao);
            
            System.out.println("\n----Novo Fornecedor(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public  void removerEmpregados(){
        int j = 1;

        do{
            System.out.println("\n--------Remover Empregado--------\n Digite a Matrícula:");
            int id = scanner.nextInt();
            boolean empregado = false;            
    
            for (Empregado i: listaEmpregados)
            {
                if (i.getNumeroSeccao() == id){
                    empregado = true;
                    listaEmpregados.remove(i);
                    System.out.println("Empregado: " + i.getNome() + " removido com sucesso!");                    
                    break; 
                };
             }    

             if (listaEmpregados.isEmpty())
            {
                System.out.println("Lista vazia!");
            } 

             else if(empregado == false){
                System.out.println("Erro: Empregado não encontrado.\n");
            }

            System.out.println("\n----Remover outro(1) -------- Voltar(0)----");
            j = scanner.nextInt();
            scanner.nextLine();

        }while(j == 1);
    }

    public  void menuEmpregado(){
        
        int i = 0;

        do{
            System.out.println("--------MENU EMPREGADO--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Mostrar Empregados"); //feito
            System.out.println("2- Adicionar Empregado"); //feito
            System.out.println("3- Remover Empregados"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    mostrarEmpregados();
                    i=1;            
                    break;
                }
                case 2: {
                    addEmpregados();    
                    i=1;            
                    break;
                }
               
                case 3: {
                    removerEmpregados();                    
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }

    private List<Cliente> listaClientes = new ArrayList<>();

    public  void Clientes(){
        listaClientes.add(new Cliente("Isabela Martins Rocha", 22430783096L, 25, 1000.00F,580.50F,new CodigoPostal(16624, 130) ));
        listaClientes.add(new Cliente("Laura Cavalcante Araujo", 78643763047L, 35, 1500.00F,1080.60F, new CodigoPostal(24746, 440) ));
        listaClientes.add(new Cliente("Lucas Rodrigues Cunha", 83872477072L, 28, 2500.00F,2000.00F, new CodigoPostal(91570, 140)));
        listaClientes.add(new Cliente("Emily Melo Fernandes", 92182587020L, 51, 5500.00F,3240.00F, new CodigoPostal(26519, 140)));
    }

    public  void mostrarClientes(){
        System.out.printf("\n--------Lista de Clientes--------\n");
        int i = 1;
        
        for (Cliente lista: listaClientes) {
            System.out.printf("\n%d-Nome: %s | Idade: %d idade | CPF: %d |\n  Limite de Gastos: R$%.2f | Total de Dívida: R$%.2f | Saldo: R$%.2f |\n", i, lista.getNome(), lista.getIdade(), lista.getContribuinte(),lista.getPlafond(), lista.getValorEmDivida(), lista.getSaldo());
            lista.getCp().mostraCp();
            i++;
        }

        if (listaFornecedor.isEmpty())
            {
                System.out.println("\nLista vazia!");
            } 
    }

    public  void addClientes(){
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR CLIENTE--------");
            System.out.println("Digite o nome:");            
            String nomeCliente = scanner.nextLine();                        
           
            System.out.println("\nDigite a Idade:");
            int idade = scanner.nextInt();

            System.out.println("\nDigite o CPF:");
            long cpf = scanner.nextLong();   
            int i=1;
            
            while(i!=0){
                String s = Long.toString(cpf);
                if(s.length() != 11){
                    
                    System.out.println("ERRO: Digite os 11 números do CPF");
                    System.out.println("\nDigite o CPF:");
                    cpf = scanner.nextLong();
                    i=1;
                }
                else{
                    i=0;
                }
            }

            System.out.println("\nDigite o Limite de Gastos:");
            float limite= scanner.nextFloat();

            System.out.println("\nDigite a Dívida Atual:");
            float divida= scanner.nextFloat();

            System.out.println("\nDigite os 5 primeiros Digitos do CEP:");
            int indicativo = scanner.nextInt();
            int j=1;
            
            while(j!=0){
                String s = Integer.toString(indicativo);
                if(s.length() != 5){
                    
                    System.out.println("ERRO: Digite os 5 primeiros números do CEP");
                    System.out.println("\nDigite os 5 primeiros Digitos do CEP:");
                    indicativo = scanner.nextInt();
                    j=1;
                }
                else{
                    j=0;
                }
            }

            System.out.println("\nDigite os 3 ultimos Digitos do CEP:");
            int extensao = scanner.nextInt();
            int k=1;
            
            while(k!=0){
                String s = Integer.toString(extensao);
                if(s.length() != 3){
                    
                    System.out.println("ERRO: Digite os 3 últimos números do CEP");
                    System.out.println("\nDigite os 3 últimos Digitos do CEP:");
                    extensao = scanner.nextInt();
                    k=1;
                }
                else{
                    k=0;
                }
            }

            listaClientes.add(new Cliente(nomeCliente, cpf, idade, limite, divida, new CodigoPostal(indicativo, extensao)));

            System.out.println("\nCliente ("+ nomeCliente +") foi Adicionado.");
            System.out.printf("Nome: %s | Idade: %d idade | CPF: %d |\nLimite de Gastos: R$%.2f | Total de Dívida: R$%.2f | CEP: %d-%d |\n\n", nomeCliente, idade, cpf, limite, divida, indicativo, extensao);          
            
            System.out.println("\n----Novo Cliente(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }

    }

    public  void removerClientes(){
        int j = 1;

        do{
            System.out.println("\n--------Remover Clientes--------\n Digite o CPF:");
            long id = scanner.nextLong();
            boolean clientes = false;            
    
            for (Cliente i: listaClientes)
            {
                if (i.getContribuinte() == id){
                    clientes = true;
                    listaClientes.remove(i);
                    System.out.println("Cliente: " + i.getNome() + " removido com sucesso!");                    
                    break; 
                };
             }    

             if (listaClientes.isEmpty())
            {
                System.out.println("Lista vazia!");
            } 

             else if(clientes == false){
                System.out.println("Erro: Cliente não encontrado.\n");
            }

            System.out.println("\n----Remover outro(1) -------- Voltar(0)----");
            j = scanner.nextInt();
            scanner.nextLine();

        }while(j == 1);
    }

    public  void menuCliente(){
        
        int i = 0;

        do{
            System.out.println("--------MENU CLIENTE--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Mostrar Clientes"); //feito
            System.out.println("2- Adicionar Cliente"); //feito
            System.out.println("3- Remover Cliente"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    mostrarClientes();
                    i=1;            
                    break;
                }
                case 2: {
                    addClientes();    
                    i=1;            
                    break;
                }
               
                case 3: {
                    removerClientes();                    
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFundacao() {
        return this.dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public CodigoPostal getCp() {
        return this.cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }


    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
