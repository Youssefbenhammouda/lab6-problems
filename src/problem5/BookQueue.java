package problem5;

import java.util.LinkedList;

public class BookQueue {
    private final LinkedList<Book> queue;

    public BookQueue(){
        queue = new LinkedList<>();

    }
    public void enqueue(Book book){
        queue.addLast(book);
    }

    public Book dequeue(Book book){
        return queue.removeFirst();
    }

    public Book peek(){
        return queue.getFirst();
    }

    public void display() {
        System.out.println("Queue contents (first to last):");
        var it = queue.listIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();



    }
}
