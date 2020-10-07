package petshop;

import java.util.Scanner;

public class Petshop {

    public static void main(String[] args) {
        Dono dono = new Dono();
        Pet pet = new Pet();
        
        Scanner sc = new Scanner(System.in);
        
        String nomeDono, nomePet, tipo, cor, idade;
        int idadeInt;
        
       
        System.out.println("Informe seu nome: ");
        nomeDono = sc.nextLine();
        dono.setNome(nomeDono);
        
        System.out.println("Informe sua idade: ");
        idade = sc.nextLine();
        idadeInt = Integer.parseInt(idade);
        dono.setIdade(idadeInt);
        
        System.out.println("Informe o nome do pet: ");
        nomePet = sc.nextLine();
        pet.setNome(nomePet);
        
        System.out.println("Informe o tipo do pet: ");
        tipo = sc.nextLine();
        pet.setTipo(tipo);
        
        System.out.println("Informe a cor do pet: ");
        cor = sc.nextLine();
        pet.setCor(cor);
        
        dono.setPet(pet);
        
        System.out.println("Nome do dono: " + dono.getNome());
        System.out.println("Idade do dono: " + dono.getIdade());
        System.out.println("Nome do pet: " + dono.getPet().getNome());
        System.out.println("Tipo do pet: " + dono.getPet().getTipo());
        System.out.println("Cor do pet: " + dono.getPet().getCor());
    }
}
