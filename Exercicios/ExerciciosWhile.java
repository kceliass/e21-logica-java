import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExerciciosWhile {
	public static void main(String[] arguments) {
	//	questao1();
	//	questao2();
	//	questao3();
	//	questao4();
	//	questao5();
	//	questao6();
		questao7();
		
		System.exit(0);
	}
	
	public static void questao1() {
		int i = 0;
		
		while (i < 100) {
			if (!(i % 2 == 0)) {
				System.out.println(i);
			} 
			i++;
		}
	}
	public static void questao2() {
		int i = 0;
		
		while (i < 101) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public static void questao3() {
		int i = 0;
		
		while (i < 101) {
			if (i % 2 == 0) {
				System.out.println(i + " - PAR");
			} else {
				System.out.println(i + " - IMPAR");
			}
			i++;
		}
	}
	
	public static void questao4() {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int aluno = 0;
		double nota = 0.0;
		double soma = 0.0;
		
		System.out.println("Digite quantos alunos tem na sala: ");
		aluno = sc.nextInt();
		
		while (i < aluno) {
			System.out.println("Digite a nota no aluno " + (i+1));
			nota = sc.nextDouble();
			soma += nota;
			i++;
		}
		
		System.out.println("A média da turma é: " + soma / aluno);
		
		sc.close();
	}
	
	public static void questao5() {
		Scanner sc = new Scanner(System.in);
		
		int decisao = 0;
		
		System.out.println("Como você quer que os números de 1 a 20 sejam impressos? \n1 - HORIZONTAL \n2 - VERTICAL");
		decisao = sc.nextInt();
		
		int i = 0;
		if (decisao == 1) {
			while (i < 21) {
				System.out.print(i + ", ");
				i++;
			}
		}
		if (decisao == 2) {
			while (i < 21) {
				System.out.println(i);
				i++;
			}
		}
		
		sc.close();
	}
	
	public static void questao6() {
		
		int i = 1000;
		
		System.out.println("Números de 1000 a 1999 que o resto da divisão por 11 é igual a 5: ");
		
		while (i < 2000) {
			if (i % 11 == 5) {
				System.out.println(i);
			}
		i++;
		}
	}
	
	public static void questao7 () {
		Scanner sc = new Scanner(System.in);
		
		int nRandom = ThreadLocalRandom.current().nextInt(1, 20);
		int nUsuario = 0;
		int chances = 3;
		
		System.out.println("Você tem 3 chances de acertar o número aleatório gerado pelo programa:");
		
		while (chances > 0 ) {
			nUsuario = sc.nextInt();
			if (nUsuario == nRandom) {
				System.out.println("Parabens! Você acertou!");
				System.exit(0);
			} else {
				chances--;
				System.out.println("Você errou! você tem mais " + chances + " tentativas");
			}
		}
		
		System.out.println("O seu número de tentativas chegou a 0. Você Perdeu!");
		
		sc.close();
	}
}
