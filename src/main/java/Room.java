import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.roomType.getCapacity();
    }

    public double getRoomRate(){
        return this.roomType.getRoomRate();
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public Room(ArrayList<Guest> guests) {
        this.guests = guests;
    }


}
