package homeWork_25_01_25.task7;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {
    List<Movie> movieList = new ArrayList<>();


    MovieLibrary() {
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void removeMovie(Movie movie) {
        movieList.remove(movie);
        System.out.println("Библиотека после удаления: ");
        System.out.println();
        printAllMovies();
    }

    public void findMoviesByDirector(List<Movie> movieList, String director) {
        for (Movie movie : movieList) {
            if (movie.getDirector()==null){
                continue;
            }
            if (movie.getDirector().equals(director)) {
                System.out.println("Результат поиска:");
                System.out.println();
                System.out.println("Название фильма: " + movie.getTitle());
                System.out.println("Режиссёр: " + movie.getDirector());
                System.out.println("Год выпуска: " + movie.getYear());
                System.out.println("Рейтинг: " + movie.getRating());
                System.out.println();
            }

        }
    }


    public void printAllMovies() {
        for (Movie movie : movieList) {
            if (movie.getYear() == 0) {
                continue;
            }
            System.out.println("Название фильма: " + movie.getTitle());
            System.out.println("Режиссёр: " + movie.getDirector());
            System.out.println("Год выпуска: " + movie.getYear());
            System.out.println("Рейтинг: " + movie.getRating());
            System.out.println();
        }
        System.out.println("Количество фильмов в библиотеке: " + Movie.getMoviesCreated());
        System.out.println();
    }

}