import java.util.List;
import java.util.ArrayList;

public class booking {
    Customer owner; // Reference to the owner/customer of the booking
    private List<Integer> bookedSeats; // List to store the booked seat numbers
    private int Seat; // The seat number for this booking

    // Constructor to initialize a booking with a specified seat number
    public booking(int seat) {
        this.Seat = seat; // Initialize the seat number
        this.bookedSeats = new ArrayList<>(); // Initialize the list of booked seats
    }

    // Method to get the seat number of this booking
    public int getSeat() {
        return Seat;
    }

    // Method to get the list of booked seat numbers
    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

    // Method to book a seat
    public boolean bookSeat(int seatNumber) {
        if (!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);
            return true; // Booking successful
        }
        return false; // Seat already booked
    }

    // Method to cancel a seat booking
    public boolean cancelSeatBooking(int seatNumber) {
        return bookedSeats.remove(Integer.valueOf(seatNumber));
    }

}
