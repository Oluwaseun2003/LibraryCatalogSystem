public class Books {
    private String title;
    private String author;

    private String isbn;

    private String genre;

    public Books(String title, String author, String ISBN, String genre){

    }
    @Override
    public String toString(){
        return ("Titile: " + title + "Author" + author + "ISBN" + isbn + "Genre" + genre);
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
