package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Anime {
    private String name;
    private Integer episodes;

    public Anime(String name, Integer quantity) {
        this.name = name;
        this.episodes = quantity;
    }

    public String getName() {
        return name;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", episodes=" + episodes +
                '}';
    }

}
