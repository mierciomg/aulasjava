package jiraya.cursojava.Introducao7ModificadorEstatico.Teste;
//aula 63
//bloco de inicialização estatico é executado somente uma  vez antes
//de existir o objeto em memória
import jiraya.cursojava.Introducao7ModificadorEstatico.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        Anime anime3 = new Anime();

    }
}
