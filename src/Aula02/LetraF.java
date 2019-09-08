package Aula02;

import java.util.Scanner;

public class LetraF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        int faltas;
        System.out.println("Informar a média ");
        media = sc.nextDouble();
        System.out.println("Informar o numero de faltas ");
        faltas = sc.nextInt();
        if (media >= 6.0 && faltas <= 40) {
            System.out.println("Você está aprovado(a)");
        } else if (media < 6.0 && faltas > 40) {
            System.out.println("Você está reprovado(a)");

    }else{
        System.out.println("Você está reprovado ");
                }

    }
}
