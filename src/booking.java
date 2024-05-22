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

    // Subclass for VIP bookings
    public static class VIPBooking extends booking {
        private String extraService; // Extra service for VIP booking

        // Constructor to initialize a VIP booking with a specified seat number and extra service
        public VIPBooking(int seat, String extraService) {
            super(seat); // Call the constructor of the superclass (Booking)
            this.extraService = extraService; // Initialize the extra service
        }

        // Method to get the extra service of this VIP booking
        public String getExtraService() {
            return extraService;
        }

        @Override
        public String toString() {
            return "VIPBooking [Seat=" + getSeat() + ", Extra Service=" + extraService + "]";
        }
    }

    // Subclass for Standard bookings
    public static class StandardBooking extends booking {
        private String discountCode; // Discount code for standard booking

        // Constructor to initialize a standard booking with a specified seat number and discount code
        public StandardBooking(int seat, String discountCode) {
            super(seat); // Call the constructor of the superclass (Booking)
            this.discountCode = discountCode; // Initialize the discount code
        }

        // Method to get the discount code of this standard booking
        public String getDiscountCode() {
            return discountCode;
        }

        @Override
        public String toString() {
            return "StandardBooking [Seat=" + getSeat() + ", Discount Code=" + discountCode + "]";
        }
    }

}
