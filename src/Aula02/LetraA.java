package Aula02;

import java.util.Scanner;

public class LetraA {
    public static void main(String []args) {
        ;
        Scanner sc = new Scanner(System.in);
        int totalcopias;

        System.out.println("Informe o total de cópias ");
        totalcopias = sc.nextInt();
        double totalpago;

        if (totalcopias <= 100) {
            double totalcopioas;
            totalpago = totalcopias * 0.26;
        } else {
            totalpago = totalcopias * 0.20;

        }
        System.out.println("Total a ser pago é R$: "+totalpago);
    }

}
