import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Prova0110 {
	public static void main(String[] arguments) {
//		questao1();
//		questao2();
//		questao3();
//		questao4();

		System.exit(0);
	}

	public static void questao1() {
		Scanner sc = new Scanner(System.in);

		int n1, n2, tentarDenovo = 0;
		
		do {
			System.out.println("Digite o primeiro valor: ");
			n1 = sc.nextInt();
	
			System.out.println("Digite o segundo valor: ");
			n2 = sc.nextInt();
	
			if (n2 != 0) {
				System.out.println("A divisão de " + n1 + " por " + n2 + " é: " + (n1 / n2));
			} else {
				System.out.println("O segundo número é igual a zero. Portanto, é impossivel fazer a divisão.");
				System.out.println("Sabendo disso, deseja tentar denovo? \n1 - Sim \n2 - Não");
				tentarDenovo = sc.nextInt();
				while (tentarDenovo != 1 && tentarDenovo != 2) {
					System.out.println("Por favor, selecione uma das opções: \n1 - Tentar novamente \n2 - Sair do programa");
					tentarDenovo = sc.nextInt();
				}
				if(tentarDenovo == 2) {
					System.out.println("Tudo bem. Programa encerrado.");
				}
			}
		} while (tentarDenovo == 1);
		
		sc.close();
	}

	public static void questao2() {
		int nAleatorio = ThreadLocalRandom.current().nextInt(25, 100);
		int soma = 0;
		
		System.out.println("o número sorteado foi: " + nAleatorio);
		
		for (int i = nAleatorio; i > 0; i--) {
			System.out.print(i + ", ");
			soma += i;	
		}
		System.out.println("");
		System.out.println("A soma dos números anteriores ao número sorteado é: " + soma);
	}

	public static void questao3() {
		Random rd = new Random();

		int maior = 0;
		int menor = 500;
		int soma = 0;
		int iMaior = 0;
		int iMenor = 0;

		for (int i = 0; i < 500; i++) {
			int n = rd.nextInt(500);
			System.out.println("[" + (i + 1) + "]" + " - " + n);
			if (n > maior) {
				maior = n;
				iMaior = i;
			}
			if (n < menor) {
				menor = n;
				iMenor = i;
			}
			soma += n;
		}

		System.out.println("O maior número dentre os 500 é " + maior + " e está na posição " + (iMaior + 1));
		System.out.println("O menor número dentre os 500 é " + menor + " e está na posição " + (iMenor + 1));
		System.out.println("A média de todos os 500 números é: " + (soma / 500));
	}

	public static void questao4() {
		Scanner sc = new Scanner(System.in);

		int nAleatorio = ThreadLocalRandom.current().nextInt(1, 16);
		int nUsuario = 0;
		int jogarDenovo = 0;

		do {
			System.out.println("Tente adinhar o número entre 1 e 15 gerado aleatóriamente pelo programa: ");
			nUsuario = sc.nextInt();
			if (nUsuario >= 1 && nUsuario <= 15) {
				if (nUsuario == nAleatorio) {
					System.out.println("Usuário acertou o número gerado, Parabéns!");
					break;
				} else {
					System.out.println("Usuário não acertou, gostaria de tentar novamente? \n1 - Tentar novamente \n2 - Sair");
					jogarDenovo = sc.nextInt();
					if (jogarDenovo == 2) {
						System.out.println("Até a próxima vez!");
						break;
					}
				}
			} else {
				System.out.println("Número digitado Inválido. Deseja tentar novamente? \n1 - Tentar novamente \n2 - Sair");
				jogarDenovo = sc.nextInt();
				if (jogarDenovo == 2) {
					System.out.println("Até a próxima vez!");
					break;
				}
			}
		} while (jogarDenovo == 1);

		sc.close();
	}
}