import java.util.Scanner;

public class MovieDriver_Task1  {
	public static void main(String[] args) {
		// Create a new Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Create a new Movie object
		Movie movie = new Movie();

		System.out.println("Enter the title of the movie:");
		// Read the line that the user types as the movie title
		String title = scanner.nextLine();
		// Set the title in the movie object
		movie.setTitle(title);

		System.out.println("Enter the rating of the movie:");
		// Read the line that the user types as the movie rating
		String rating = scanner.nextLine();
		// Set the rating in the movie object
		movie.setRating(rating);

		System.out.println("Enter the number of tickets sold at the theater:");
		// Read the integer that the user types as the number of tickets sold
		int soldTickets = scanner.nextInt();
		// Set the number of tickets sold in the movie object
		movie.setSoldTickets(soldTickets);

		// Print out the information using the movie's toString method
		System.out.println(movie.toString());
		System.out.println("Goodbye");

		// Close the Scanner object to release system resources
		scanner.close();
	}
}