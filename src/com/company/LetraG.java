package com.company;

import java.util.Scanner;

public class LetraG {
    public static void main(String args[]){
        double comprimento, largura, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o comprimento da sala: ");
        comprimento = scanner.nextDouble();
        System.out.println("Informe a largura da sala: ");
        largura = scanner.nextDouble();
        area = largura * comprimento;
                System.out.println("A área da sala  é: " + area);
    }
}
