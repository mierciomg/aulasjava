package jiraya.cursojava.Introducao1;

public class Aula13TiposPrimitivosStrings {
    //https://youtu.be/13VfcFXwsjw?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW

    public static void main(String[] args) {
        int idade = (int) 1000000000L;
        double salarioDouble = 2000D;
        float salarioFloat = (float) 2500D;
        byte idadeByte = 10;
        short idadeShort = 20;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Miércio";

        System.out.println(idade);
        System.out.println(verdadeiro);
        System.out.println(false);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(caractere);
        System.out.println(nome);
    }
}
