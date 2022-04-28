public class CodigoPostal {
    
    private int indicativo; //5 primeiros digitos do CEP
    private int extensao;   //3 ultimos digitos do CEP
    private String zona;    // Zona referente a regiao que o CEP pertence
    

        
    public CodigoPostal(){

    }

    public CodigoPostal(int indicativo, int extensao){ //construtor do código Postal
        this.indicativo = indicativo;
        this.extensao = extensao;
    }   

 //FONTE https://pt.wikipedia.org/wiki/Código_de_Endereçamento_Postal#Sufixos
    public void mostraCp() {                            // o primeiro digito do CEP corresponde  a uma Zona no mapa do continente, 
        if (getIndicativo()/10000 == 0){
            this.setZona("|Grande SP|");
        } else if (getIndicativo()/10000 == 1){
            this.setZona("|Interior e Litoral de SP|");
        } else if (getIndicativo()/10000 == 2){
            this.setZona("|RJ|ES|");
        } else if (getIndicativo()/10000 == 3){
            this.setZona("|MG|");
        } else if (getIndicativo()/10000 == 4){
            this.setZona("|BH|SE|");
        } else if (getIndicativo()/10000 == 5){
            this.setZona("|PE|AL|PB|RN|");
        } else if (getIndicativo()/10000 == 6){
            this.setZona("|CE|PI|MA|PA|AP|AM|RR|AC|");
        } else if (getIndicativo()/10000 == 7){
            this.setZona("|DF|GO|RO|TO|MT|MS|");
        } else if (getIndicativo()/10000 == 8){
            this.setZona("|PR|SC|");
        } else{
            this.setZona("RS");
        }
        System.out.println("  CEP: "+getIndicativo()+"-"+getExtensao()+", "+ getZona()); // printa o CEP no formato xxxxx-xxx
    }
    

    public int getIndicativo() {
        return this.indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    public int getExtensao() {
        return this.extensao;
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public String getZona() {
        return this.zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

}
