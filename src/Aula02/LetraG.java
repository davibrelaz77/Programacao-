package Aula02;

import java.util.Scanner;

public class LetraG {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double numero1, numero2;
      System.out.println("Informe o primeiro número");
      numero1 = sc.nextDouble();
      System.out.println("Informe o número dois");
      numero2 = sc.nextDouble();
      if (numero1 > numero2) {
          System.out.println("O maior número é: " + numero1);
      }else if  (numero2 > numero1) {
          System.out.println("O maior número é: " + numero2);

      }
    }
}
