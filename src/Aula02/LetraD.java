package Aula02;

import java.util.Scanner;

public class LetraD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println ("Informe o primeiro número");
        numero1 = sc.nextInt();
        System.out.println("Informe o segundo número");
        numero2 = sc.nextInt();
        System.out.println("Informe o terceiro número");
        numero3 = sc.nextInt();
        if (numero1 = numero2 && numero1 = numero3) {
            System.out.println("É um triângulo equilatero");

        }else if(numero1 = numero2 || numero1 = numero3) {
            System.out.println("É um triângulo isósceles ");
        }else{
            System.out.println("É um triângulo escaleno");

        }

    }
}
