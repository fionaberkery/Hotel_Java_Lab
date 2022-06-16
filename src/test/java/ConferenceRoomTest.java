import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Hopper", 2);
    }

    @Test
    public void conferenceRoomHasARoomType(){
        assertEquals(RoomType.CONFERENCE, conferenceRoom.getRoomType());
    }

    @Test
    public void conferenceRoomHasAName(){
        assertEquals("Hopper", conferenceRoom.getRoomName());
    }

    @Test
    public void conferenceRoomHasANumberOfScreens(){
        assertEquals(2, conferenceRoom.getNumberOfScreens());
    }
}
