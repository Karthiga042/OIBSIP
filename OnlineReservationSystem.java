import java.util.Scanner;

class User 
{
    private String username;
    private String password;

    public User(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }

    public boolean isValid(String username, String password) 
    {
        return this.username.equals(username) && this.password.equals(password);
    }
}

class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        User user = new User("user", "user123");

        System.out.println("Welcome to Online Reservation System");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (user.isValid(username, password)) 
        {
            System.out.println("Login successful!");
            while (true) 
            {
                System.out.println("\nMain Menu:");
                System.out.println("1. Make Reservation");
                System.out.println("2. Cancel Reservation");
                System.out.println("3. Logout");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) 
                {
                    case 1:
                        makeReservation(scanner);
                        break;
                    case 2:
                        cancelReservation(scanner);
                        break;
                    case 3:
                        System.out.println("Logging out...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } 
        else 
        {
            System.out.println("Invalid username or password. Please try again.");
            scanner.close();
        }
    }

    public static void makeReservation(Scanner scanner) 
    {
        System.out.println("\nMaking Reservation...");
        scanner.nextLine();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter train number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter class type: ");
        String classType = scanner.nextLine();
        System.out.println("Enter date of journey (DD/MM/YYYY): ");
        String date = scanner.nextLine();
        System.out.println("Enter source station: ");
        String source = scanner.nextLine();
        System.out.println("Enter destination station: ");
        String destination = scanner.nextLine();

        System.out.println("Reservation successful!");
    }

    public static void cancelReservation(Scanner scanner) 
    {
        System.out.println("\nCanceling Reservation...");
        System.out.print("Enter PNR number: ");
        scanner.nextLine();
        String pnr = scanner.nextLine();

        System.out.println("Reservation details for PNR " + pnr + ":");
        System.out.println("Name: User");
        System.out.println("Train Number: 12345");
        System.out.println("Class Type: AC Sleeper");
        System.out.println("Date of Journey: 25/07/2024");
        System.out.println("Source: Coimbatore");
        System.out.println("Destination: Chennai");

        System.out.print("Confirm cancellation (press 'OK' to cancel): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("OK")) 
        {
            System.out.println("Reservation with PNR " + pnr + " has been canceled.");
        } 
        else 
        {
            System.out.println("Cancellation aborted.");
        }
    }
}
