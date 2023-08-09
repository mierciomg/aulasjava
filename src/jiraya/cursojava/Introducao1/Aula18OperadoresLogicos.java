package jiraya.cursojava.Introducao1;

public class Aula18OperadoresLogicos {
    //https://youtu.be/ELcO4DN7lxw?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW

    public static void main(String[] args) {
        int idade = 49;
        float salario = 5000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 || salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 || salario >= 3600;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
    }
}
