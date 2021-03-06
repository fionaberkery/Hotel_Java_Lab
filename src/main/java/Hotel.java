import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Guest> guests;
    private ArrayList<Booking> bookings;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public int getGuests() {
        return this.guests.size();
    }

    public int getBedrooms() {
        return this.bedrooms.size();
    }

    public int getConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public int getBookings(){
        return this.bookings.size();
    }

    public void checkInGuest(Guest guest1) {
        this.guests.add(guest1);
    }


    public Booking makeBooking(Bedroom bedroom, int numberOfNights) {
        return new Booking(numberOfNights, bedroom);
    }
}
