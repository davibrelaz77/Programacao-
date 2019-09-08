package Aula02;

import java.util.Scanner;

public class LetraE {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero1, numero2, numero3;
        System.out.println("Informe o número 1");
        numero1 = sc.nextInt();
        System.out.println("Informe o número 2");
        numero2 = sc.nextInt();
        System.out.println("Informe o número 3");
        numero3 = sc.nextInt();
        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println("A ordem crescente dos números é: " + numero1 + numero2 + numero3);
        }else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
            System.out.println("A ordem crescente dos números é: " + numero2 + numero1 + numero3);
        }else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
            System.out.println("A ordem crescente dos números é:" + numero3 + numero1 + numero2);
        }else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
            System.out.println("A ordem crescente dos números é: " + numero1 + numero3 + numero2);
        }else if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
            System.out.println("A ordem crescente dos números é: " + numero2 + numero3 + numero1);
        }else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero3) {
            System.out.println("A ordem crescente dos números é: " + numero3 + numero2 + numero1);
        }



        }

    }


