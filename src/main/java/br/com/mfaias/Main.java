package br.com.mfaias;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int caso = 0; caso < N; caso++) {

            String M = sc.nextLine();
            StringBuilder sb = new StringBuilder(M);

            for (int i = 0; i < sb.length(); i++) {
                char a = sb.charAt(i);
                if (Character.isLetter(a)) {
                    char resultado = (char) (a + 3);
                    sb.setCharAt(i, resultado);
                } else {
                    char letrarSoltas = a;
                    sb.setCharAt(i, letrarSoltas);
                }
            }
            sb.reverse();
            for (int i = sb.length() / 2; i < sb.length(); i++) {
                char b = sb.charAt(i);
                char resultado2 = (char) (b - 1);
                sb.setCharAt(i, resultado2);
            }
            System.out.println(sb);
        }
        sc.close();
    }
}

