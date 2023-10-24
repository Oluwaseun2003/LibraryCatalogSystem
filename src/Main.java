import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        Scanner scanner = new Scanner(System.in);

        //Adding a book to the catalogue
        System.out.println("Enter book details");
        System.out.println("Enter book Title \n");
        String title = scanner.nextLine();

        System.out.println("Enter author name \n");
        String author = scanner.nextLine();

        System.out.println("Enter the ISBN \n");
        String ISBN = scanner.nextLine();

        System.out.println("Enter the genre \n");
        String genre = scanner.nextLine();

        Books book = new Books(title, author, ISBN, genre);
        catalog.addBook(book);

        //Removing a book from the catalogue
        System.out.println("Enter the title of the book you want to remove \n");
        String removeTitle = scanner.nextLine();
        catalog.removeBook(removeTitle);


        //Finding a book from the catalog
        System.out.println("Enter a title to search for \n");
        String findTitle = scanner.nextLine();
        Books foundBook = catalog.findBook(findTitle);

        if(foundBook != null){
            System.out.println("Found book: " +foundBook.getTitle());
        } else {
            System.out.println("The title you entered is not available ");
        }

        //LISTING THE BOOKS IN THE CATALOG
        System.out.println("These are all the books in the catalog");
        catalog.listBook();

        scanner.close();

    }
}