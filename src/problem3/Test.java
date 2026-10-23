package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the library capacity (n): ");
        int n = sc.nextInt();
        sc.nextLine();
        Library library = new Library(n);


        library.addDocument(new Novel("The Alchemist", "Paulo Coelho", 208, 120.0));
        library.addDocument(new Dictionary("Larousse", "French"));

        int choice;
        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Add a document");
            System.out.println("2. Display all documents");
            System.out.println("3. Delete a document");
            System.out.println("4. Find a document by record number");
            System.out.println("5. Display authors");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    Document doc = readDocument(sc);
                    if (doc == null) {
                        System.out.println("Invalid type.");
                    } else if (library.addDocument(doc)) {
                        System.out.println("Added: " + doc);
                    } else {
                        System.out.println("Failed: library is full or document already exists.");
                    }
                }
                case 2 -> {
                    library.displayDocuments();
                    System.out.println();
                }
                case 3 -> {
                    System.out.print("Record number to delete: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    Document doc = library.document(num);
                    if (doc != null && library.delete(doc)) {
                        System.out.println("Deleted: " + doc);
                    } else {
                        System.out.println("No document with record number " + num);
                    }
                }
                case 4 -> {
                    System.out.print("Record number: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    Document doc = library.document(num);
                    System.out.println(doc != null ? doc : "No document with record number " + num);
                }
                case 5 -> library.displayAuthors();
                case 0 -> System.out.println("Bye!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }

    private static Document readDocument(Scanner sc) {
        System.out.println("Type: 1. Novel  2. Textbook  3. Magazine  4. Dictionary");
        System.out.print("Type: ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        switch (type) {
            case 1, 2 -> {
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("Number of pages: ");
                int pages = sc.nextInt();
                sc.nextLine();
                if (type == 1) {
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    return new Novel(title, author, pages, price);
                }
                System.out.print("Level: ");
                String level = sc.nextLine();
                return new Textbook(title, author, pages, level);
            }
            case 3 -> {
                System.out.print("Month: ");
                String month = sc.nextLine();
                System.out.print("Year: ");
                int year = sc.nextInt();
                sc.nextLine();
                return new Magazine(title, month, year);
            }
            case 4 -> {
                System.out.print("Language: ");
                String language = sc.nextLine();
                return new Dictionary(title, language);
            }
            default -> {
                return null;
            }
        }
    }
}
