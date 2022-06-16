import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom doubleBedroom;

    @Before
    public void before(){
        doubleBedroom = new Bedroom(10, RoomType.DOUBLE);
    }

    @Test
    public void doubleBedroomHAsCapacityOf2(){
        assertEquals(2, doubleBedroom.getCapacity());
    }

    @Test
    public void doubleBedroomIsDoubleType(){
        assertEquals(RoomType.DOUBLE, doubleBedroom.getRoomType());
    }

    @Test
    public void roomHasANumber(){
        assertEquals(10, doubleBedroom.getRoomNumber());
    }

    @Test
    public void doubleBedroomHasARoomRate(){
        assertEquals(20, doubleBedroom.getRoomRate(), 0.0);
    }


}
