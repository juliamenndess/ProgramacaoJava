package Atividade2.RetornarFatorialRecursivamente;

import java.util.Scanner;

public class resolucao {

    public int fatorial(int x){
        if(x == 0){
            return 1;
        }
        return x*fatorial(x - 1);
    }

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        resolucao f = new resolucao();
        int resp;
        System.out.println("Informe um numero inteiro: ");
        resp = in.nextInt();
        resp = f.fatorial(resp);
        System.out.println(resp);
    }
}
