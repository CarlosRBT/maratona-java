package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthoNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        System.out.println(ligthoNovels.stream().count());
        System.out.println(ligthoNovels.stream().collect(Collectors.counting()));

        ligthoNovels.stream().max(Comparator.comparing(LigthoNovel::getPrice)).ifPresent(System.out::println);

        System.out.println(ligthoNovels.stream().mapToDouble(LigthoNovel::getPrice).sum());

        DoubleSummaryStatistics collect = ligthoNovels.stream().collect(Collectors.summarizingDouble(LigthoNovel::getPrice));
        System.out.println(collect);

        String titles = ligthoNovels.stream().map(LigthoNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
