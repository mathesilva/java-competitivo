package br.com.mfaias;

import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        for (int n = 0; n < N; n++){

            int F1 = sc.nextInt();
            int F2 = sc.nextInt();

            for (int i = F2; i > 0; i--) {
                if (F2 % i == 0 && F1 % i == 0) {
                    int mdc = i;
                    System.out.println(mdc);
                    break;
                }
            }

        }




    }
}
