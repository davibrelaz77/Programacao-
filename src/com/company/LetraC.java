package com.company;

import java.util.Scanner;

public class LetraC {
    public static void main(String args[])

    {


        double base;
        double altura;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a base: ");
        base = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        altura = scanner.nextDouble();
        area = base * altura / 2;
        System.out.println("A sua área é : " + area);

    }


}
