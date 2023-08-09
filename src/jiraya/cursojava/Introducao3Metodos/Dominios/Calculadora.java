package jiraya.cursojava.Introducao3Metodos.Dominios;

//aula 44, 45, 46, 47, 48, 52
//https://youtu.be/ZM0AJhKjLYc?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }
    public void subtraiDoisNumeros() {
        System.out.println(21 - 3);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return (num1/num2);
    }

    public void imprimeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

        public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do metodo altera dois numeros");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num:numeros) {
            soma += num;
        }
        System.out.println(soma);

    }


}
