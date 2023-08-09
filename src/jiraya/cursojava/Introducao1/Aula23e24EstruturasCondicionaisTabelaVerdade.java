package jiraya.cursojava.Introducao1;

public class Aula23e24EstruturasCondicionaisTabelaVerdade {
    /*https://youtu.be/Y3ODYE3npgo?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
    https://youtu.be/W-ng6Dqa-E4?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
Renda até R$ 1.903,98: isento de imposto de renda;
Renda entre R$ 1.903,99 e R$ 2.826,65: alíquota de 7,5%;
Renda entre R$ 2.826,66 e R$ 3.751,05: alíquota de 15%;
Renda entre R$ 3.751,06 e R$ 4.664,68: alíquota de 22,5%;
     */

    public static void main(String[] args) {
        double salario = 10000;
        double faixa1 = 7.5 / 100;
        double faixa2 = 15 / 100;
        double faixa3 = 22.5 / 100;
        double valorDoImposto;
        if (salario > 190398 && salario<= 282665){
            salario = salario * faixa1;
        }else if (salario >282666 && salario <= 375105){
            salario = salario * faixa2;
        }else {
            salario = salario * faixa3;
        } System.out.println("O imposto devido é " + salario);



    }

}
