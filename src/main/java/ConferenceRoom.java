public class ConferenceRoom extends Room {

    private String roomName;
    private int numberOfScreens;

    public ConferenceRoom(RoomType roomType, String roomName, int numberOfScreens) {
        super(roomType);
        this.roomName = roomName;
        this.numberOfScreens = numberOfScreens;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public int getNumberOfScreens() {
        return this.numberOfScreens;
    }
}
