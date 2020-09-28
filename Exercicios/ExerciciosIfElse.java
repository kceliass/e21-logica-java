import java.util.Scanner;


public class ExerciciosIfElse {
	public static void main(String[] arguments) {
		// questao1();
		// questao2();
		// questao3();
		// questao4();
		// questao5();
		// questao6();
		// questao7();
		questao8();

		System.exit(0);
	}

	public static void questao1() {
		Scanner sc = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;

		System.out.println("Escreva um número : ");
		n1 = sc.nextInt();

		System.out.println("Escreva outro número : ");
		n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " é maior que " + n2);
		} else if (n2 > n1) {
			System.out.println(n2 + " é maior que " + n1);
		} else {
			System.out.println("Os números são iguais");
		}
		sc.close();
	}

	public static void questao2() {
		Scanner sc = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;

		System.out.println("Escreva o número 1: ");
		n1 = sc.nextInt();

		System.out.println("Escreva o número 2: ");
		n2 = sc.nextInt();

		System.out.println("Escreva o número 3: ");
		n3 = sc.nextInt();

		System.out.println("Escreva o número 4: ");
		n4 = sc.nextInt();

		if (n1 < n2 && n1 < n3 && n1 < n4) {
			System.out.println("O menor número inserido é: " + n1);
		} else if (n2 < n1 && n2 < n3 && n2 < n4) {
			System.out.println("O menor número inserido é: " + n2);
		} else if (n3 < n1 && n3 < n2 && n3 < n4) {
			System.out.println("O menor número inserido é: " + n3);
		} else {
			System.out.println("O menor número inserido é: " + n4);
		}
		sc.close();
	}

	public static void questao3() {
		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.println("Escreva um número : ");
		n = sc.nextInt();

		if (n % 2 != 0) {
			System.out.println(n + " é impar");
		} else {
			System.out.println(n + " é par");
		}
		sc.close();
	}

	public static void questao4() {
		Scanner sc = new Scanner(System.in);

		String cod = "";

		System.out.println("Escreva o código do produto : ");
		cod = sc.nextLine();

		if (cod == "001") {
			System.out.println("001 - Arroz");
		} else if (cod == "002") {
			System.out.println("002 - Feijão");
		} else if (cod == "003") {
			System.out.println("003 - Farinha");
		} else {
			System.out.println("Diversos");
		}
		sc.close();
	}

	public static void questao5() {
		Scanner sc = new Scanner(System.in);

		int ano = 0;

		System.out.println("Escreva o ano que a pessoa nasceu: ");
		ano = sc.nextInt();

		int idade = 2020 - ano;

		if (idade > 15) {
			System.out.println("Essa pessoa pode votar");
		} else {
			System.out.println("Essa pessoa não pode votar");
		}
		sc.close();
	}

	public static void questao6() {
		Scanner sc = new Scanner(System.in);

		int senha = 0;

		System.out.println("SENHA: ");
		senha = sc.nextInt();

		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		sc.close();
	}

	public static void questao7() {
		Scanner sc = new Scanner(System.in);

		int macas = 0;
		double preco = 0;

		System.out.println("Quantas maçãs você vai querer: ");
		macas = sc.nextInt();

		if (macas >= 12) {
			System.out.println("Você vai pagar R$0.25 cada maçã.");
			preco = macas * 0.25;
		} else {
			System.out.println("Você vai pagar R$0.30 cada maçã");
			preco = macas * 0.30;
		}

		System.out.println("O preço total ficou: R$" + preco);
		sc.close();
	}

	public static void questao8() {
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Escreva o primeiro valor: ");
		n1 = sc.nextInt();

		System.out.println("Escreva o segundo valor: ");
		n2 = sc.nextInt();

		System.out.println("Escreva o terceiro valor: ");
		n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3) {
			if (n2 > n3) {
				System.out.println(n3 + ", " + n2 + ", " + n1);
			} else {
				System.out.println(n2 + ", " + n3 + ", " + n1);
			}
		}
		if (n2 > n1 && n2 > n3) {
			if (n1 > n3) {
				System.out.println(n3 + ", " + n1 + ", " + n2);
			} else {
				System.out.println(n1 + ", " + n3 + ", " + n2);
			}
		}
		if (n3 > n1 && n3 > n2) {
			if (n1 > n2) {
				System.out.println(n2 + ", " + n1 + ", " + n3);
			} else {
				System.out.println(n1 + ", " + n2 + ", " + n3);
			}
		}
		sc.close();
	}
}