package jiraya.cursojava.Introducao3Metodos.Teste;

import jiraya.cursojava.Introducao3Metodos.Dominios.Calculadora;

//aula 46
public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,5);
        System.out.println(result);
        System.out.println("---------------");
        calculadora.imprimeDoisNumeros(30,0);
    }


}
