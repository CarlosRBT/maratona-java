package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponives = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("JetSky")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponível.... ");
        Barco barco = barcosDisponives.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponives);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco " + barco);
        barcosDisponives.add(barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponives);

    }
}
