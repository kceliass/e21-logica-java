package projeto1;

public class Pessoa {

    private String nome;
    private double altura;
    private double peso;
    private String voz;
    private int anoNascimento;
    private int idade;
    /**
     * Construtor Vazio
     */
    Pessoa () {
        
    }
    
    /**
     * Construtor com parâmetro Nome
     * @param nome 
     */
    Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setVoz(String voz) {
        this.voz = voz;
    }
    
    public String getVoz() {
        return this.voz;
    }
    
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public int getAnoNascimento() {
        return this.anoNascimento;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void calculaIdade() {
        if(anoNascimento != 0) {
            int idade = 2020 - anoNascimento;
            setIdade(idade);
        }
    }
}
