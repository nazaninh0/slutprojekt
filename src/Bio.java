import java.util.ArrayList;
import java.util.List;

public class Bio {
    private String title;
    //private int birthdate;
    private int movieId;
    private String genre;
    private int hallId;
    private String name;
    private int capacity;
    private int Agelimit;

    public Bio(int movieId, String title, int AgeLimit, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        //this.bookedSeats = new ArrayList<>();
        this.Agelimit = Agelimit;
    }

    public int getMovieId() {

        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getgenre() {
        return genre;
    }

    public int getAgelimit() {

        return Agelimit;
    }

    class VIPMovie extends Bio {
        private String specialService;

        public VIPMovie(String title, String genre, int Agelimit, String specialService) {
            super(0, title, genre, Agelimit);
            this.specialService = specialService;
        }

        public String getSpecialService() {
            return specialService;
        }
    }
}
