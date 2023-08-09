package jiraya.cursojava.Introducao3Metodos.Dominios;
//aula 53, 57
public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario: salarios) {
            System.out.println(salario);
        }
    }
    //calcular a média dos salarios

    public void imprimeMediaSalarial(){
        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("a média salarial é "+ media);
    }

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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }


    }

