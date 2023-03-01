package Atividade2.MatrizTransposta;

import java.util.Scanner;

public class resolucao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][]matrizOriginal = new int[3][3];
        int[][]matrizTransposta = new int[3][3];

        int l, c; //declarando linha e coluna
        
        //preenchendo a matriz
        System.out.println("Preencha a matriz: ");
        for(l = 0; l <= matrizOriginal.length-1; l++){
            for(c = 0; c <= matrizOriginal[0].length-1; c++){ 
                matrizOriginal[l][c] = in.nextInt();
                while(matrizOriginal[l][c] < 0){
                    System.out.println("Apenas números inteiros! Digite novamente");
                    matrizOriginal[l][c] = in.nextInt();
                }
            }
        }

       //Transformando em transposta
       for(l = 0; l <= matrizTransposta.length-1; l++){
        for(c = 0; c <= matrizTransposta[0].length-1; c++){
            matrizTransposta[c][l] = matrizOriginal[l][c];
        }
       }

       //Print na matriz transposta
       System.out.println("Matriz transposta: ");
       for(l = 0; l <= matrizTransposta.length-1; l++){
        for(c = 0; c <= matrizTransposta[0].length-1; c++){
            System.out.print(matrizTransposta[l][c] + " ");
        }
        System.out.println();
       }
    }
}
