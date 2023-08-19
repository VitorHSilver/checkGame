package checkGame.application;


import java.util.Scanner;

public class checkGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variáveis
        int[] meus_num1 = { 2, 4, 6, 7, 8, 10, 13, 14, 15, 17, 19, 21, 23, 24, 25 };
        int[] meus_num2 = { 2, 4, 6, 7, 8, 10, 13, 14, 15, 17, 19, 20, 21, 23, 25 };
        int[] num_dia = new int[15];
        int numero_repetido = 0;
        int numero_repetido2 = 0;

        String resposta = "sim";
        while (!resposta.equals("nao")) {
            numero_repetido = 0; // reseta a contagem
            numero_repetido2 = 0;

            System.out.println("Digite os números sorteados do dia:"); // entrada dos números corridos do dia
            String line = sc.nextLine();// manter leitura de varios dados na mesma linha
            for (int i = 0; i < num_dia.length; i++) {
                num_dia[i] = Integer.parseInt(line.substring(i * 2, i * 2 + 2));// pega a linha acima em String e coloca
                                                                                // em varias matrizes/indice, depois faz
                                                                                // sub classes
            }

            // varias matrizes/indice,sub classes| String[] numbers = line.split(" ");

            /**
             * loop para verificar número a número da variavel num_dia | loop para verificar
             * número a número da variavel meus_num1
             * depois pela a variavel e seus indices e converte de String para int if para
             * caso meus_num e seus indices e num_dia[]
             * forem parecidos guardarem em numero_repetido e incrementar ++;
             */

            for (int i = 0; i < num_dia.length; i++) { // converte string para int | num_dia[i] =
                                                       // Integer.parseInt(numbers[i]); */
                for (int j = 0; j < meus_num1.length; j++) {
                    if (meus_num1[j] == num_dia[i]) {
                        numero_repetido++;
                    }
                }
            }
            if (numero_repetido >= 11) { /* if caso os números repetidos sejam maior que 11 números */
                System.out.println("Ganhou prêmio!");
            }
            for (int i = 0; i < num_dia.length; i++) { /* mesmo bloco acima para o segundo jogo */
                for (int j = 0; j < meus_num2.length; j++)
                    if (meus_num2[j] == num_dia[i]) {
                        numero_repetido2++;
                    }
            }
            System.out.println("----------------------------------------------------");
            System.out.printf("Total acertos jogo N°1: %d%n", numero_repetido);
            System.out.printf("Total acertos jogo N°2: %d%n", numero_repetido2);
            System.out.println("----------------------------------------------------");
            System.out.println("Nova consulta? (Sim/Não)");
            resposta = sc.nextLine();

        } // while

        /* mostrar ao usuário */
        sc.close();
        if (numero_repetido2 >= 11) {
            System.out.println("Ganhou prêmio!");

        }

    }// fecha main
}// fecha classe
