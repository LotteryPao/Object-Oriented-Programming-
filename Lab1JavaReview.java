import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
       
        String[] books = new String[5];
        String[] status = new String[5];
        int count = 0;
        Scanner input = new Scanner(System.in);
        boolean run = true;

        System.out.println("Welcome to Library System!");

        while (run) {
            // Show menu
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book Status");
            System.out.println("3. Show All Books");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Choose option (1-5): ");

            int choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {
                
                if (count >= 5) {
                    System.out.println("Sorry, cannot add more books! Maximum is 5.");
                } else {
                    System.out.print("Enter book title: ");
                    String title = input.nextLine();
                    books[count] = title;
                    status[count] = "Available";
                    count++;
                    System.out.println("Book added! Total books: " + count);
                }

            } else if (choice == 2) {
              
                if (count == 0) {
                    System.out.println("No books in system!");
                } else {
                    System.out.println("\nBooks List:");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i+1) + ". " + books[i] + " - " + status[i]);
                    }

                    System.out.print("Enter book number to update: ");
                    int bookNum = input.nextInt();

                    if (bookNum < 1 || bookNum > count) {
                        System.out.println("Invalid book number!");
                    } else {
                        int index = bookNum - 1;
                        if (status[index].equals("Available")) {
                            status[index] = "Borrowed";
                            System.out.println(books[index] + " is now Borrowed");
                        } else {
                            status[index] = "Available";
                            System.out.println(books[index] + " is now Available");
                        }
                    }
                }

            } else if (choice == 3) {
               
                if (count == 0) {
                    System.out.println("No books in system!");
                } else {
                    System.out.println("\n=== ALL BOOKS ===");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i+1) + ". " + books[i] + " - " + status[i]);
                    }
                }

            } else if (choice == 4) {
           
                if (count == 0) {
                    System.out.println("No books in system!");
                } else {
                    int available = 0;
                    int borrowed = 0;

                    for (int i = 0; i < count; i++) {
                        if (status[i].equals("Available")) {
                            available++;
                        } else {
                            borrowed++;
                        }
                    }

                    System.out.println("\n=== REPORT ===");
                    System.out.println("Total books: " + count);
                    System.out.println("Available: " + available);
                    System.out.println("Borrowed: " + borrowed);
                }

            } else if (choice == 5) {
        
                System.out.println("Thank you for using the system! Goodbye!");
                run = false;

            } else {
                System.out.println("Invalid choice! Please choose 1-5.");
            }
        }

        input.close();
    }
}
