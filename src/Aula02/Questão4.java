package Aula02;

import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, reajusteparcial, novosalario;
        int cargo;
        
        System.out.println("Para informar seu cargo digite: (1) Escrituário, (2) Secretário, (3) Caixa, (4) Gerente, (5) Diretor:");
        cargo = sc.nextInt();
        System.out.println("Informe o seu salário ");
        salario = sc.nextDouble();
        if (cargo == 1) {
            reajusteparcial = salario * 0.5;
            novosalario = salario + reajusteparcial;
            System.out.println("Para o seu cargo de escrituário(a) o reajuste é de : " + novosalario);
        }else if (cargo == 2) {
            reajusteparcial = salario * 0.35;
            novosalario = salario + reajusteparcial;
            System.out.println("Para o seu cargo de secretário(a) o reajuste é de: " + novosalario);
        }else if (cargo == 3) {
            reajusteparcial = salario * 0.2;
            novosalario = salario + reajusteparcial;
            System.out.println("Para o seu cargo de caixa o reajuste é de1350.0 : " + novosalario);
        }else if (cargo == 4) {
            reajusteparcial = salario * 0.1;
            novosalario = salario + reajusteparcial;
            System.out.println("Para o seu cargo de gerente é de :" + novosalario);
        }else if (cargo == 5) {
            System.out.println("Para o seu cargo não teve reajuste");
        } else {
            System.out.println("Este cargo não existe");
        }

    }
}
