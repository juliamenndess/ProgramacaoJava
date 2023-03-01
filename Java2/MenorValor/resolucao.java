package Java2.MenorValor;

import java.util.Scanner;

public class resolucao {

    public static int MenorValor(int[]vetor){
        int menor = Integer.MAX_VALUE, i;
        for(i = 0; i <= vetor.length-1; i++){
            if(vetor[i] < menor){
                menor = vetor[i];                 
            }
        }
        return menor;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[]vetor = new int[10];
        int i;
        int recebe;

        //Preencher o vetor
        System.out.println("Preencha o vetor");
        for(i = 0; i <= vetor.length-1; i++){
            vetor[i] = in.nextInt();
        }
        
        recebe = MenorValor(vetor);

        System.out.println(recebe);

    }
}
