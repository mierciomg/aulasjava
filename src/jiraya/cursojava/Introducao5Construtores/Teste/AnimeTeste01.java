package jiraya.cursojava.Introducao5Construtores.Teste;
//aula  58, 59 sobrecarga de construtores


import jiraya.cursojava.Introducao5Construtores.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Miércio", "TV", 12, "Ação", "Bross");
        anime.imprime();
    }
}
