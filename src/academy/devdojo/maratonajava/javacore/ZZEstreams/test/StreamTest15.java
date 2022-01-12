package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthoNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect =
                ligthoNovels.stream().collect(groupingBy(LigthoNovel::getCategory, Collectors.summarizingDouble(LigthoNovel::getPrice)));
        System.out.println(collect);


        Map<Category, Set<Promotion>> collect1 = ligthoNovels.stream().collect(groupingBy(LigthoNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LigthoNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}

