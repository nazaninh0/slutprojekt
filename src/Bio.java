import java.util.ArrayList;
import java.util.List;

// Bio class representing a movie
public class Bio {
    private String title; // Title of the movies
    private int movieId; // Unique identifier for the movie
    private String genre; // the genre
    private int hallId; // Hall id for the movie
    private int capacity; //capacity of the hall
    private int Agelimit; //Age limit for the viewing the movie

    // Constructor to initialize a Bio object
    public Bio(int movieId, String title, String genre, int AgeLimit) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.Agelimit = Agelimit;
    }

    // Getter method for retrieving the movie ID
    public int getMovieId() {
        return movieId;
    }

    // Getter method for retrieving the title of the movie
    public String getTitle() {
        return title;
    }
    // Getter method for retrieving the genre of the movie

    public String getgenre() {
        return genre;
    }

    // Getter method for retrieving the age limit for viewing the movie
    public int getAgelimit() {

        return Agelimit;
    }

    // Subclass representing a VIP movie, inheriting from the Bio class
    public static class VIPMovie extends Bio {
        private String specialService;

        public VIPMovie(String title, String genre, int Agelimit, String specialService) {
            super(4, title, genre, Agelimit);
            this.specialService = specialService;
        }

        public String getSpecialService() {
            return specialService;
        }
    }
}
