package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Carlos Roberto";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Carlos Roberto");
        sb.append(" DevDojo").append(" Academy");
        System.out.println(sb);

    }
}
