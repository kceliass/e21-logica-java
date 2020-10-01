import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExerciciosVetor {
	public static void main(String[] arguments) {
//		questao1();
//		questao2();
//		questao3();
//		questao4();
//		questao5();
//		questao6();
//		questao7();
//		questao8();
		questao9();
//		questao10();

		System.exit(0);
	}

	public static void questao1() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[12];
		int x, y, somaVetor;

		System.out.println("Vetor: ");

		for (int i = 0; i < 12; i++) {
			vetor[i] = rd.nextInt(100);
			System.out.print(vetor[i] + ", ");
		}

		System.out.println("");

		System.out.println("Digite uma posição no vetor[1 até 12]: ");
		x = sc.nextInt();

		System.out.println("Digite outra posição no vetor[1 até 12]: ");
		y = sc.nextInt();

		somaVetor = vetor[x - 1] + vetor[y - 1];

		System.out.println("A soma do valor das duas posiçôes é: " + somaVetor);
		
		sc.close();
	}

	public static void questao2() {

		int[] vetor = new int[10];

		System.out.println("Vetor: ");
		
		int j = 0;
		int i = 0;
		while(i < 20) {
			if (i % 2 != 0) {
				vetor[j] = i;
				j++;
			}
			i++;
		}
		
		for (int k = 0; k < 10; k++) {
			System.out.println("[" + (k+1) + "] = " + vetor[k]);
		}
	}

	public static void questao3() {
		Random rd = new Random();

		int[] vetorOriginal = new int[16];
		int[] vetorInverso = new int[16];

		System.out.println("Vetor Original: ");

		for (int i = 0; i < 16; i++) {
			vetorOriginal[i] = rd.nextInt(100);
			System.out.print(vetorOriginal[i] + ", ");
		}
		for (int i = 0; i < 8; i++) {
			vetorInverso[i + 8] = vetorOriginal[i];
			vetorInverso[i] = vetorOriginal[i + 8];
		}

		System.out.println("");
		System.out.println("Vetor Inverso: ");

		for (int i = 0; i < 16; i++) {
			System.out.print(vetorInverso[i] + ", ");
		}
	}
	
	public static void questao4() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int [20];
		int x;
		
		System.out.println("Vetor: ");
		for (int i = 0; i < 20;i++) {
			vetor[i] = rd.nextInt(100);
			System.out.println("[" + (i+1) + "] = " + vetor[i]);
		}
		
		System.out.println("Digite uma posição do vetor acima[1 até 20]: ");
		x = sc.nextInt();
		
		System.out.println("O número que está nessa posição é: " + vetor[x - 1]);
		
		sc.close();
	}
	
	public static void questao5() {
		Random rd = new Random();
		
		int[] vetor = new int [40];
		int qtdPares = 0;
		
		for (int i = 0; i < vetor.length;i++) {
			vetor[i] = rd.nextInt(100);
		}
		
		System.out.println("Vetor: ");
		
		for (int i = 0; i < vetor.length;i++) {
			System.out.println("[" + (i+1) + "] = " + vetor[i]);
		}
		
		System.out.println("Mesmo vetor apenas com pares: ");
		
		for (int j = 0; j < vetor.length;j++) {
			if (vetor[j] % 2 == 0) {
				System.out.println("[" + (j+1) + "] = " + vetor[j]);
				qtdPares = qtdPares +  1;
			}
		}
		
		System.out.println("O número de pares no vetor é: " + qtdPares);
	
	}
	
	public static void questao6() {
		int [] vetor = new int [40];
		
		System.out.println("Vetor Original: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ThreadLocalRandom.current().nextInt(-100, 100);
			System.out.println("[" + (i+1) + "] = " + vetor[i]);
		}
		
		for(int i = 0; i < vetor.length;i++) {
			if (vetor[i] < 0) {
				vetor[i] = 0;
			}
		}
		
		System.out.println("Vetor depois de tratamento: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + (i+1) + "] = " + vetor[i]);
		}
	}
	
	public static void questao7() {
		Random rd = new Random();
		
		int[] vetor1 = new int[20];
		int[] vetor2 = new int[20];
		int[] vetorCompleto = new int [40];
		int i1 = 0;
		int i2 = 0;
		
		for (int i = 0; i < 20; i++) {
			vetor1[i] = rd.nextInt(100);
			vetor2[i] = rd.nextInt(100);
		}
		
		System.out.println("Vetor Um: ");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("[" + i + "] = " + vetor1[i] + ", ");
		}
		
		System.out.println("");
		System.out.println("Vetor Dois: ");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print("[" + i + "] = " + vetor2[i] + ", ");
		}
		
		for (int i = 0; i < vetorCompleto.length;i++) {
			if(i % 2 == 0) {
				vetorCompleto[i] = vetor1[i1];
				i1++;
			} else if (i % 2 != 0) {
				vetorCompleto[i] = vetor2[i2];
				i2++;
			}		
		}
		
		System.out.println("");
		System.out.println("Vetor Completo: ");
		for (int i = 0; i < vetorCompleto.length; i++) {
			System.out.print("[" + i + "] = " + vetorCompleto[i] + ", ");
		}
	}
	
	public static void questao8() {
		Random rd = new Random();
		
		int[] vetor = new int [40];
		int[] vetorModificado = new int [40];
		
		System.out.println("Vetor Original: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(400);
			System.out.print("[" + i + "] = " + vetor[i] + ", ");
			if (i != 0) {
				vetor[i] += vetor[i-1];
			}
		}
		
		System.out.println("");
		System.out.println("Vetor Modificado: ");
		for (int i = 0; i < vetor.length;i++) {
			System.out.print("[" + i + "] = " + vetor[i] + ", ");
		}
	}
	
	public static void questao9() {
		Scanner sc = new Scanner(System.in);
		
		String[] frase1 = {"G", "O", "S", "T", "O", " ","D","E"," ", "P", "Ã", "O"};
		String[] frase2 = new String[frase1.length];
		
		
		for (int i = 0; i < frase1.length; i++) {
			System.out.print(frase1[i]);
		}
		
		for (int i = 0; i < frase1.length;i++) {
			if (frase1[i] != " ") {
				frase2[i] = frase1[i];
			} else {
				frase2[i] = "";
			}
		}
		
		System.out.println("");
		for (int i = 0; i < frase2.length; i++) {
			System.out.print(frase2[i]);
		}
		
		sc.close();
	}
	
	public static void questao10() {
		Scanner sc = new Scanner(System.in);
		
		String[] frase1 = {"G", "O", "S", "T", "O", " ","D","E"," ", "P", "Ã", "O"};
		String[] frase2 = new String[frase1.length];
		
		
		for (int i = 0; i < frase1.length; i++) {
			System.out.print(frase1[i]);
		}
		
		for (int i = 0; i < frase1.length;i++) {
			if (frase1[i] != " ") {
				frase2[i] = frase1[i];
			} else {
				frase2[i] = "";
			}
		}
		
		System.out.println("");
		for (int i = 0; i < frase2.length; i++) {
			System.out.print(frase2[i]);
		}
		
		sc.close();
	}
}
