package ProvaP3;

import java.util.Scanner;

public class Empresa {
    private String nome;
    private String cnpj;
    private Trabalhador[] trab = new Trabalhador[20];
    private String endereco;
    private int numFun;
    private String ceo;
    private Trabalhador add;

    

    public Empresa(String nome, String cnpj, Trabalhador[] trab, String endereco, int numFun, String ceo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.trab = trab;
        this.endereco = endereco;
        this.numFun = numFun;
        this.ceo = ceo;
    }


    public Empresa(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Trabalhador[] getTrab() {
        return trab;
    }
    public void setTrab(Trabalhador[] trab) {
        this.trab = trab;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getNumFun() {
        return numFun;
    }
    public void setNumFun(int numFun) {
        this.numFun = numFun;
    }
    public String getCeo() {
        return ceo;
    }
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public Trabalhador getAdd() {
        return add;
    }


    public void setAdd(Trabalhador add) {
        this.add = add;
    }

    public void contratar(Trabalhador[] tab){
        
            if (this.numFun < 20) {
                this.trab[numFun] = add;
                this.numFun++;
                System.out.println("Trabalhador " + add.getNome() + " contratado com sucesso!");
            } else {
                System.out.println("Não foi possível contratar o trabalhador " + add.getNome() + ". A empresa já atingiu o limite máximo de funcionários.");
            }

      }
    

    public void trabalhar(){
      if( this.add.isFerias() == false ){
        this.getAdd().setHoraTrab(this.getAdd().getHoraTrab() + 8);
      }else{
        System.out.println("Nada a ser feito");
      }
    }


    public void metodoPagamento(){
        
            String[] nomes = new String[this.numFun];
            double[] salarios = new double[this.numFun];
            double totalGasto = 0;
            for (int i = 0; i < this.numFun; i++) {
                Trabalhador t = this.trab[i];
                double salario = t.getValorHora() * add.getHoraTrab();
                if (t.isFerias()) {
                    salario += salario / 3; // adiciona 1/3 do salário se o trabalhador estiver de férias
                }
                nomes[i] = t.getNome();
                salarios[i] = salario;
                totalGasto += salario;
            }
            System.out.println("Folha de pagamento:");
            for (int i = 0; i < this.numFun; i++) {
                System.out.println(nomes[i] + " - R$ " + salarios[i]);
            }
            System.out.println("Total gasto com salários: R$ " + totalGasto);
        }
    }
  



    



/* 

1. Crie a classe Empresa com os seguintes atributos: nome, CNPJ, trabalhadores, número de
funcionários, endereço e CEO. Além disso crie seu construtor. (peso 2,0)
Nome - String;
CNPJ - String;
Trabalhadores - é um vetor do tipo Trabalhador com 20 posições;
Endereço - String;
Número de funcionários - Inteiro;
CEO - String.

a. Crie o método contratar dentro da classe empresa, este método recebe um trabalhador e
ele é vinculado à empresa, você deve incrementar o número de trabalhadores e logo após
adicionar o trabalhador no vetor.(peso 1,0)

b. Crie o método trabalhar dentro da classe empresa, onde deve ser somada 8 horas de
trabalho que não está de férias(equivalente a um dia completo de trabalho).(peso 1,0)

4. Dentro da classe empresa crie o método pagamento, onde você deve Criar 2 vetores de tamanho
20, o primeiro vetor é do tipo String e deve conter o nome do funcionário e o segundo vetor é o
salário dele além disso o método também deve imprimir o valor total que a empresa irá gastar. (3,0
peso)

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
