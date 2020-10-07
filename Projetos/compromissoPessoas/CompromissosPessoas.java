package compromissospessoas;

import java.util.ArrayList;
import java.util.Scanner;
public class CompromissosPessoas {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        ArrayList<Compromissos> compromissos = new ArrayList<Compromissos>();
        Scanner sc = new Scanner(System.in);
        
        int qtdPets = 0;
    
        System.out.println("Informe seu nome: ");
        dono.setNome(sc.next());
        
        System.out.println("Informe sua idade: ");
        dono.setIdade(Integer.parseInt(sc.next()));
        
        System.out.println("Digite quantos pets o dono possui: ");
        qtdPets = sc.nextInt();
        
        for(int i = 0; i < qtdPets;i++) {

        System.out.println("Informe o nome do pet: ");
        dono.getPet().setNome(sc.next());
        
        System.out.println("Informe o tipo do pet: ");
        dono.getPet().setTipo(sc.next());
        
        System.out.println("Informe a cor do pet: ");
        dono.getPet().setCor(sc.next());
        
        System.out.println("Nome do dono: " + dono.getNome());
        System.out.println("Idade do dono: " + dono.getIdade());
        System.out.println("Nome do pet: " + dono.getPet().getNome());
        System.out.println("Tipo do pet: " + dono.getPet().getTipo());
        System.out.println("Cor do pet: " + dono.getPet().getCor());
    }
}
