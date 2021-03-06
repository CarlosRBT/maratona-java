package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> avalibleSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        avalibleSeats.add("1A");
        avalibleSeats.add("1B");

    }

    public static AircraftSingletonEager getInstance() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return avalibleSeats.remove(seat);
    }
}
