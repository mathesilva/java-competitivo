package br.com.mfaias;

import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int numAnterior = sc.nextInt();
        int resposta = 1;

        for (int n = 1; n < N; n++) {
            int atual = sc.nextInt();
                if (atual != numAnterior) {
                    resposta ++;
                }
                numAnterior = atual;
            }
        System.out.println(resposta);
        sc.close();
        }
    }
