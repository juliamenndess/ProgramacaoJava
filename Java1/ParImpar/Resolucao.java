package Java1.ParImpar;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Informe um número: ");
        num = in.nextInt();

        if(num%2 == 0){
            System.out.println("Número é par!");
        }else{
            System.out.println("Número é ímpar! ");
        }
    }
}
