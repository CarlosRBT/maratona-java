package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthoNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LigthoNovel> ligthoNovels = new ArrayList<>(List.of(
            new LigthoNovel("Tensei Shitara", 8.99),
            new LigthoNovel("Overlord", 3.99),
            new LigthoNovel("Violet Evangard", 5.99),
            new LigthoNovel("No game no life", 2.99),
            new LigthoNovel("Fullmetal Alchemist", 5.99),
            new LigthoNovel("Kumo desuga", 1.99),
            new LigthoNovel("Monogarati", 4.00)
    ));

    public static void main(String[] args) {
        Stream<LigthoNovel> stream = ligthoNovels.stream();
        ligthoNovels.stream().forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);
    }
}
