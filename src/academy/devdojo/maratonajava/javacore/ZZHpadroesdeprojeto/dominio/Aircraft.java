package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> avalibleSeats = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        avalibleSeats.add("1A");
        avalibleSeats.add("1B");

    }
    public boolean bookSeat(String seat){
        return avalibleSeats.remove(seat);
    }

    public String getName() {
        return name;
    }
}
