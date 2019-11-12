package Matrizes;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ENTRADA DE DADOS
        String[] meses = new String[6];
        double[][] matrizFinanceiro = new double[3][6];
        for(int i=0; i<meses.length; i++){
            System.out.println("=================================");
            System.out.println("Informe o mês " + (i+1));
            meses[i] = sc.next();
            System.out.println("=================================");
            System.out.println("Informe a receita de " +meses[i]);
            matrizFinanceiro[0][i] = sc.nextDouble();
            System.out.println("=================================");
            System.out.println("Informe a despesa de " +meses[i]);
            matrizFinanceiro[1][i] = sc.nextDouble();
            System.out.println("=================================");
        }

        //CALCULO DE RESULTADO
        double [][] resultadoFinal = calculoResultado(matrizFinanceiro);

        //SAÍDA DE DADOS
            for(int i=0; i<meses.length; i++){
                System.out.println(meses [i] + ":");
                System.out.println("=================================");
                for (int j=0; j<3; j++){
                    System.out.println(resultadoFinal[j][i] );
                    System.out.println("=================================");

                }
            }
    }
    public static double [][] calculoResultado(double[][] matrizFinanceiro){
        for(int i=0; i<6; i++){
            matrizFinanceiro[2][i] = matrizFinanceiro[0][i] - matrizFinanceiro [1][i];
        }
        return matrizFinanceiro;
    }
}
