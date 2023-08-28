package interface_Seg;

public class runner {

    public static void main(String[] args) {
        System.out.println(" :: Getting Readers Operations :: ");
        Reader reader = new Reader();
        reader.ViewBooks();
        System.out.println(" :: Getting Librarian Operations :: ");
        Librarian librarian = new Librarian();
        librarian.ViewBooks();
        librarian.addBook();
        librarian.removeBook();
        System.out.println(" :: Getting Admin Operations :: ");
        Admin admin = new Admin();
        admin.ViewBooks();
        admin.addUser();
        admin.removeUser();

    }
}
