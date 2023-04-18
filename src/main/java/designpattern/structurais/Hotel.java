package designpattern.structurais;
import java.util.ArrayList;
import java.util.List;
public class Hotel {

    private List<Room> rooms = new ArrayList<>();

    public void addRoom(int roomNumber, String nameGuest, String cpf) {
        Guest guest = GuestFactory.getGuest(nameGuest, cpf);
        Room room = new Room(roomNumber, guest);
        rooms.add(room);
    }

    public List<String> obterRooms() {
        List<String> saida = new ArrayList<String>();
        for (Room room : this.rooms) {
            saida.add(room.searchRoom());
        }
        return saida;
    }

}
