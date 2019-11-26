package Prova;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[8];
        int b[] = new int[8];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe o elemento " + i + " do vetor A: ");
            a[i] = sc.nextInt();
        }

        for (int i = b.length-1; i>=0; i--) {
            b[i] = a[i];
            System.out.println("vetor B: " + b[i]);
        }

            for (int i = 0; i < a.length; i++) {
                System.out.println("vetor A: " + a[i]);
            }


    }
}
