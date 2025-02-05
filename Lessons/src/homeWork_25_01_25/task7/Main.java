package homeWork_25_01_25.task7;

public class Main {
    public static void main(String[] args) {
        Movie gorod = new Movie(2010, 7, "Город", "Иванов");
        Movie les = new Movie(2000, 8, "Лес", "Козлов");
        Movie ozero = new Movie(1988, 6, "Озеро", "Птицин");
        Movie derevo = new Movie(2005, 4, "Дерево", "Королёв");
        Movie muravei = new Movie(2014, 10, "Муравей", "Лебедев");
        Movie enot = new Movie(2001, 1, "Енот", "Краснов");

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.addMovie(gorod);
        movieLibrary.addMovie(les);
        movieLibrary.addMovie(ozero);
        movieLibrary.addMovie(derevo);
        movieLibrary.addMovie(muravei);
        movieLibrary.addMovie(enot);

        System.out.println("Библиотека фильмов: ");
        movieLibrary.printAllMovies();
        movieLibrary.findMoviesByDirector(movieLibrary.movieList, "Птицин");
        movieLibrary.removeMovie(enot);

    }
}
