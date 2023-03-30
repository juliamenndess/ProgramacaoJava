package ProvaP3;

public class Trabalhador {

    private String nome;
    private int idade;
    private double valorHora;
    private int horaTrab;
    private boolean ferias;

    public Trabalhador(String nome) {
        this.nome = nome;
    }

    public Trabalhador(String nome, int idade, double valorHora, int horaTrab, boolean ferias) {
        this.nome = nome;
        this.idade = idade;
        this.valorHora = valorHora;
        this.horaTrab = horaTrab;
        this.ferias = ferias;
    }

    

    public Trabalhador(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoraTrab() {
        return horaTrab;
    }

    public void setHoraTrab(int horaTrab) {
        this.horaTrab = horaTrab;
    }

    public boolean isFerias() {
        return ferias;
    }

    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

    public void ferias(){
        if(ferias == true){
            System.out.println("Você deve retornar ao trabalho! ");
        }else{
            System.out.println("Você está de férias! ");
        }
    }
    
}

/* 

2. Crie a classe Trabalhador, ela deve possuir os seguintes atributos: nome, idade, valor da hora
trabalhada, horas trabalhadas e férias. (peso 2,0)
Nome - String;
Idade - Inteiro;
Valor da hora - Double;
Horas trabalhadas - Inteiro;
Férias - Booleano.

c. Dentro da classe trabalhador crie o método férias, nele, caso o funcionário esteja de férias
ele irá retornar ao trabalho, e caso ele esteja trabalhando ele irá ficar de férias.(peso 1,0)

*/
