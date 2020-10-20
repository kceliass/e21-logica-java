package br.com.escolaclasses;

public class Aluno extends Pessoa {
    private String turma;
    private String materia;
    private String nota;

    public Aluno(String nome, String turma, String materia, String nota) {
        setNome(nome);
        this.turma = turma;
        this.materia = materia;
        this.nota = nota;
    }
    
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
}
