import designpattern.structurais.GuestFactory;
import designpattern.structurais.Hotel;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomTest {

    @Test
    void deveRetonarQuartos() {
        Hotel hotel = new Hotel();
        hotel.addRoom(103, "Fernada Soares", "10434733625");
        hotel.addRoom(104, "Fernada Soares", "10434733625");
        hotel.addRoom(101, "Eduardo fernandes", "10434733628");
        hotel.addRoom(102, "Eduardo fernandes", "10434733628");

        List<String> saida = Arrays.asList(
                "Quarto {numero='103', hospede='Fernada Soares', cpf='1043433625'}",
                "Quarto {numero='104', hospede='Fernada Soares', cpf='1043433625'}",
                "Quarto {numero='101', hospede='Eduardo fernandes', cpf='1043433628'}",
                "Quarto {numero='102', hospede='Eduardo fernandes', cpf='1043433628'}"
        );
        assertEquals(saida, hotel.obterRooms());
    }
    @Test
    void deveRetornarTotalHospedes(){
        Hotel hotel = new Hotel();
        hotel.addRoom(103, "Fernada Soares", "10434733625");
        hotel.addRoom(104, "Fernada Soares", "10434733625");
        hotel.addRoom(101, "Eduardo fernandes", "10434733628");
        hotel.addRoom(102, "Eduardo fernandes", "10434733628");

        assertEquals(2, GuestFactory.getTotalGuest());
    }
}
