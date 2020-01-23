import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        Library library = new Library("Him", 0);
        Library book1 = new Library("Things fall apart", 7);
        Library book2 = new Library("Heroes", 3);
        Library book3 = new Library("Heroes",3);

  //to add book to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //to view the books in the library
        library.viewLibrary();

 //to create instance of borrowers
        Borrowers librarian = new Teachers(1,"librarian", "Heroes", LocalDate.now());
        Borrowers john = new Teachers(1, "john", "Things fall apart",LocalDate.now());
        Borrowers mary = new JuniorStudents(3, "mary", "Heroes",LocalDate.now());
        Borrowers peter = new SeniorStudents(2, "peter", "Things fall apart",LocalDate.now());
        Borrowers james = new SeniorStudents(2, "james", "Heroes", LocalDate.now());

 // To register borrowers into the borrowerList priorityQuue
        librarian.borrow(mary);
        librarian.borrow(peter);
        librarian.borrow(john);
        librarian.borrow(james);

// to lend books to registered borrrowers according to priority queue
        librarian.lend(library);

    }
}
