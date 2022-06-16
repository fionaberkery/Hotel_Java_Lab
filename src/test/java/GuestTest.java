import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        guest1 = new Guest("Fiona");
        guest2 = new Guest("Adam");
        guest3 = new Guest("Andy");
    }

    @Test
    public void guest1HasAName(){
        assertEquals("Fiona", guest1.getGuestName());
    }

}
