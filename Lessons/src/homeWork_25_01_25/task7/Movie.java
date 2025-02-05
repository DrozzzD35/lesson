package homeWork_25_01_25.task7;

public class Movie {
    private int year, rating;
    private String title, director;
    private static int moviesCreated = 0;

    public static int getMoviesCreated() {
        return moviesCreated;
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public Movie(int year, int rating, String title, String director) {
        if (year < 1900) {
            System.out.println("Год фильма не может быть ниже 1900");
            System.out.println();
        } else if (rating <= 0 || rating > 10) {
            System.out.println("Рейтинг фильма не может быть ниже 0 и выше 10");
            System.out.println();
        } else if (director.isEmpty()) {
            System.out.println("Имя режиссёра не может быть пустым");
            System.out.println();
        } else if (title.isEmpty()) {
            System.out.println("Название не может быть пустым");
            System.out.println();
        } else {
        this.director = director;
        this.rating = rating;
        this.title = title;
        this.year = year;
        moviesCreated++;
    }
    }


}
