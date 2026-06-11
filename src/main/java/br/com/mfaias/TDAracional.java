package br.com.mfaias;

import java.util.Scanner;

public class TDAracional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();


        for (int a = 0; a < N; a++) {
            int N1 = sc.nextInt();
            String op1 = sc.next();
            int D1 = sc.nextInt();
            String op2 = sc.next();
            int N2 = sc.nextInt();
            String op3 = sc.next();
            int D2 = sc.nextInt();

            if (op2.equals("+")) {
                int numerador = N1 * D2 + N2 * D1;
                int denominador = D1 * D2;
                for (int i = denominador; i > 0; i--) {
                    if (denominador % i==  0 && numerador % i == 0) {
                        int mdc = i;
                        int numFinal = numerador / mdc;
                        int denFinal = denominador / mdc;
                        System.out.println(numerador + "/" + denominador + " = " + numFinal + "/" + denFinal);
                        break;
                    }
                }
            }
            if (op2.equals("-")) {
                int numerador = N1 * D2 - N2 * D1;
                int denominador = D1 * D2;
                for (int i = denominador; i > 0; i--) {
                    if (denominador % i == 0 && numerador % i == 0) {
                        int mdc = i;
                        int numFinal = numerador / mdc;
                        int denFinal = denominador / mdc;
                        System.out.println(numerador + "/" + denominador + " = " + numFinal + "/" + denFinal);
                        break;
                    }
                }
            }
            if (op2.equals("*")) {
                int numerador = N1 * N2;
                int denominador = D1 * D2;
                for (int i = denominador; i > 0; i--) {
                    if (denominador % i == 0 && numerador % i == 0) {
                        int mdc = i;
                        int numFinal = numerador / mdc;
                        int denFinal = denominador / mdc;
                        System.out.println(numerador + "/" + denominador + " = " + numFinal + "/" + denFinal);
                        break;
                    }
                }
            }
            if (op2.equals("/")) {
                int numerador = N1 * D2;
                int denominador = N2 * D1;
                for (int i = denominador; i > 0; i--) {
                    if (denominador % i == 0 && numerador % i == 0) {
                        int mdc = i;
                        int numFinal = numerador / mdc;
                        int denFinal = denominador / mdc;
                        System.out.println(numerador + "/" + denominador + " = " + numFinal + "/" + denFinal);
                        break;
                    }
                }
            }


        }

    }
}