public class Movie {
    private String movieName;
    private String movieGenre;
    private int duration;
    private double moviePrice;

    public Movie(String movieName, String movieGenre, int duration, double moviePrice) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.duration = duration;
        this.moviePrice = moviePrice;
    }
    public String getMovieName() {
        return movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public int getDuration() {
        return duration;
    }

    public double getMoviePrice() {
        return moviePrice;
    }

    public String toString() {
        return movieName  +
                "\nGenre: " + movieGenre +
                "\nDuration: " + duration + " minutes" +
                "\nPrice: $" + moviePrice;
    }

    

}
