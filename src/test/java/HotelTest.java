import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Booking booking1;
    Bedroom bedroom1;

    @Before
    public void before(){
        hotel = new Hotel();
    }

    @Test
    public void checkHotelHasNoBedrooms(){
        assertEquals(0, hotel.getBedrooms());
    }

    @Test
    public void checkHotelHasNoConferenceRooms(){
        assertEquals(0, hotel.getConferenceRooms());
    }

    @Test
    public void checkHotelHasNoGuests(){
        assertEquals(0, hotel.getGuests());
    }

    @Test
    public void hotelCanCheckInGuest(){
        guest1 = new Guest("Fiona");
        guest2 = new Guest("Adam");
        guest3 = new Guest("Andy");
        hotel.checkInGuest(guest1);
        hotel.checkInGuest(guest2);
        hotel.checkInGuest(guest3);
        assertEquals(3, hotel.getGuests());
    }

    @Test
    public void hotelCanMakeABooking(){
        bedroom1 = new Bedroom(10, RoomType.DOUBLE);
        Booking booking = hotel.makeBooking(bedroom1, 2);
        assertTrue(booking instanceof Booking);

    }
}
