package Prova;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a;
        int x[][] = new int[3][3];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.println("Entre com o valor na posição [" + i + "," + j + "]: ");
                x[i][j] = sc.nextInt();
            }

        }
        System.out.println("Quadruplo dos valores pares da diagonal secundária: ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i + j == x.length - 1) {
                    if(x[i][j] %2==0){
                        System.out.println(x[i][j]*4);
                    }

                }
            }
        }
        System.out.println("=====MATRIZ=====");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
