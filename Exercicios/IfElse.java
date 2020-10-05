import java.util.Scanner;

public class IfElse {
	public static void main(String[] arguments) {
		//	questao1();
			questao2();
		// questao3();
		// questao4();
		// questao5();
		// questao6();
		// questao7();

		System.exit(0);
	}

	public static void questao1() {
		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.println("Escreva um número negativo ou positivo: ");
		n = sc.nextInt();

		if (n > 0) {
			System.out.println("Esse número é positivo!");
		} else if (n < 0) {
			System.out.println("Esse número é negativo!");
		} else {
			System.out.println("O número digitado é igual a zero!");
		}
		sc.close();
	}
	
	public static void questao2() {
		Scanner sc = new Scanner(System.in);

		int a,b,c;
		
		System.out.println(" Insira o Primeiro lado: ");
		a = sc.nextInt();
		
		System.out.println(" Insira o Segundo lado: ");
		b = sc.nextInt();
		
		System.out.println(" Insira o Terceiro lado: ");
		c = sc.nextInt();
		
		if (a + b > c && b + c > a && a + c > b) {
			System.out.println("Esse triângulo é valido.");
			if(a == b && a == c && b == c) {
				System.out.println("Equilátero");
			} else if (a == b || a == c || b == c) {
				System.out.println("Isósceles");
			} else {
				System.out.println("Escaleno");
			}
		} else {
			System.out.println("esse triangulo não é valido");
		}
		
		sc.close();
	}
}
