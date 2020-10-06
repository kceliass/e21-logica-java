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
           
            System.out.println("Bem vindo, " + usuario.getNome());
        }else {
            System.out.println("Por favor, insira um nome válido.");
               
               }

    }
}
