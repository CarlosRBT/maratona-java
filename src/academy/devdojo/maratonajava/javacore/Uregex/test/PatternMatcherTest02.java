package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        //  \d = retorna todos os dígito(número)
        //  \D = retorna tudo que não for dígito(número e caracteres)
        //  \s = retorna espaços em branco \t \n \f \r
        //  \S = retorna todos os caracteres excluindo os brancos
        //  \w = retorna a-ZA-Z, digitos
        //  \W = retorna tudo que não for incluso no \w

        String regex = "\\D";
        String texto = "abaaba";
        String texto2 = "abababahfoh892  r!@#$-+efjfj f093r2 0932f";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:    " + texto2);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
