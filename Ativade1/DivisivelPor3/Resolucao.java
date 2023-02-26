package Ativade1.DivisivelPor3;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int intervalo, i, cont1 = 0, minimo, maximo;

        int []preencher = new int[10];


        for( i = 0; i < preencher.length; i++){
            preencher[i] = i;
        }

        System.out.println("Informe o mínimo para um intervalo numa posição de 0 a 9");
        
        for(i = 0; i < 10; i++){
            System.out.println(preencher[i]);
        }
        System.out.println(" ");
        minimo = in.nextInt();
        System.out.println("Informe o máximo do intervalo");
        maximo = in.nextInt();
        while(maximo < minimo){
            System.out.println("O valor máximo do intervalo precisa ser maior que o valor mínimo! Digite novamente");
            maximo = in.nextInt();
        }

        for( i = minimo; i <= maximo; i++){
            if(preencher[i]%3 == 0){
               cont1++;
            }
        }

        System.out.println("A quantidade de números divisíveis por 3 no intervalo dado é: " + cont1 );

    }
}
