package Aula03;

import java.util.Scanner;

public class Questão1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de pacientes: ");
        int pacientes = sc.nextInt();
        int idadeMaisVelho =0;

        for (int i =1; i <= pacientes ; i++){
            System.out.println("Informe a idade: " + i);
            int idade = sc.nextInt();
         if(idade > idadeMaisVelho){
             idadeMaisVelho = idade;
         }
        }
        System.out.println("Idade do mais velho é : " + idadeMaisVelho);





    }
}
