package problem3;

public class Novel extends Book {
    private double price;

    public Novel(String title, String author, int nbrPages, double price) {
        super(title, author, nbrPages);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Novel: %s authored by %s (%d pages), price %.2f (Record number: %d).",
                title, author, nbrPages, price, numRec);
    }
}
