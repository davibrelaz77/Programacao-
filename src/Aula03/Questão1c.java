package Aula03;

import java.util.Scanner;

public class Questão1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double capital;
        int juros, periodo;
        System.out.println("Informe o valor do capital: ");
        capital = sc.nextDouble();
        System.out.println("Informe o valor do juros: ");
        juros = sc.nextInt();
        System.out.println("Informe a quantidade de meses: ");
        periodo = sc.nextInt();
        for (double valorfinal = capital/juros;  valorfinal <= periodo; valorfinal++);



    }
}
