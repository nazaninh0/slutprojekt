import java.util.List;

public class booking {
    Customer owner;
    //private List<Integer> bookedSeats;
    private int Seat;

    public booking(int seat) {
        this.Seat = seat;

    }

    public int getSeat() {
        return Seat;
    }

}
