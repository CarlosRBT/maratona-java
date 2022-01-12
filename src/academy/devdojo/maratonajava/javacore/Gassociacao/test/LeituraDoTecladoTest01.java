package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String nome = imput.nextLine();
        System.out.println("Digite sua idade");
        int idade = imput.nextInt();
        System.out.println("Digite M ou F para o seu sexo");
        char sexo = imput.next().charAt(0);
        System.out.println("-------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
