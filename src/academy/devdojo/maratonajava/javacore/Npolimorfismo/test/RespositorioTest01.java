package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RespositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }


}
