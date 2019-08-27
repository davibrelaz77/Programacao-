package com.company;

import java.util.Scanner;

public class LetraF {
    public static void main(String args[]){
        double valor, quantidade, valorfinal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        valor = scanner.nextDouble();
        System.out.println("Informe a quantidade: ");
        quantidade = scanner.nextDouble();
        valorfinal = valor * quantidade;
        System.out.println("O valor final é: " + valorfinal);
     }
}

