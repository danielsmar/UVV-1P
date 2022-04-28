
import java.util.Scanner;

import meuPacote.ValidaCNPJ;

public class Construtora {
    
    private String cnpj;
    private Endereco endereco;
    private String nome;
    private double totalDeVendas;
    private Corretor c1;
    private Corretor c2;
    private Corretor c3;



    public static void validadorCNPJ(){
    Scanner ler = new Scanner(System.in);
        
        String CNPJ;
        int i=1;
            do{  
                System.out.printf("\nInforme um CNPJ: ");
                CNPJ = ler.next();
            
                
                // usando os métodos isCNPJ() e imprimeCNPJ() da classe "ValidaCNPJ"
                if (ValidaCNPJ.isCNPJ(CNPJ) == true){
                    i=0;
                    System.out.printf("\nBem-Vindo: ");
                    System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));    
                    System.out.printf("----------------------------------\n");
                }
                else {
                    System.out.printf("CNPJ inválido, Digite Novamente!!!\n"); 
                    i=1;
                }
            }while( i!= 0);
            
            ler.close();



    }

    public Construtora(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }


    public void atualizaTotalVenda(){
        System.out.println("\n------TOTAL DE VENDAS (MENSAL)------");
        this.totalDeVendas = this.c1.getTotalVenda() + this.c2.getTotalVenda() + this.c3.getTotalVenda();
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTotalDeVendas() {
        return this.totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    public Corretor getC1() {
        return this.c1;
    }

    public void setC1(Corretor c1) {
        this.c1 = c1;
    }

    public Corretor getC2() {
        return this.c2;
    }

    public void setC2(Corretor c2) {
        this.c2 = c2;
    }

    public Corretor getC3() {
        return this.c3;
    }

    public void setC3(Corretor c3) {
        this.c3 = c3;
    }





   
   
}

