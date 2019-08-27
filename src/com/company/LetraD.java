package com.company;

import java.util.Scanner;

public class LetraD {
    public static void main(String args[]){
        double raio, perimetro, area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o raio: ");
        raio = scanner.nextDouble();
        perimetro = 2*Math.PI*raio;
        area = Math.PI*Math.pow(raio,2);
        System.out.println("O perímetro do círculo é: " + perimetro);
        System.out.println("A area do círculo é: " + area);
    }
}
