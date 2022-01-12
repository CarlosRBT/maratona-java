package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        int resultado02 = numero01 - numero02;
        int resultado03 = numero01 * numero02;
        int resultado04 = numero01 / numero02;
        System.out.println(resultado);
        System.out.println(resultado02);
        System.out.println(resultado03);
        System.out.println(resultado04);


        // % resto
        // serve para identificar se o numero é par ou impar, se o resultado for zero é par
        int resto = 20 % 3;
        System.out.println(resto);


        // <> <= >= == (!= diferente) retornam valores booleano
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        // && (and)   || or(ou)   !(not)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valortotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valortotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);


        // Operadores Aritiméticos  = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus += 1000;
        System.out.println("Bonus é  " + bonus);


        // ++ --


        int contador = 0;
        contador += 1; // contador = contador + 1 ;
        contador++;
        contador--;
        System.out.println(contador);


    }
}
