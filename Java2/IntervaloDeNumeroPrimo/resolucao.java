
package Java2.IntervaloDeNumeroPrimo;

import java.util.Scanner;

public class resolucao {
    
    public static void ImprimirPrimo(int inferior, int superior){
        boolean naoPrimo;
        for(int i = inferior; i <= superior; i++){
           naoPrimo = false;
           for(int j = 2; j < i; j++){
            if(i%j == 0){
                naoPrimo = true;
                break;
            }
            }
            if(!naoPrimo ){
                System.out.println(i + " ");
           }
        }
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int inferior, superior;

        System.out.println("Informe o primeiro número");
        inferior = in.nextInt();

        System.out.println("Informe o segundo número:");
        superior = in.nextInt();
        
        ImprimirPrimo(inferior, superior);
        
    }
}
