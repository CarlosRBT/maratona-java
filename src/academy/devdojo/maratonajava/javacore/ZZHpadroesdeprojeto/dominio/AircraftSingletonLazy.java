package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {

    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> avalibleSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        avalibleSeats.add("1A");
        avalibleSeats.add("1B");

    }

    public static AircraftSingletonLazy getInstance() {

        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }

            }

        }
        return INSTANCE;
    }


    public boolean bookSeat(String seat) {
        return avalibleSeats.remove(seat);
    }
}
