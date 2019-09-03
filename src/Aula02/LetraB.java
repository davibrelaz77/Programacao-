package Aula02;

import java.util.Scanner;

public class LetraB {
    public static void main(String[] args) {

        int producao, defeito;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantas peças foram produzidas");
        producao = sc.nextInt();
        System.out.println("Informe o número de peças com defeito");
        defeito = sc.nextInt();
        double linear = producao * 0.1;
        if (defeito <= linear) {
        System.out.println("Não precisa e manutenção");

             }else{


        System.out.println("Precisa de manutenção");
    }
        }
}
