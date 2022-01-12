package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthoNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
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
        ligthoNovels.sort(Comparator.comparing(LigthoNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LigthoNovel ligthoNovel : ligthoNovels) {
            if (ligthoNovel.getPrice() <= 4) {
                titles.add(ligthoNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(ligthoNovels);
        System.out.println(titles);
    }
}
