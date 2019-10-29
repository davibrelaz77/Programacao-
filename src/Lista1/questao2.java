package Lista1;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];

        for (int i = 0; i<vet.length; i++){
            System.out.println("Entre com o número " + (i+1));
            vet[i] = sc.nextInt();

        }
        int maior = 0;
        for (int numero: vet){
            if(maior<numero){
                maior = numero;
            }
        }
        System.out.println("O maior valor do vetor é " + maior);
    }
}
