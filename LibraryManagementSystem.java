import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do{
            System.out.println("\n----Library Management System----");

            System.out.println("1. Add Book");
            System.out.println("2. Registed User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Books");
            System.out.println("6. Display Users");
            System.out.println("7. Exit");

            System.out.println("Enter Your Choice: ");
          choice = scanner.nextInt();
          scanner.nextLine();

          switch (choice) {
            case 1:
                System.out.println("Enter Book Id: ");
                int bookId = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter Book Title: ");
                String title = scanner.nextLine();

                System.out.println("Enter Author Name: ");
                String author= scanner.nextLine();

                Book book = new Book(bookId, title, author);
                library.addBook(book);
                
                break;

            case 2:
                System.out.println("Enter User Id: ");
                int userId= scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter User Name: ");
                String name= scanner.nextLine();

                User user = new User(userId, name);
                library.addUser(user);

            case 3:
                System.out.println("Enter Book Id: ");
                int issueBookId = scanner.nextInt();

                System.out.println("Enter User Id: ");
                int issueuserId= scanner.nextInt();

                library.issueBook(issueBookId, issueuserId);
                break;

            case 4:
                System.out.println("Enter Book Id: ");
                int returnBookId = scanner.nextInt();

                library.returnBook(returnBookId);
                break;

            case 5:
                library.displayBooks();
                break;

            case 6:
                library.displayUsers();
                break;

            case 7:
                System.out.println("Thank you for using the Library Management System!");
                break;

          
            default:
                System.out.println("Invalid choice. Please try again.");
                
          }

        }
        while(choice!=7);
        scanner.close();
    }
    
}
