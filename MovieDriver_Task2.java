import java.util.Scanner;

public class MovieDriver_Task2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true; // Variable to control the loop

        while (continueLoop) {
            Movie movie = new Movie();

            System.out.println("Enter the title of the movie:");
            String title = scanner.nextLine();
            movie.setTitle(title);

            System.out.println("Enter the rating of the movie:");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            System.out.println("Enter the number of tickets sold at the theater:");
            int soldTickets = scanner.nextInt();
            movie.setSoldTickets(soldTickets);

            System.out.println(movie.toString());

            scanner.nextLine(); // Consume the remaining newline character

            System.out.println("Do you want to enter another movie? (Y/N)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("N")) {
                continueLoop = false; // Exit the loop if the user enters 'N'
            }
        }

        System.out.println("Goodbye");

        scanner.close();
    }
}