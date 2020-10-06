package projeto1;

public class Pessoa {

    private String nome;
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
    
    Pessoa(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }
}
