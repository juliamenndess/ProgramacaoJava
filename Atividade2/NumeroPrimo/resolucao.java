package Atividade2.NumeroPrimo;

import java.util.Scanner;

public class resolucao {

    public static boolean Primo(int numero){
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                return false;   
        }
        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numero;
        boolean recebe;

        System.out.println("Informe um número inteiro: ");
        numero = in.nextInt();
        while(numero < 0){
            System.out.println("Apenas número inteiro! Digite novamente:");
            numero = in.nextInt();
        }

        recebe = Primo(numero);

        if(recebe == true){
           System.out.println("Número é primo!");
        }else{
            System.out.println("Número não é primo! ");
        }
    }
}
