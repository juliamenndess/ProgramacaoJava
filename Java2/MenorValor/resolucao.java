package Java2.MenorValor;

import java.util.Scanner;

public class resolucao {

    public static void MenorValor(int[]vetor){
        int menor = Integer.MAX_VALUE, i;
        for(i = 0; i <= vetor.length-1; i++){
            if(vetor[i] < menor){
                menor = vetor[i];                 
            }
        }
        System.out.println("O menor valor do vetor é: " + menor);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[]vetor = new int[10];
        int i;

        //Preencher o vetor
        System.out.println("Preencha o vetor");
        for(i = 0; i <= vetor.length-1; i++){
            vetor[i] = in.nextInt();
        }
        
        MenorValor(vetor);

    }
}
