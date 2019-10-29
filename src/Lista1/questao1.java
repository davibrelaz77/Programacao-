package Lista1;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] x = new int [10];

        for(int i=0; i<x.length; i++) {
            System.out.println("Entre com o número " + i);
            x[i] = sc.nextInt();
        }
        for(int numero : x){
            System.out.println(numero);
        }

    }
}
