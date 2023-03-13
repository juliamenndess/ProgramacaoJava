package Java3.DistanciaDoisPontos;

public class pontos {
    public double x;
    public double y;

    public pontos(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void distancia(double x1, double x2, double y1, double y2){
        double distancia;
        distancia =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(distancia);
    }
}
