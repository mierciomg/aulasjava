package jiraya.cursojava.Introducao1;

public class Aula30EstruturasDeRepeticaoExercicio2Break {
    //dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    //vlor da parcela >=1000

    public static void main(String[] args) {
        double valorDoCarro = 30000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }
    }
}
