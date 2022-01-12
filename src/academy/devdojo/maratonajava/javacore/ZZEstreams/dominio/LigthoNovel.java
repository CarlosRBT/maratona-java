package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

public class LigthoNovel {
    private String title;
    private double price;
    private Category category;

    @Override
    public String toString() {
        return "LigthoNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    public LigthoNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public LigthoNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
