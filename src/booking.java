import java.util.List;
import java.util.ArrayList;

public class booking {
    Customer owner;
    private List<Integer> bookedSeats;
    private int Seat;

    public booking(int seat) {
        this.Seat = seat;
        this.bookedSeats = new ArrayList<>();
    }

    public int getSeat() {
        return Seat;
    }

    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

    public boolean bookSeat(int seatNumber) {
        if (!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);
            return true; // Booking successful
        }
        return false; // Seat already booked
    }

    public boolean cancelSeatBooking(int seatNumber) {
        return bookedSeats.remove(Integer.valueOf(seatNumber));
    }

}
