import java.util.ArrayList;

public class LibraryCatalog {
    private ArrayList<Books> booklist = new ArrayList<>();

    public void addBook(Books book){
        booklist.add(book);

        System.out.println("Book added to the catalog");
    }

    public void removeBook(String title){
        for(Books book : booklist){
            if(book.getTitle().equals(title)) {
                booklist.remove(book);
                break;
            }

        }
    }

    public Books findBook(String title){
    for(Books book : booklist){
        if(book.getTitle().equals(title)){
            return book;
            }
        }
    return null;
    }


    public void listBook(){
        for(Books book : booklist){
            System.out.println("Title: " +book.getTitle());
            System.out.println("Author: " +book.getAuthor());
            System.out.println("ISBN: " +book.getIsbn());
            System.out.println("Genre: " +book.getGenre());
        }
    }
}