package problem3;

import java.util.ArrayList;

public class Library {

    private int capacity;

    private ArrayList<Document> documents  ;

    public Library(int capacity){

        this.capacity = capacity;

        documents= new ArrayList<>(capacity);

    }

    public void displayDocuments() {

        System.out.printf("Library Documents: ");

        for (int i = 0; i < documents.size(); i++) {
            System.out.printf(" - %s",documents.get(i) );
        }
    }

    public boolean addDocument(Document doc){
        if(documents.size() >= capacity) return false;
        int i = documents.indexOf(doc);
        if(i>-1) return false;

        documents.add(doc);
        return  true;


    }
    public boolean delete(Document doc){
        return documents.remove(doc);
    }

    public Document document(int numRec){

        return documents.stream().filter(d -> d.numRec==numRec).findFirst().orElse(null);
    }


    public void displayAuthors(){
        System.out.print("List of authors: ");

        for (int i = 0; i < documents.size(); i++) {
            Document d = documents.get(i);
            if( d instanceof Book) System.out.print(((Book) d).getAuthor());
        }
        System.out.println();
    }

}
