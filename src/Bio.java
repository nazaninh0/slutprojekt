import java.util.ArrayList;
import java.util.List;

public class Bio {
        private String title;
        //private int birthdate;
        private int movieId;
        private String genre;
        private List<Integer> bookedSeats;
        private int hallId;
        private String name;
        private int capacity;

        public Bio(int movieId, String title, String genre) {
            this.movieId = movieId;
            this.title = title;
            this.genre = genre;
            this.bookedSeats = new ArrayList<>();
        }

        public int getMovieId() {
            return movieId;
        }

        public String getTitle() {
            return title;
        }

        public String genre() {
            return genre;
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

