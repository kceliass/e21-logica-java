import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExerciciosRevisao {
	public static void main(String[] arguments) {
//		questao1();
//		questao2();
//		questao3();
//		questao4();
//		questao5();
//		questao6();
//		questao7();
//		questao8();
//		questao9();
//		questao10();
		questao11();
		
		System.exit(0);
	}

	public static void questao1() {
		int nAleatorio;
		int contador = 0;
		int i = 0;
		
		Random rd = new Random();
		
		System.out.println("Numeros gerados: ");
		while(i < 50) {
			nAleatorio = rd.nextInt(400);
			System.out.println((i + 1) + " - " + nAleatorio);
			if (nAleatorio >= 10 && nAleatorio <= 100) {
				contador++;
			}
			
			i++;
		}
		
		System.out.println("A quantidade de numeros no intervalo é: " + contador);
	}
	
	public static void questao2() {
		int nAleatorio;
		int maiorPar = 0;
		int i = 0;
		
		Random rd = new Random();
		
		System.out.println("Numeros gerados: ");
		while(i < 50) {
			nAleatorio = rd.nextInt(400);
			System.out.println((i + 1) + " - " + nAleatorio);
			if (nAleatorio % 2 == 0 && nAleatorio > maiorPar) {
				maiorPar = nAleatorio;
			}
			
			i++;
		}
		
		System.out.println("Maior numero par encontrado:  " + maiorPar);
	}
	
	public static void questao3() {
		Scanner sc = new Scanner (System.in);
		
		int n, n1, n2, n3;
		
		System.out.println("Digite o valor do numero a: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o valor do numero b: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o valor do numero c: ");
		n3 = sc.nextInt();
		
		System.out.println("Digite como você quer organizar esses números \n1 - crescente \n2 - decrescente \n3 - maior fica no meio");
		n = sc.nextInt();
		
		switch(n) {
		case 1:
			if (n1 < n2 && n1 < n3) {
				if (n2 < n3) {
					System.out.println(n1 + ", " + n2 + ", " + n3);
				} else {
					System.out.println(n1 + ", " + n3 + ", " + n2);
				}
			}
			if (n2 < n1 && n2 < n3) {
				if (n1 < n3) {
					System.out.println(n2 + ", " + n1 + ", " + n3);
				} else {
					System.out.println(n2 + ", " + n3 + ", " + n1);
				}
			}
			if (n3 < n1 && n3 < n2) {
				if (n1 < n2) {
					System.out.println(n3 + ", " + n1 + ", " + n2);
				} else {
					System.out.println(n3 + ", " + n2 + ", " + n1);
				}
			}
			break;
		case 2:
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
			break;
		case 3:
			if (n1 > n2 && n1 > n3) {
				if (n2 > n3) {
					System.out.println(n3 + ", " + n1 + ", " + n1);
				} else {
					System.out.println(n2 + ", " + n1 + ", " + n1);
				}
			}
			if (n2 > n1 && n2 > n3) {
				if (n1 > n3) {
					System.out.println(n3 + ", " + n2 + ", " + n2);
				} else {
					System.out.println(n1 + ", " + n2 + ", " + n2);
				}
			}
			if (n3 > n1 && n3 > n2) {
				if (n1 > n2) {
					System.out.println(n2 + ", " + n3 + ", " + n3);
				} else {
					System.out.println(n1 + ", " + n3 + ", " + n3);
				}
			}
			break;
		}
		sc.close();
	}
	
	public static void questao4() {
		Scanner sc = new Scanner(System.in);
		
		double n = 0.0;
		double soma = 0.0;
		int i = 0;
		
		while(n >= 0) {
			System.out.println("Digite um número: ");
			n = sc.nextDouble();
			if (n < 0) {
				System.out.println("Média aritmética dos números digitados: " + (soma/i));
				break;
			}
			soma = soma + n;
			i = i + 1;
		}
		sc.close();
	}
	
	public static void questao5() {
		Scanner sc = new Scanner(System.in);
		
		int cod = 1;
		double n = 0.0;
		double soma = 0.0;
		int i = 0;
		
		while (cod > 0) {
			System.out.println("Digite o código do aluno: ");
			cod = sc.nextInt();
		
			if (cod == 0) {
				System.out.println("Código igual a zero. Programa encerrado");
				break;
			}
			while (i < 3) {
				System.out.println("Digite a nota " + (i + 1) + ": ");
				n = sc.nextInt();
				
				soma = soma + n;
				i++;
			}
			
			System.out.println("Média do aluno: " + (soma/i));
			
			soma = 0;
			i = 0;
			
			System.out.println("");
			System.out.println("Próximo aluno");
		}
		sc.close();
	}
	
	public static void questao6() {
		Scanner sc = new Scanner(System.in);
		
		int cod = 1;
		int voto1 = 0;
		int voto2 = 0;
		int voto3 = 0;
		int voto4 = 0;
		int nulo = 0;
		int branco = 0;
		
		while (cod > 0) {
			System.out.println("Em qual candidato deseja vota?  \n1 - Candidato 1 \n2 - Candidato 2 \n3 - Candidato 3 \n1 - Candidato 4 \n5 - Voto nulo \n6 - Voto em branco \n0 - Sair do programa e exeibir os resultados");
			cod = sc.nextInt();
			
			switch (cod) {
			case 1:
				voto1++;
				break;
			case 2:
				voto2++;
				break;
			case 3:
				voto3++;
				break;
			case 4:
				voto4++;
				break;
			case 5:
				nulo++;
				break;
			case 6:
				branco++;
				break;
			default:
				if (cod != 0) {
				System.out.println("Código inválido");
				}
			}
		}
		
		System.out.println("Resultados: ");
		System.out.println("Candidato 1: " + voto1);
		System.out.println("Candidato 2: " + voto2);
		System.out.println("Candidato 3: " + voto3);
		System.out.println("Candidato 4: " + voto4);
		System.out.println("Nulos: " + nulo);
		System.out.println("Branco: " + branco);
		
		sc.close();
	}
	
	public static void questao7() {
		Random rd = new Random();
		
		int nAleatorio = 0;
		int menor = 400;
		int maior = 0;
		
		for (int i = 0; i < 50; i++) {
			nAleatorio = rd.nextInt(400);
			System.out.println("[" + (i + 1) + "] - " + nAleatorio);
			if (nAleatorio > maior) {
				maior = nAleatorio;
			}
			if (nAleatorio < menor) {
				menor = nAleatorio;
			}
		}
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
	
	public static void questao8() {
		Random rd = new Random();
		
		int nAleatorio = 0;
		int menor = 400;
		int maior = 0;
		int soma = 0;
		
		for (int i = 0; i < 50; i++) {
			nAleatorio = rd.nextInt(400);
			System.out.println("[" + (i + 1) + "] - " + nAleatorio);
			if (nAleatorio > maior) {
				maior = nAleatorio;
			}
			if (nAleatorio < menor) {
				menor = nAleatorio;
			}
			soma += nAleatorio;
			
		}
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média: " + (soma/50));
	}
	
	public static void questao9() {
		Random rd = new Random();
		
		int nAleatorio = 0;
		int dentro = 0;
		int fora = 0;
		
		for(int i = 0;i < 10;i++) {
			nAleatorio = rd.nextInt(20);
			System.out.println("[" + (i + 1) + "] - " + nAleatorio);
			if (nAleatorio > 10 && nAleatorio < 20) {
				dentro += 1;
			} else {
				fora += 1;
			}
		}
		System.out.println("Nmueros que estão dentro do intervalo: " + dentro);
		System.out.println("Numeros que estão fora do intervalo: " + fora);
		
	}
	
	public static void questao10() {
		
		int altura = 0;
		int sexo = 0;
		int maior = 150;
		int menor = 200;
		int soma = 0;
		int somaF = 0;
		int iF = 0;
		int iTodos = 0;
		
		System.out.println("A altura está em centímetros");
		for(int i = 0;i < 50;i++) {
			altura = ThreadLocalRandom.current().nextInt(150, 201);
			sexo = ThreadLocalRandom.current().nextInt(1, 3);
			System.out.print("[" + (i + 1) + "] - " + altura + ", ");
			if (sexo == 1) {
				System.out.println("Homem  ");
			} else {
				System.out.println("Mulher  ");
			}
			if (altura > maior) {
				maior = altura;
			}
			if (altura < menor) {
				menor = altura;
			}
			if (sexo == 2) {
				somaF += altura;
				iF++;
			}
			soma += altura;
			iTodos++;
		}
		
		System.out.println("");
		System.out.println("Maior altura da turma: " + maior);
		System.out.println("Menor altura da turma: " + menor);
		System.out.println("Média de altura entra as mulheres: " + (somaF/iF));
		System.out.println("Média de altura da turma: " + (soma/iTodos));
		
	}
	
	public static void questao11() {
		int a = 0;
		if(a>=0) {
			System.out.println(a);
			a++;
		} else if(a==1) {
			System.out.println(a);
		}
		System.out.println("fim");
	}
	
}