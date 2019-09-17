package Aula03;

import java.util.Scanner;

public class Questão1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas: ");
        int avaliacao = sc.nextInt();
        double media = 0;
        for (int i=1; i<=avaliacao; i ++){
            System.out.println("Informe a nota: " + i);
            double nota = sc.nextInt();
            media = media + nota;
        }
        media = media / avaliacao;
        System.out.println("Média final: " + media);


    }
}
