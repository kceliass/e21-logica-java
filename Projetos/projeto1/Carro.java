package projeto1;

public class Carro {

    private String carro;
    private int ano;
    /**
     * Construtor Vazio
     */
    Carro () {}
    
    /**
     * Construtor com parâmetro carro
     * @param carro
     */
    Carro(String carro) {
        this.carro = carro;
    }
    
    Carro(String carro, int ano) {
        this.carro = carro;
        this.ano = ano;
    }
    
    public void setCarro(String carro) {
        this.carro = carro;
    }
    
    public String getCarro() {
        return this.carro;
    }
    
    public void setAno (int ano) {
        this.ano = ano;
    }
    
    public int getAno() {
        return this.ano;
    }
}