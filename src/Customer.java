import java.util.List;

public class Customer {
    //private Customer customer;
    private String name;
    private int age;

    public Customer(String name, int age) {
        // this.customer = customer;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   /* public Customer getCustomer() {
        return customer;
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
    }*/

}


