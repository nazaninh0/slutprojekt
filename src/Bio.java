public class Bio {

        private String title;
        //private int birthdate;
        private int movieId;
        private String genre;

    public Bio ( int movieId , String title, String genre)
    {
        this.movieId = movieId;
        this.title = title;
        this. genre = genre;
    }
    public int getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }
    public String genre (){
        return genre;
    }

}
