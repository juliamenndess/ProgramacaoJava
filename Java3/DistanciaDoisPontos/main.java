package Java3.DistanciaDoisPontos;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        pontos p1 = new pontos(1, 1);
        pontos p2 = new pontos(5, 4);

        double distancia;
        distancia = Math.sqrt(Math.pow(p2.x - p1.x , 2) + Math.pow(p2.y - p1.y, 2));

        System.out.println(distancia);
    }
}
