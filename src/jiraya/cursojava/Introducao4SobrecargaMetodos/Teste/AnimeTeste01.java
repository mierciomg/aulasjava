package jiraya.cursojava.Introducao4SobrecargaMetodos.Teste;
//aula 57. 58,
import jiraya.cursojava.Introducao4SobrecargaMetodos.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Miércio","TV", 12);
        anime.init("Miércio","TV", 12, "Ação");

        anime.imprime();
    }
}
