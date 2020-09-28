import java.util.Scanner;

public class ExerciciosProfessor {
	public static void main(String[] arguments) {
//		questao6();
//		questao7_8();
	
		System.exit(0);
	}
	
	public static void questao6() { 
		Scanner sc = new Scanner(System.in);
		
		double altura = 0.0;
		int sexo = 0;
		
		System.out.println("Qual a altura? ");
		altura = sc.nextDouble();
		
		System.out.println("Qual o sexo? \n1 - MASCULINO \n2 - FEMININO");
		sexo = sc.nextInt();
		
		if (sexo == 1) {
			System.out.println("O seu peso ideal é: " + ((72.7 * altura) - 58));
		} else {
			System.out.println("O seu peso ideal é: " + ((62.1 * altura) - 44.7));
		}
		sc.close();
	}
	
	public static void questao7_8() {
		Scanner sc = new Scanner(System.in);
		
		int lados = 0;
		int base, h;
		
		System.out.println("Escreva o número de lados do polígono: ");
		lados= sc.nextInt();
		
		if (lados == 3) {
			System.out.println("Triângulo");
			System.out.println("Insira a base do triângulo: ");
			base = sc.nextInt();
			System.out.println("Insira a aultura do triângulo: ");
			h = sc.nextInt();
			System.out.println("ÁREA DO TRIÂNGULO INSERIDO: " + (base*h)/2);
		} else if (lados == 4) {
			System.out.println("Quadrado");
			System.out.println("Insira a base do quadrado: ");
			base = sc.nextInt();
			System.out.println("Insira a aultura do quadrado: ");
			h = sc.nextInt();
			System.out.println("ÁREA DO QUADRADO INSERIDO: " + (base*h));
		} else if (lados == 5) {
			System.out.println("Pentágono");
		} else if (lados < 3) {
			System.out.println("NÃO É UM POLÍGONO");
		} else if (lados > 5 ) {
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
		}
		
		sc.close();
	}
}
