package compromissospessoas;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String sexo;
    private ArrayList(Compromissos) compromissos = new ArrayList<Compromissos>();

    public Pessoa() {
    }

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }
    
    public Compromissos getCompromissos(int index) {
        return compromissos.get(index);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setCompromissos (Compromissos compromissos) {
        this.compromissos.add(compromissos);
    }
    
}
