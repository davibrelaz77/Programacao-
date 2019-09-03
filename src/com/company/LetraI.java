package com.company;

import java.util.Scanner;

public class LetraI {
    public static void main(String [] args) {
        double valor, percentualdesconto, desconto, valorfinal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da compra: ");
        valor = scanner.nextDouble();
        System.out.println("Informe o percentual de reajuste: ");
        percentualdesconto = scanner.nextDouble();
        desconto = valor * percentualdesconto;
        valorfinal = desconto - valor;
        System.out.println("O valor final é: " + valorfinal);
    }
}
