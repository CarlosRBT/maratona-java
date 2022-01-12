package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // ? = zero ou uma ocorrência
        // * = zero ou mais ocorrências
        // + = uma ou mais ocorrêmcias
        // {n,m} = de n até m
        // () = agrupamento
        // | =
        // $ = fim da linha
        // . = acha tudo que for possível Ex: 1.3 = 123, 133, 1@3, 1A3, etc

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "Luffy@hotmail.com, 123jorato@gmail.com, #@zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email válido");
        System.out.println("#@zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim()   );

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:    " + texto);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
