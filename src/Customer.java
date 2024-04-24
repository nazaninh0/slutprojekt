import java.util.List;

public class Customer {
    private Customer customer;
    //private List<Integer> bookedSeats;
    private String name;
    private int age;

    public Customer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    /*public List<Integer> getBookedSeats() {
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
    }*/

}


