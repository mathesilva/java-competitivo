package br.com.mfaias;

import java.util.Scanner;

public class Vampiros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {

            int EV1 = sc.nextInt();
            int EV2 = sc.nextInt();
            int AT = sc.nextInt();
            int D = sc.nextInt();

            if (EV1 == 0 && EV2 == 0 && AT == 0 && D == 0 ){
                break;
            }
            //MATH .CEIL arredonda para cima;
            //MATH .FLOOR arredonda para baixo;
            //MATH .ROUND arredonda normalmente;
            int n1 = (int) Math.ceil((double) EV1 / D);
            int n2 = (int) Math.ceil((double) EV2 / D);

            double p = (double) AT / 6.0;

            double resultado;

            //MATH .ABS valor absoluto
            if (Math.abs(p - 0.5) < 1e-9) {
                resultado = (double) n1 / (n1 + n2);
            } else {
                double q = (1.0 - p) /p;
                //MATH .POW potencia - (2,3) = 8
                resultado = (1.0 - Math.pow(q, n1))/ (1.0 - Math.pow(q, n1 + n2));

            }
            System.out.printf("%.1f%n", resultado * 100.0);
        }
        sc.close();






    }
}
