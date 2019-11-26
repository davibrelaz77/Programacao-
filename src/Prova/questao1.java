package Prova;

import java.util.Scanner;

public class questao1 {

    public static int areaQuadrado(int base, int altura){
        return base*altura;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("INFORME QUAL A OPÇÃO DESEJADA: DIGITE (1) PARA CALCULAR A ÁREA DE UM QUADRADO E (2) PARA ÁREA DE UM RETÂNGULO: ");
        System.out.println("==============================");
        a = sc.nextInt();
        int base,altura;
        if (a == 1) {
            System.out.println("Digite o valor da base: ");
            base = sc.nextInt();
            System.out.println("Digite o valor da altura: ");
            altura = sc.nextInt();
            System.out.println("==============================");
            System.out.println("A área do quadrado é igual a: "+areaQuadrado(base,altura)+"m²");
        } else if (a == 2){
            System.out.println("Digite o valor da base: ");
            base = sc.nextInt();
            System.out.println("Digite o valor da altura: ");
            altura = sc.nextInt();
            System.out.println("==============================");
            System.out.println("A área do retângulo é igual a: "+areaQuadrado(base,altura)+"m²");


        }else{
            System.out.println("A OPÇÃO DESEJADA NÃO ESTÁ DISPONÍVEL!");
        }


    }
}

