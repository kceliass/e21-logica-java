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
			System.out.println("O seu peso ideal �: " + ((72.7 * altura) - 58));
		} else {
			System.out.println("O seu peso ideal �: " + ((62.1 * altura) - 44.7));
		}
		sc.close();
	}
	
	public static void questao7_8() {
		Scanner sc = new Scanner(System.in);
		
		int lados = 0;
		int base, h;
		
		System.out.println("Escreva o n�mero de lados do pol�gono: ");
		lados= sc.nextInt();
		
		if (lados == 3) {
			System.out.println("Tri�ngulo");
			System.out.println("Insira a base do tri�ngulo: ");
			base = sc.nextInt();
			System.out.println("Insira a aultura do tri�ngulo: ");
			h = sc.nextInt();
			System.out.println("�REA DO TRI�NGULO INSERIDO: " + (base*h)/2);
		} else if (lados == 4) {
			System.out.println("Quadrado");
			System.out.println("Insira a base do quadrado: ");
			base = sc.nextInt();
			System.out.println("Insira a aultura do quadrado: ");
			h = sc.nextInt();
			System.out.println("�REA DO QUADRADO INSERIDO: " + (base*h));
		} else if (lados == 5) {
			System.out.println("Pent�gono");
		} else if (lados < 3) {
			System.out.println("N�O � UM POL�GONO");
		} else if (lados > 5 ) {
			System.out.println("POL�GONO N�O IDENTIFICADO");
		}
		
		sc.close();
	}
}
