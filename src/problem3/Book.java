package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;


    public Book( String title,String author, int nbrPages) {
        super( title);

        this.author = author;
        this.nbrPages = nbrPages;
    }


    @Override
    public String toString() {
        return String.format("Book: %s authored by %s (%d pages) (Reccord number: %d).",title,author,nbrPages,numRec);
    }

    public String getAuthor() {
        return author;
    }

    public int getNbrPages() {
        return nbrPages;
    }
}
