import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;


    @Before
    public void before(){
        bedroom = new Bedroom(12, RoomType.SINGLE);
        booking = new Booking(7, bedroom);
    }

    @Test
    public void canGetBill(){
        assertEquals(70, booking.returnBill());
    }
}
