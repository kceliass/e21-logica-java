import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExerciciosSwitchCase {
	public static void main(String[] arguments) {
		// questao1();
		// questao2();
		// questao3();
		// questao4();
		 questao5();

		System.exit(0);
	}

	public static void questao1() {
		Scanner sc = new Scanner(System.in);

		String fruta = "";

		System.out.println("Digite o nome de uma fruta: ");
		fruta = sc.nextLine();

		switch (fruta.toLowerCase()) {
		case "ma�a":
			System.out.println("N�o vendemos essa fruta aqui.");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de kiwis");
			break;
		case "melancia":
			System.out.println("Aqui est�, s�o 3 reais o quilo");
			break;
		}

		sc.close();
	}

	public static void questao2 () {
		Scanner sc = new Scanner(System.in);
		
		String carro = "";
		
		System.out.println("Que carro deseja comprar? ");
		carro = sc.nextLine();
		
		switch (carro.toLowerCase()) {
		case "hatch":
			System.out.println("Compra efetuada com sucesso");
			break;
		case "sedan":
		case "motocicleta":
		case "caminhonete":
			System.out.println("Tem certeza que prefere esste modelo?");
			break;
		default:
			System.out.println("N�o trabalhamos com este tipo de autom�vel aqui.");
			break;
		}
		sc.close();
	}
	
	public static void questao3 () {
		Scanner sc = new Scanner(System.in);

		int operacao = 0;
		int n1, n2;

		System.out.println("Que tipo de opera��o que fazer? \n1 - SOMA \n2 - SUBTRA��O \n3 - MULTIPLICA��O \n4 - DIVIS�O");
		operacao = sc.nextInt();

		System.out.println("Digite o primeiro n�mero: ");
		n1 = sc.nextInt();

		System.out.println("Digite o primeiro n�mero: ");
		n2 = sc.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("O resultado da soma �: " + (n1 + n2));
		case 2:
			System.out.println("O resultado da subtra��o �: " + (n1 - n2));
		case 3:
			System.out.println("O resultado da multiplica��o �: " + (n1 * n2));
		case 4:
			System.out.println("O resultado da divis�o �: " + (n1 / n2));
		}
		sc.close();
	}
	
	public static void questao4 () {
		Scanner sc = new Scanner(System.in);
		
		int decisao = 0;
		
		System.out.println("Que tipo de produto voc� quer? \n1 - PRUDTOS N�O-PEREC�VEIS \n2 - FRUTAS \n3 - BEBIDAS");
		decisao = sc.nextInt();
		
		switch (decisao) {
		case 1:
			System.out.println("Arroz, feij�o, caf�");
			break;
		case 2:
			System.out.println("Manga, banana, ma��");
			break;
		case 3:
			System.out.println("Leite, sucos, refrigerantes");
			break;
		default:
			System.out.println("Valor inserido inv�lido");
			break;
		}
		sc.close();
	}
	
	public static void questao5 () {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int nRandom = ThreadLocalRandom.current().nextInt(1, 14);
		int soma = 0;
		
		System.out.print("Informe um n�mero de 1 a 20: ");
		n = sc.nextInt();
		
		System.out.println(" O n�mero aleat�rio gerado foi: " + nRandom);
		
		soma = nRandom + n;
		
		System.out.println("A soma do n�mero inserido e do n�mero gerado �: " + soma);
		
		switch (soma) {
		case 7:
			System.out.println("Voc� tirou 10 pontos");
			break;
		case 14:
			System.out.println("Voc� tirou 20 pontos");
			break;
		case 21:
			System.out.println("Voc� tirou 30 pontos. QUE SORTE!");
			break;
		default:
			if (soma > 0 && soma < 7) {
				System.out.println("Voc� tirou 1 ponto");
				break;
			} else if (soma > 7 && soma < 14) {
				System.out.println("Voc� tirou 5 pontos");
				break;
			} else if (soma > 14 && soma < 21) {
				System.out.println("Voc� tirou 6 pontos");
				break;
			} else { 
				System.out.println("A soma dos valores deu mais que 21. Voc� perdeu!");
				break;
			}
		}
		sc.close();
	}
}
