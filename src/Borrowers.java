import java.time.LocalDate;
import java.util.PriorityQueue;

public class Borrowers extends Library implements Comparable<Borrowers>  {

    Integer rank;
    String name = null;
    String bookToBorrow;
    LocalDate dayOfBorrow;

    PriorityQueue<Borrowers> borrowerList = new PriorityQueue<>();

    public Borrowers(Integer rank, String name, String bookToBorrow, LocalDate dayOfBorrow) {
        super();
        this.rank = rank;
        this.name = name;
        this.bookToBorrow = bookToBorrow;
        this.dayOfBorrow = dayOfBorrow;
    }

    public Integer getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getBookToBorrow() {
        return bookToBorrow;
    }

    public LocalDate getDayOfBorrow() {
        return dayOfBorrow;
    }

    public void borrow(Borrowers e) {
        borrowerList.add(e);
              System.out.println(borrowerList);
    }

    public void lend(Library num){

        while(!borrowerList.isEmpty())
        {
            System.out.println("This is library before lending " +num.getBooks());
            Borrowers a = borrowerList.poll();

            if(num.getBooks().containsKey(a.bookToBorrow) && num.getBooks().get(a.bookToBorrow) != 0){

                 num.getBooks().replace(a.bookToBorrow, num.getBooks().get(a.bookToBorrow) - 1);
                System.out.println(a);
            }

            else{
                System.out.println("You wanted to borrow " + a.bookToBorrow+ ", book has been taken");
            }

            System.out.println("This is Library after lending " + num.getBooks());

        }
    }

    @Override
    public int compareTo(Borrowers emp) {
        return this.getRank().compareTo(emp.getRank());

    }

    @Override
    public String toString() {
        return "Take your book [rank=" + rank + ", name=" + name + ", book to borrow=" + bookToBorrow + ", day of borrow=" + dayOfBorrow + "]";
    }



}
