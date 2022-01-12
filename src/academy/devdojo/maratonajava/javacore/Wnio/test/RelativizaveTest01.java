package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizaveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/Users/rober");
        Path clazz = Paths.get("Users/rober/ola");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

    }
}
