package jiraya.cursojava.Introducao1;

public class Aula22EstruturasCondicionaisOperadorTernario {
    //https://youtu.be/gU-qCpBC5jk?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW

    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou Doar 500 para alguém";
        String mensagenNãoDoar = "Eu não vou Doar pois ganho pouco";
        String resultado = salario > 5000 ? mensagemDoar : mensagenNãoDoar;

        System.out.println(resultado);


    }
}
