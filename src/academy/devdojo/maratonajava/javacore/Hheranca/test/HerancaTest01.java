package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Abreu");
        endereco.setCep("053894-090");
        Pessoa pessoa = new Pessoa("Naruto");
        pessoa.setCpf("098090980");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("jiraya");
        funcionario.setCpf("0853058430");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------");
        funcionario.imprime();
    }
}
