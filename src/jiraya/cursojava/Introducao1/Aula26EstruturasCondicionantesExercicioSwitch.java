package jiraya.cursojava.Introducao1;

public class Aula26EstruturasCondicionantesExercicioSwitch {
    public static void main(String[] args) {
        byte dia = 2;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");

            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
