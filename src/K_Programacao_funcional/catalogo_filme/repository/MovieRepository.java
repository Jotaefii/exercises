package K_Programacao_funcional.catalogo_filme.repository;

import K_Programacao_funcional.catalogo_filme.entities.Movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    Path file = Path.of(System.getProperty("user.home") ,"Documentos", "filmes.txt");
    List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)){
            bw.write(movie.getTitle() + "," + movie.getGenre() + "," + movie.getRating());
            bw.newLine();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<Movie> listAll() {
        movies.clear();

        try (BufferedReader br = Files.newBufferedReader(file)){
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String title = data[0];
                String genre = data[1];
                double rating = Double.parseDouble(data[2]);

                Movie movie = new Movie(title, genre, rating);

                movies.add(movie);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return movies;
    }

}
