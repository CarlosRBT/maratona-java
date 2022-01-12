package academy.devdojo.maratonajava.javacore.Dconstrutores.Test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haykyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}
