package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Roberto  "; // String constant pool
        String nome2 = "Roberto ";
        nome = nome.concat("Santos");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Roberto"); //1 variável de referência, 2 objeto tipo string, 3 uma string no pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
