package petshop;

public class Dono {
    private String nome;
    private int idade;
    private Pet pet;
    
    /**
     * método vazio Dono
     */
    Dono(){
        
    }

    Dono(String nome, int idade, Pet pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    
    
    
}
