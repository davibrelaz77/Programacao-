package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double numero;
	double dobro;
	Scanner scanner = new Scanner(System.in);
	System.out.println("informe o número: ");
	numero = scanner.nextDouble();
	dobro = numero * 2;
    System.out.println("O dobro do número é: " + dobro);
    }
}
