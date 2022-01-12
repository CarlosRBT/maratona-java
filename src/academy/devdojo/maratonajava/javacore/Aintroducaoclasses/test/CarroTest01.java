package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Ferrari";
        carro.modelo = "MSI 3.0";
        carro.ano = 2021;

        Carro carro1 = new Carro();
        carro1.nome = "Fusca";
        carro1.modelo = "TI 1.6";
        carro1.ano = 1980;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println("--------------------");
        System.out.println("Carro01");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
    }
}
