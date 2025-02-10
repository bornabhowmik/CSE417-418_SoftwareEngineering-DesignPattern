public class Book {
    private String bookId;
    private String title;
    private String author;
    private int totalCopies;
    private int borrowedCopies;

    public Book(String bookId, String title, String author, int totalCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.borrowedCopies = 0;
    }

    public void borrowBook() {
        if (borrowedCopies < totalCopies) {
            borrowedCopies++;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " not available.");
        }
    }

    public void returnBook() {
        if (borrowedCopies > 0) {
            borrowedCopies--;
            System.out.println(title + " returned ");
        } else {
            System.out.println("No copies of " + title + " were borrowed.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Total Copies: " + totalCopies);
        System.out.println("Available Copies: " + (totalCopies - borrowedCopies));
        System.out.println("-----");
    }

    public static void main(String[] args) {
        
        Book book1 = new Book("111", "J_Programming", "J_D", 5);
        Book book2 = new Book("222", "S_Engineering", "J_S", 3);

        book1.borrowBook();
        book1.borrowBook();
        book2.borrowBook();
        book2.returnBook();

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
