public class Book {
    private String title;
    private String accessionNumber;
    private String authorName;
    private double price;

    public Book(String title, String accessionNumber, String authorName, double price) {
        this.title = title;
        this.accessionNumber = accessionNumber;
        this.authorName = authorName;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Accession Number: " + accessionNumber);
        System.out.println("Author: " + authorName);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Shivesh Lover", "A-987654", "Ashesh", 150);
        myBook.displayBookDetails();
    }
}
