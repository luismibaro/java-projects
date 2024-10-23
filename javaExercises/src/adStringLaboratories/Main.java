package adStringLaboratories;

public class Main {
    public static void main(String args[]){

        // TODO 1: Declare and initialize variable for Last Name
        // TODO 1: Declare and initialize variable for First Name
        String firstName = "Sandy";
        String lastName = "Jones";

        // TODO 1: Declare and initialize variable for Movie Title
        String movieTitle = "The Source Code";

        // TODO 1: Declare and initialize variable for Number of tickets
        int numberOfTickets = 8;

        // TODO 1: Declare and initialize variable for Price per ticket
        double priceOfTickets = 10.57;

        // TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price.
        double totalPrice = numberOfTickets * priceOfTickets;

        // TODO 3: Concatenate first name and last name into new variable username with no space in between
        String username = firstName + lastName;
        String usernameLowerCase = username.toLowerCase();
        // first and last name and convert them to lower case

        // TODO 4: Convert the movie title to upper case and assign to variable movieName
        String movieName = movieTitle.toUpperCase();

        // TODO 5: Write multiple print statements to show your output as per the Final Expected Output
        System.out.println("Congratulations! You have successfully booked the tickets!");

        System.out.println(System.lineSeparator());
        System.out.println("Username: " + usernameLowerCase);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Price per ticket: $" + priceOfTickets);
        System.out.println("Total Price of " + numberOfTickets + " tickets: " + totalPrice);
        System.out.println(System.lineSeparator());
        System.out.println("Thank you for choosing us for booking your movie tickets. \nEnjoy your movie!!!");

    }



}
