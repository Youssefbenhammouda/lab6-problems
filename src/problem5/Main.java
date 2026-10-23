package problem5;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book orwell = new Book("1984", "George Orwell", 1949);
        Book cleanCode = new Book("Clean Code", "Robert C. Martin", 2008);

        // Stack (LIFO)
        System.out.println("=== Stack Test ===");
        BookStack stack = new BookStack();
        stack.push(hobbit);
        stack.push(orwell);
        stack.push(cleanCode);

        stack.display();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        stack.display();

        // Queue (FIFO)
        System.out.println("=== Queue Test ===");
        BookQueue queue = new BookQueue();
        queue.enqueue(hobbit);
        queue.enqueue(orwell);
        queue.enqueue(cleanCode);

        queue.display();
        System.out.println("Dequeued: " + queue.dequeue(null));
        System.out.println("Front: " + queue.peek());
        queue.display();
    }



}
