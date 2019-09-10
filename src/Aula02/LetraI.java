package Aula02;

import java.util.Scanner;

public class LetraI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoideal;
        String sexo;

        System.out.println("Informe a altura");
        double altura = sc.nextDouble();
        System.out.println("Informe o seu sexo (masculino) ou (feminino)" );
        sexo = sc.next();
        if (sexo.toLowerCase().equals("masculino") || sexo.toLowerCase().equals("m")) {
            pesoideal = 72.7 * altura - 58;
            System.out.println(" Seu peso ideal é: " + pesoideal);
        }else{
            pesoideal = 62.1 * altura - 44.7;
            System.out.println("Seu peso ideal é: " + pesoideal);
        }





    }
}
