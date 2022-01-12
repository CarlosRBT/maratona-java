package academy.devdojo.maratonajava.javacore.Csobregarcametodos.test;

import academy.devdojo.maratonajava.javacore.Csobregarcametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma Drive", "TV", 12);
        anime.init("Akuma Drive", "TV", 12, "Ação");
        anime.imprime();


    }
}
