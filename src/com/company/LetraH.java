package com.company;

import java.util.Scanner;

public class LetraH {
    public static void main(String []args) {
        double salario, parcial, salarioreajustado, percentualreajuste;

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Informe o salário: ");
        salario = scanner.nextDouble();
        System.out.println ("Informe o percentual de reajuste: ");
        percentualreajuste = scanner.nextDouble();
        parcial = salario * percentualreajuste;
        salarioreajustado = parcial + salario ;
        System.out.println("O salário reajustado é : " + salarioreajustado );

    }
}
