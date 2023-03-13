package Java3.DistanciaDoisPontos;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        pontos p1 = new pontos(1, 1);
        pontos p2 = new pontos(5, 4);
        
        p1.distancia(p1.x, p2.x ,p1.y , p2.y); 
    }
}
