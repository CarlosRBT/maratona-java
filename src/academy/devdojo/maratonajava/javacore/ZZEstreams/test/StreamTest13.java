package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthoNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LigthoNovel> ligthoNovels = new ArrayList<>(List.of(
            new LigthoNovel("Tensei Shitara", 8.99, Category.FANTASY),
            new LigthoNovel("Overlord", 3.99, Category.FANTASY),
            new LigthoNovel("Violet Evangard", 5.99, Category.DRAMA),
            new LigthoNovel("No game no life", 2.99, Category.ROMANCE),
            new LigthoNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LigthoNovel("Kumo desuga", 1.99, Category.ROMANCE),
            new LigthoNovel("Monogarati", 4.00, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = ligthoNovels.stream().collect(Collectors.groupingBy(LigthoNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LigthoNovel>> collect1 = ligthoNovels.stream().collect(Collectors.groupingBy(LigthoNovel::getCategory, Collectors.maxBy(Comparator.comparing(LigthoNovel::getPrice))));
        System.out.println(collect1);

    }
}