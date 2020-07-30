public class Calcula_Idade{

	public static void main(String[] args){
        int anoAtual;
        int idade;
        int anoNascimento;
        
        anoNascimento = 2000;
        anoAtual = 2020;

        idade = anoAtual - anoNascimento;

        System.out.println("A idade do usuario : " + idade);
	}
}