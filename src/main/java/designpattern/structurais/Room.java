package designpattern.structurais;

public class Room {
    private int roomNumber;
    private Guest guest;

    public Room(int roomNumber, Guest guest){
        this.roomNumber = roomNumber;
        this.guest = guest;
    }

    public String searchRoom() {
        return "Quarto {" + "numero='"+this.roomNumber+'\''+", hospede='"+guest.getName()+'\''+", cpf='"+guest.getCpf()+'\''+'}';
    }
}
