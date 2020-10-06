package projeto1;

import java.util.Scanner;

public class Projeto00 {
    public static void main(String[] args) {
//      questao1();
//      questao2();
//      questao3();

        System.exit(0);
    }

    public static void questao1() {
        Pessoa usuario = new Pessoa();
        Scanner sc = new Scanner(System.in);
        
        int idade;
        String nome;
        
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        usuario.setNome(nome);
    
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        usuario.setIdade(idade);
   
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());

    }
}
