package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        //  \d = retorna todos os dígito(número)
        //  \D = retorna tudo que não for dígito(número e caracteres)
        //  \s = retorna espaços em branco \t \n \f \r
        //  \S = retorna todos os caracteres excluindo os brancos
        //  \w = retorna a-ZA-Z, digitos
        //  \W = retorna tudo que não for incluso no \w
        //  [] = retorna tudo que está entre colchetes no String regex
        //  [a-z] = percorre todas as letras de a - z do alfabeto
        // inserir número hexadecimal no java colocar 0x ou 0X antes do número

        //String regex = "[a-zcA-C]";
        String regex = "0[xX][0-9a-fA-F]";

//        String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";

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
