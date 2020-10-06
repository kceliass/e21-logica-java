package projeto1;

import java.util.Scanner;

public class Projeto00 {

    public static void main(String[] args) {
        Pessoa usuario = new Pessoa();
        
        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();

        if (!"".equals(nome)) {
           usuario.setNome(nome);
           
            
        }else {
            System.out.println("Por favor, insira um nome válido.");
        }
        
        System.out.println("Bem vindo, " + usuario.getNome());
        System.out.println("Informe seu ano de nascimento: ");
        int nascimento = sc.nextInt();
        usuario.setAnoNascimento(nascimento);
        
        System.out.println("Ano de Nascimento: " + usuario.getAnoNascimento());
        System.out.println("Idade: " + usuario.getIdade());

    }
}
