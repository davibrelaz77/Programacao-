package Aula02;

import java.util.Scanner;

public class LetraH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, resto;
        System.out.println("Informe o número");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");

        }
    }
}
