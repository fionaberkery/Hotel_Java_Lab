public class Bedroom extends Room {

    private int roomNumber;

    public Bedroom(int roomNumber, RoomType roomType) {
        super(roomType);
        this.roomNumber = roomNumber;
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }
}
