package Atividade2.RetornarFatorialIterativa;

import java.util.Scanner;

public class resolucao {

    public static int fatorial(int num){
        int fatorial = 1, i;
        for(i = 1; i <= num; i++){
            fatorial = fatorial *i;
        }
        return fatorial;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int numero, fatorial = 1;
        int recebe;

        System.out.println("Digite um número");
        numero = in.nextInt();

        recebe = fatorial(numero);
        System.out.println("O fatorial do número é: " + recebe);
    }
}
