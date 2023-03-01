package Java1.OrdenarCrescente;

import java.util.Scanner;

public class resolucao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.println("Informe o primeiro número: ");
        a = in.nextInt();

        System.out.println("Informe o segundo numero: ");
        b = in.nextInt();

        System.out.println("Informe o terciero número");
        c = in.nextInt();

        if(a < b && b < c){
            System.out.println( a + "-"  + b + "-" + c);
        }else if(a < c && c < b){
            System.out.println( a + "-"  + c + "-"  +b);
        }else if(c < a && a < b){
            System.out.println( c + "-"  + a + "-"  +b);
        }else if(c < b && b < a){
            System.out.println( c + "-"  + b + "-"  +a);
        }else if(b < a && a < c){
            System.out.println(b + "-"  + a +  "-"  + c);
        }else if(b < c && c < a){
            System.out.println(b + "-"  + c + "-"  + a);
        }
        
        }

    }

