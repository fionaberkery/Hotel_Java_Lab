import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Nandos", RoomType.DININGROOM);
    }

    @Test
    public void diningRoomHasAName(){
        assertEquals("Nandos", diningRoom.getName());
    }

    @Test
    public void diningRoomHasACapacity(){
        assertEquals(30, diningRoom.getCapacity());
    }

    @Test
    public void diningRoomHasNoGuests(){
        assertEquals(0, diningRoom.getGuests());
    }
}
