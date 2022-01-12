package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no hero", 50), new Manga(2, "Overlod", 25));

}
