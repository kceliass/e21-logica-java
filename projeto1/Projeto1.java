package projeto1;

import java.util.concurrent.ThreadLocalRandom;

public class Projeto1 {

    public static void main(String[] args) {
//      questao1();
        questao2();
//      questao3();

        System.exit(0);
    }

    public static void questao1() {
        int[] vetor1 = new int[20];
        int[] vetor2 = new int[20];

        System.out.println("Vetor gerado: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = ThreadLocalRandom.current().nextInt(1, 100);
            System.out.print("[" + (i + 1) + "] = " + vetor1[i] + ", ");
            if (vetor1[i] % 2 == 0) {
                vetor2[i] = vetor1[i];
            } else {
                vetor2[i] = 0;
            }
        }

        System.out.println("");
        System.out.println("Vetor após tratamento: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("[" + (i + 1) + "] = " + vetor2[i] + ", ");
        }
    }

    public static void questao2() {
        int[][] matriz = new int[10][5];

        for (int i = 0; i < 10; i++) {
            System.out.println("    ");
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
        }
    }

    public static void questao3() {

    }

}
