package J_Generics_Set_Map.sistema_biblioteca.entities;

public class Livro {
    private Integer isbn;
    private String title;
    private String author;
    private Integer yearLaunch;
    private String gender;

    public Livro(Integer isbn, String title, String author, Integer yearLaunch, String gender) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearLaunch = yearLaunch;
        this.gender = gender;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearLaunch() {
        return yearLaunch;
    }

    public void setYearLaunch(Integer yearLaunch) {
        this.yearLaunch = yearLaunch;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getIsbn() + ";" + getTitle() + ";" + getAuthor() + ";" + getYearLaunch() + ";" + getGender() + "\n";
    }
}
