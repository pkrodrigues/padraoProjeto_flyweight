package designpattern.structurais;

import java.util.HashMap;
import java.util.Map;

public class GuestFactory {
    private static Map<String, Guest> guests = new HashMap<>();

    public static Guest getGuest(String name, String cpf) {
        Guest guest = guests.get(name);
        if (guest == null) {
            guest = new Guest(name, cpf);
            guests.put(name, guest);
        }
        return guest;
    }

    public static int getTotalGuest() {
        return guests.size();
    }
}
