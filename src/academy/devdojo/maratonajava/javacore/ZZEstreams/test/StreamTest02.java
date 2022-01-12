package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthoNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
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
        List<String> titles = ligthoNovels.stream()
                .sorted(Comparator.comparing(LigthoNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LigthoNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(titles);
    }
}
