package projeto1;

import java.util.Scanner;

public class Projeto00 {
    public static void main(String[] args) {
      questao1();
//      questao2();
//      questao3();

        System.exit(0);
    }

    public static void questao1() {
        Carro automovel= new Carro();
        Pessoa usuario = new Pessoa();
        
        Scanner sc = new Scanner(System.in);
        
        String ano;
        String idade;
        String nome;
        String carro;
        String sexo;
        int idadeInt;
        int anoInt;
        
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        usuario.setNome(nome);
    
        System.out.println("Informe sua idade: ");
        idade = sc.nextLine();
        idadeInt = Integer.parseInt(idade);
        usuario.setIdade(idadeInt);
        
        System.out.println("Informe seu sexo: ");
        sexo = sc.nextLine();
        usuario.setNome(sexo);
   
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        
        System.out.print("Informe seu carro: ");
        carro = sc.nextLine();
        automovel.setCarro(carro);
        
        System.out.println("Informe o ano do carro: ");
        ano = sc.nextLine();
        anoInt = Integer.parseInt(ano);
        automovel.setAno(anoInt);
        
        System.out.println("Carro: " + automovel.getCarro());
        System.out.println("Idade: " + automovel.getAno());

    }
}
