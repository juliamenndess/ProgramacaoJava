package Java1.DivisivelPor3;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i, cont1 = 0, minimo, maximo;

        System.out.println("Informe o mínimo para um intervalo de números");
        minimo = in.nextInt();

        System.out.println("Informe o máximo do intervalo");
        maximo = in.nextInt();

        while(maximo < minimo){
            System.out.println("O valor máximo do intervalo precisa ser maior que o valor mínimo! Digite novamente");
            maximo = in.nextInt();
        }

        for(i = minimo; i <= maximo; i++){
            if(i%3 == 0){
                cont1++;
            }
        }

        System.out.println("A quantidade de números divisíveis por 3 no intervalo dado é: " + cont1 );

    }
}
