package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 5), new Anime("Hellsing", 8), new Anime("Naruto", 345)));
   //     Collections.sort(animeList, (a1, a2) -> a1.getName().compareTo(a2.getName()));
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        System.out.println(animeList);
    }
}
