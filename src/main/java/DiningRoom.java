import java.util.ArrayList;

public class DiningRoom extends Room {

    private String name;
    private ArrayList<Guest> diningRoomGuests;

    public DiningRoom(String name, RoomType roomType) {
        super(roomType);
        this.name = name;
        this.diningRoomGuests = new ArrayList<>();
    }

    public int getGuests() {
        return diningRoomGuests.size();
    }

    public String getName() {
        return this.name;
    }
}
