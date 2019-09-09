package Aula02;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media1, media2;
        System.out.println("Informe a sua primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Informe a sua segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Informe a seu terceira nota: ");
        nota3 = sc.nextDouble();
        media1 = nota1 + nota2 + nota3;
        media2 = media1 / 3;
        if (media2 <= 3) {
            System.out.println("Você está reprovado ");
        }else if ((media2 >3) && (media2 <=7) ) {
            System.out.println("Você precisará fazer o exame");
        }else{
            System.out.println("Você está aprovado");
        }

    }
}
