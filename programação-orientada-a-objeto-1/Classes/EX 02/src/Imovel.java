public class Imovel {
    private String nomeProprietario;
    private float imposto;
    private int mesesAtraso;
    private float valorFinal;

    public Imovel(String nomeProprietario, float imposto, int mesesAtraso) {
        this.nomeProprietario = nomeProprietario;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }

    public void setMesesAtraso(int mesesAtraso) {
        this.mesesAtraso = mesesAtraso;
    }

    public String getNomeProprietario(){
        return this.nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario){
        this.nomeProprietario = nomeProprietario;
    }

    public float getValorFinal(){
        return this.valorFinal;
    }

    public void calculaMulta(){
        if(this.mesesAtraso < 0){
            System.out.println("Erro! Valor de meses inválido!");
        } else {
            if(this.mesesAtraso <= 5){
                this.valorFinal = (float) (this.imposto + this.imposto*0.01);
            } else if(this.mesesAtraso <= 8){
                    this.valorFinal = (float) (this.imposto + this.imposto*0.023);
                } else if (this.mesesAtraso <= 10){
                        this.valorFinal = (float) (this.imposto + this.imposto*0.03);
                    } else if (this.mesesAtraso <= 12){
                            this.valorFinal = (float) (this.imposto + this.imposto*0.054);
                        } else {
                                this.valorFinal = (float) (this.imposto + this.imposto*0.1);
                            }
        }
    }
}
