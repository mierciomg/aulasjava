package jiraya.cursojava.Introducao1;

public class Aula14ExercicioTiposPrimitivos {
    /* https://youtu.be/Q0REhCVBvAg?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
    crie as variaveis descritas entre os campos <> e imprima a mensagem
    "Eu, <nome>, morando no <endereço>, confirmo que recebi o salario <salario>,
    na data de <data>"
     */

    public static void main(String[] args) {
        String nome = "Miércio Martinelli Guimarães";
        String endereco = "Rua Francisco Lopes Nogueira, nº 20,";
        double salario = 4500;
        String data = "28/07/2023";

        System.out.println("Eu, " + nome + ", morando na rua " + endereco +
                " confirmo que recebi" +
                " o valor " + salario + " na data de " + data);

    }
}
