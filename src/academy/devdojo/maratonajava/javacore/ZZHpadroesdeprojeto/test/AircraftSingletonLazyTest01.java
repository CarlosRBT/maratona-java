package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
