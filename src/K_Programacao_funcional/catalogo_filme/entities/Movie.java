package K_Programacao_funcional.catalogo_filme.entities;

public class Movie {
    private String title;
    private String genre;
    private Double rating;

    public Movie(String title, String genre, Double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getGenre() + ", " + getRating();
    }
}
