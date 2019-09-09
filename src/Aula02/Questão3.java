package Aula02;

import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma, raiz, numero1, numero2;
        int numero;
        System.out.println("Se você deseja somar dois números, digite (1). Se você quiser a raiz quadrada de um número digite (2)");
        numero = sc.nextInt();
        if (numero == 1) {
            System.out.println("Digite o primeiro número");
            numero1 = sc.nextDouble();
            System.out.println("Digite o segundp número");
            numero2 = sc.nextDouble();
            soma = numero1 + numero2;
            System.out.println("A soma dos dois números é: " + soma);
        }else if (numero == 2) {
            System.out.println("Digite o número");
            numero1 = sc.nextDouble();
            raiz = numero1 * numero1;
            System.out.println("A raiz quadrada é: " + raiz);


        }
    }
}
