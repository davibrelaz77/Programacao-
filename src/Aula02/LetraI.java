package Aula02;

import java.util.Scanner;

public class LetraI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoideal;
        int sexo;

        System.out.println("Informe a altura");
        double altura = sc.nextDouble();
        System.out.println("Para informar seu sexo digite (1) para masculino e (2) para feminino" );
        sexo = sc.nextInt();
        if (sexo ==1 ) {
            pesoideal = 72.7 * altura - 58;
            System.out.println(" Seu peso ideal é: " + pesoideal);
        }else{
            pesoideal = 62.1 * altura - 44.7;
            System.out.println("Seu peso ideal é: " + pesoideal);
        }





    }
}
