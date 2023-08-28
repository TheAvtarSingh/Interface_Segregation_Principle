package interface_Seg;

// If the user is reader
class Reader implements UserActions {

    @Override
    public void ViewBooks() {
        System.out.println("Getting Available Books as User");
    }

}

class Librarian implements UserActions, LibrarianActions {

    @Override
    public void addBook() {
        System.out.println("Adding a Book as Librarian ");
    }

    @Override
    public void removeBook() {
        System.out.println("Removing a Book as Librarian ");
    }

    @Override
    public void ViewBooks() {
        System.out.println("Getting Available Books as Librarian ");
    }

}

class Admin implements UserActions, AdminActions {

    @Override
    public void addUser() {
        System.out.println("Adding New User as Admin ");
    }

    @Override
    public void removeUser() {
        System.out.println("Removing Existing User as Admin");
    }

    @Override
    public void ViewBooks() {
        System.out.println("Getting Available Books as Admin ");
    }

}