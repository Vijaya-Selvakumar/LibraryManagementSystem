import java.util.ArrayList;

public class Library {
   private ArrayList<Book> books;
   private ArrayList<User> users;
    
   public Library(){
    books= new ArrayList<>();
    users= new ArrayList<>();
   }

   // Add a book

   public void addBook(Book book){
    books.add(book);
    System.out.println("Book added Successfully.");
   }

   // Register a User

   public void addUser(User user){
    users.add(user);
    System.out.println(" User registered successfully");
   }

   // Issue a book

   public void issueBook(int bookId, int userId){
    Book book = findBook(bookId);
    User user = findUser(userId);

    if (book == null)
    {
        System.out.println("Book not Found");
        return;
    }

    if (user == null)
        {
            System.out.println("User not found");
            return ;
        }

        if (book.isIssued())
        {
            System.out.println("Book is already issued.");
            return;
        }

        book.issueBook();

        System.out.println("Book: "+ book.getTitle() + "issued to :"+ user.getName()+".");
        
   }

   //Return a book

   public void returnBook(int bookId){
    Book book = findBook(bookId);

    if(book == null)
    {
        System.out.println("Book is not found");
        return;
    }
    if(!book.isIssued())
    {
        System.out.println("Book is already available");
        return;
    }
    book.returnBook();
    System.out.println("Book: " + book.getTitle() + "is returned successfully.");
   }

   // Find book by id

   private Book findBook(int bookId){
    for(Book book: books)
    {
        if(book.getBookId()==bookId);
        {
            return book;
        }
    }
        return null;
    }

  // Find user by id

  private User findUser(int userId){
    for(User user: users)
    {

        if (user.getUserId()==userId)
        {
            return user;
        }
    }
        return null;
  }
    
// Display all books

public void displayBooks(){
    System.out.println("\n ---Books in Library---");

    if(books.isEmpty())
    {
        System.out.println("No books available");
        return;
    }
    for(Book book: books)
    {
        book.displayBook();
    }
}

// Display all users

public void displayUsers(){
    System.out.println("\n-----Registed Users----------");

    if(users.isEmpty())
    {
        System.out.println("No users registered");
        return;
    }
    for(User user: users)
    {
        user.displayUser();
    }
}

}
