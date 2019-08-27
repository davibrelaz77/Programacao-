package com.company;

import java.util.Scanner;

public class LetraE {
    public static void main(String args[]){
 double vendas, comissao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de vendas: ");
        vendas = scanner.nextDouble();
        comissao = vendas/10;
        System.out.println("O valor da comissão é: " + comissao);

    }
}
