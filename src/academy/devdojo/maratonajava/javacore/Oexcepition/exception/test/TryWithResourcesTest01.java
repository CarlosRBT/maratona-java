package academy.devdojo.maratonajava.javacore.Oexcepition.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcepition.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexcepition.exception.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        LerArquivo();
    }

    public static void LerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }
}
