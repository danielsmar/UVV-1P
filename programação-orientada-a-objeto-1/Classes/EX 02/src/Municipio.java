public class Municipio {
    private String nome;
    private Imovel[] imoveis;

    public Municipio(String nome, Imovel[] imoveis) {
        this.nome = nome;
        this.imoveis = imoveis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Imovel[] getImoveis() {
        return imoveis;
    }

    public void setImoveis(Imovel[] imoveis) {
        this.imoveis = imoveis;
    }
}
