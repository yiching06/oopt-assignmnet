import java.util.ArrayList;
import java.util.List;

public class Movie extends CinemaTicketSystem1 {
    public static List<Movie> movie = new ArrayList<>();

    private int id;
    private String title;
    private String genre;
    private double price;

    public Movie(int id, String title, String genre,double price) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    // Getters and setters
    public int getId() { 
        return id; 
    }
    public String getTitle() { 
        return title; 
    }
    public String getGenre() { 
        return genre; 
    }
    public double getPrice() { 
        return price; 
    }


    public static void seperateinformation(){
        movie.add(new Movie(2406673, "the", "action", 12.20));
        movie.add(new Movie(2536667, "MineCraft", "Bio", 123.43));
        movie.add(new Movie(4444444, "The nun", "Horror", 16.5));
        movie.add(new Movie(8763452, "NE ZHA ", "Action", 5201314));
    }

}