import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        Calculadora.limparTela();
        System.out.println("----------------------------------- ");
        System.out.println("----  CALCULO IPTU VILA VELHA  ---- ");
        System.out.println("----------------------------------- ");
        
        System.out.println("\nDigite seu Nome:");
        Scanner s = new Scanner(System.in);      
        String nome = s.nextLine();

        System.out.println("\nDigite o valor(R$) do imposto:");
        float imposto = Float.parseFloat(s.next());

        System.out.println("\nDigite a quantidade de meses de atraso:");
        int mes = Integer.parseInt(s.next());
        System.out.println("\n");


        Imovel i0 = new Imovel(nome, imposto, mes);
        Imovel i1 = new Imovel("Erick", 100, 9);
        Imovel i2 = new Imovel("Daniel", 100, 6);
        Imovel i3 = new Imovel("Guilherme", 100, 11);

        Imovel[] imoveis = new Imovel[4];

        imoveis[0] = i0;
        imoveis[1] = i1;
        imoveis[2] = i2;
        imoveis[3] = i3;

        Municipio vvCity = new Municipio("Vila Velha", imoveis);

        for(Imovel i : vvCity.getImoveis()){
            i.calculaMulta();
            System.out.printf("Multa do %s R$ %.2f\n" , i.getNomeProprietario() , i.getValorFinal());
        }
        s.close();
        System.out.println("\n");
    }
}
