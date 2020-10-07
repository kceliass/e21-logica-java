package petshop;

import java.util.ArrayList;

public class Dono {
    private String nome;
    private int idade;
    private ArrayList<Pet> pet = new ArrayList<Pet>();
    
    /**
     * método vazio Dono
     */
    Dono(){
        
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public Pet getPet(int index) {
        return pet.get(index);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPet(Pet pet) {
        this.pet.add(pet);
    }
    
    public ArrayList<Pet> getPets() {
        return this.pet;
    }
    
}
