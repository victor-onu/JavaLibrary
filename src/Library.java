import java.time.LocalDate;
import java.util.HashMap;

public class Library {

    private String bookTitle;
    private Integer numberOfBooks;
    private LocalDate today;

    public HashMap<String, Integer> books = new HashMap<>();


    public HashMap<String, Integer> getBooks() {
        return books;
    }

    public Library() {
    }

    public Library(String bookTitle, Integer numberOfBooks) {
        this.bookTitle = bookTitle;
        this.numberOfBooks = numberOfBooks;
        this.today = LocalDate.now();
        this.books = books;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Integer getNumberOfBooks() {
        return numberOfBooks;
    }

    public LocalDate getToday() {
        return today;
    }


    public void addBook(Library e){

        Integer count = books.get(e.bookTitle);
        if (count == null) {
            books.put(e.bookTitle, e.numberOfBooks);
        }
        else {
            books.put(e.bookTitle, count + e.numberOfBooks);
        }
        System.out.println(e.numberOfBooks +" copies of " +e.bookTitle +" has been added to the library on " +today);
    }

    public void viewLibrary(){
        System.out.println(books);
    }

}
