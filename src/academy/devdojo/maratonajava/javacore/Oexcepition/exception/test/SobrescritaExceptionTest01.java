package academy.devdojo.maratonajava.javacore.Oexcepition.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcepition.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexcepition.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexcepition.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        }catch (LoginInvalidoException | FileNotFoundException e ){
            e.printStackTrace();
        }
    }
}
