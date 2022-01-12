package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args)
        // byte, short, int, long, float, double 0
        // char '\u0000' ''
        // boolean false
        // string null
        //String[] idade = new String[3];
        //System.out.println(idade[0]);
        //System.out.println(idade[1]);
        //System.out.println(idade[2]);


    {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Seya";
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);

        }


    }
}
