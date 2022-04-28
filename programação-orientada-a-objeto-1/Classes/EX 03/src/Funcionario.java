import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class Funcionario {
    
    private String nome;
    private int matricula;

    static Map<Integer, String> map = new HashMap<>();{
    map.put( 1234 ,"Daniel");
    map.put( 1224 ,"Guilherme");
    map.put( 1334 ,"Erick");
    map.put( 1233 ,"Danilo");
    }
    static Funcionario funcionarios  = new Funcionario(); // novo funcionario no map
    static Scanner funcionario = new Scanner( System.in);  
    
    public static void novoFuncionario(){
        int n = 1;

        while(n != 0){
            System.out.println("Insira o nome do novo funcionário:");
            String nickname=funcionario.nextLine();
            
            System.out.println("Insira a matrícula do novo funcionário:" ); //Adicionar novo Funcionario
            int key=funcionario.nextInt();
            
            funcionarios.inserirMap(key, nickname);            
            
            System.out.println("\n----Novo Funcionário(1) ---- Voltar(0)----");
            
            n = funcionario.nextInt();
            funcionario.nextLine();
        }
    }
    
    public static void ListaDeFuncionarios(){
        System.out.println("------LISTA DE FUNCIONÁRIOS------");
        for (Integer key: map.keySet()){  
			System.out.println("\nMatrícula: "+key+ " \nNome: " + map.get(key));
		} 
    }

  
    public void teste(int x){
        

        //for (Integer key : map.keySet()){

        }
    
    
    
    public void inserirMap(int matricula, String nome){
        map.put(matricula, nome);
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

    public String getMap(int x) {
        
        return map.get(x);
    }

    
    
}

