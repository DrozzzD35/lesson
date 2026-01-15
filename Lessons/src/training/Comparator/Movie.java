package training.Comparator;

public class Movie {

    private String title;
    private Double rating; // Может быть null

    public Movie(String title, Double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{title='" + title + "', rating=" + rating + "}";
    }
}
