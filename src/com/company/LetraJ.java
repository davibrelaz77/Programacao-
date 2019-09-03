package com.company;

import java.util.Scanner;

public class LetraJ {
    public static void main(String [] args) {
        double valor, cotacaodolar, valorfinal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor Real: ");
        valor = scanner.nextDouble();
        System.out.println("Informe a cotação do dólar: ");
        cotacaodolar = scanner.nextDouble();
        valorfinal = valor * cotacaodolar/100;
        System.out.println("O valor convertido é: " + valorfinal);
    }
}
