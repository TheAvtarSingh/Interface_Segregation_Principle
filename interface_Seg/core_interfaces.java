package interface_Seg;

// All Interfaces
// Actions will be performed by User
interface UserActions {
    void ViewBooks();
}

// Actions will be performed by Librarian
interface LibrarianActions {
    void addBook();

    void removeBook();
}

// Actions will be performed by Admin
interface AdminActions {
    void addUser();

    void removeUser();

}
