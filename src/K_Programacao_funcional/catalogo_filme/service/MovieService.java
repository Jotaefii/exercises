package K_Programacao_funcional.catalogo_filme.service;

import K_Programacao_funcional.catalogo_filme.entities.Movie;
import K_Programacao_funcional.catalogo_filme.repository.MovieRepository;

import java.util.Comparator;
import java.util.List;

public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void addMovie(String title, String genre, Double rating) {
        Movie movie = new Movie(title, genre, rating);
        movieRepository.addMovie(movie);
    }

    public List<Movie> movieList() {
        return movieRepository.listAll();
    }

    public Movie findByName(String name) {
        return movieRepository.listAll().stream()
                .filter(m -> m.getTitle().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<Movie> listMovieByGenre(String genre) {
     return movieRepository.listAll().stream()
                .filter(m -> m.getGenre().equalsIgnoreCase(genre))
                .toList();
    }

    public List<Movie> listMovieByRatingEight() {
        return movieRepository.listAll().stream()
                .filter(m -> m.getRating() >= 8)
                .toList();

    }

    public List<Movie> listMovieByRatingMinorEight() {
        return movieRepository.listAll().stream()
                .filter(m -> m.getRating() < 8)
                .toList();
    }

    public List<Movie> sortByNote() {
        return movieRepository.listAll().stream()
                .sorted(Comparator.comparing(Movie::getRating).reversed())
                .toList();
    }
}
