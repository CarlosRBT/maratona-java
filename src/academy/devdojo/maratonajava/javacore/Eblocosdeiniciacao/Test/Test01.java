package academy.devdojo.maratonajava.javacore.Eblocosdeiniciacao.Test;

import academy.devdojo.maratonajava.javacore.Eblocosdeiniciacao.dominio.Anime;

public class Test01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
