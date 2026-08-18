package K_Programacao_funcional.catalogo_filme;

import K_Programacao_funcional.catalogo_filme.entities.Movie;
import K_Programacao_funcional.catalogo_filme.repository.MovieRepository;
import K_Programacao_funcional.catalogo_filme.service.MovieService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        MovieRepository movieRepository = new MovieRepository();
        MovieService movieService = new MovieService(movieRepository);

        while (true) {
            System.out.println("\n================================");
            System.out.println("        CATÁLOGO DE FILMES      ");
            System.out.println("================================");

            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Buscar filme pelo nome");
            System.out.println("4 - Listar filmes por gênero");
            System.out.println("5 - Listar filmes com nota maior ou igual a 8");
            System.out.println("6 - Listar filmes com nota menor que 8");
            System.out.println("7 - Listar filmes ordenados por nota");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Titulo: ");
                    String name = sc.nextLine();
                    System.out.print("Gênero: ");
                    String genre = sc.next();
                    System.out.print("Nota: ");
                    double rating = sc.nextDouble();

                    movieService.addMovie(name, genre, rating);
                    break;

                case 2:
                    System.out.println("\nLISTA DE FILMES: ");

                    movieService.movieList().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Nome do filme: ");
                    String search = sc.nextLine();

                    Movie movie = movieService.findByName(search);
                    if (movie == null) {
                        System.out.println("Filme não encontrado!");
                        return;
                    }

                    System.out.println(movie);
                    break;

                case 4:
                    System.out.print("Gênero: ");
                    String searchGenre = sc.next();

                    System.out.println("\nFILMES DO GÊNERO " + searchGenre + ": ");
                    movieService.listMovieByGenre(searchGenre).forEach(System.out::println);
                    break;

                case 5:
                    System.out.println("\nFILMES COM NOTA 8 OU MAIOR: ");

                    movieService.listMovieByRatingEight().forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("\nFILMES COM NOTA MENOR QUE 8: ");

                    movieService.listMovieByRatingMinorEight().forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("\nLISTA DE FILMES ORDENADO PELA MAIOR NOTA: ");

                    movieService.sortByNote().forEach(System.out::println);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
