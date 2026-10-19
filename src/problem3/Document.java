package problem3;

public abstract class Document {
    private static int numRecCounter = 1;
    protected  int numRec;
    protected String title;

    public Document(String title){
        this.numRec = numRecCounter++;
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }

    public abstract String toString();
}
