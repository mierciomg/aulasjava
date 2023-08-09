package jiraya.cursojava.Introducao7ModificadorEstatico.Dominio;
//aula 63
// só de criar o objeto o construtor é inicializado
//o bloco de inicialização é executado toda vez que eu crio um objeto
public class Anime {
    private String nome;
    private static int[] episodios;

    //bloco de inicialização
    static {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : Anime.episodios) ;
    }


    public Anime(String nome) {
        this.nome = nome;
        System.out.println(nome);
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : this.episodios) {
            System.out.print("  " + episodio);
        }
    }

}
