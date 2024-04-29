import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ask user to enter name and age
        System.out.println(" enter your name: ");
        String name = scan.nextLine();
        System.out.println("enter your age: ");
        int age = scan.nextInt();
        // Create a Customer object with user-provided name and age
        Customer customer = new Customer(name, age);
        // print customer age and name
        System.out.println("customer name is " + customer.getName());
        System.out.println("customer age is " + customer.getAge());
        // Initialize variables for selected movie and menu option
        Bio selectedMovie = null;
        int option = 0;
        while (true) {
            // print 7 display the menu / options
            System.out.println("choose one of the options below: " +
                    "/n 1: see the list of movie " +
                    " /n 2: book a movie" +
                    "/n 3: cancel booking" +
                    "/n 4:exit ");
            try {
                //read user choice
                option = scan.nextInt();
                // validate user choice
                if (option < 0 || option > 4) {
                    System.out.println("<ERROR: choose again>");
                }
                // Break loop if choice is valid
                else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("<ERROR: choose again");
                scan.nextLine();
            }
            // Process user's choice

            switch (option) {
                case 1:
                    displayMovieList(); // print the movies
                    break;

                case 2:
                    bookMovie(scan, customer); // book movie
                    break;

                case 3:
                    cancelBooking(scan, bookedSeat); // cancel a booking
                    break;

                case 4:
                    System.out.println("exiting ...."); // exit the program
                    return;
                break;
                default:
                    System.out.println("<ERROR: choose again>"); // Handle invalid input
                    break;
            }
        }

    }

    // Display list of movies
    private static void displayMovieList() {
        System.out.println("Choose between these movies: ");
        System.out.println("1: Wonka");
        System.out.println("2: Anyone but you");
        System.out.println("3: Godzilla-Kong");
        System.out.println("4: VIP movies (age limit : 18)");
        System.out.println("Choose a movie (enter the number): ");
    }

    // Book a movie
    private static void bookMovie(Scanner scan, Customer customer) {
        int movieId = selectMovie(scan);
        Bio selectedMovie = selectMovieById(movieId);
        //validate user options
        if (selectedMovie == null) {
            System.out.println("Invalid movie selection ");
            return;
        }
        // Display movie selection result
        displayMovieSelectionResult(selectedMovie, customer.getAge());
        // book a seat
        System.out.println("choose a seat : ");
        int Seat = scan.nextInt();
        booking bookedSeat = new booking(Seat);
        // Book the chosen seat
        if (bookedSeat.bookSeat(Seat)) {
            System.out.println("seat" + Seat + "is booked");
        } else {
            System.out.println("the seat is already" + Seat + "booked");
        }
        //display the booking
        displayBookingInfo(customer, selectedMovie, bookedSeat);

    }

    // Select a movie
    private static int selectMovie(Scanner scan) {
        System.out.println("Choose a movie (enter the number): ");
        return scan.nextInt();
    }

    // GET THE MOVIE BY ID
    private static Bio selectMovieById(int movieId) {
        switch (movieId) {
            case 1:
                return new Bio(1, "Wonka", "musical, comedy", 12);
            case 2:
                return new Bio(2, "Anyone but you", "romance", 18);
            case 3:
                return new Bio(3, "Godzilla-Kong", "action, horror", 15);
            case 4:
                return new Bio.VIPMovie("Kung Fu Panda 4", "VIP Movie - Exclusive Screening", 18, "Free snacks and drinks");
            default:
                return null;
        }
    }

    // Display movie selection result
    private static void displayMovieSelectionResult(Bio selectedMovie, int age) {
        if (age >= selectedMovie.getAgelimit()) {
            System.out.println("You are allowed to watch this movie: " + selectedMovie.getTitle());
        } else {
            System.out.println("Sorry, you are not allowed to watch this movie: " + selectedMovie.getTitle());
        }
    }

    // Display booking information
    private static void displayBookingInfo(Customer customer, Bio selectedMovie, booking bookedSeat) {
        System.out.println("Your name is " + customer.getName() + ", your age is " + customer.getAge() + ".");
        System.out.println("You chose to watch '" + selectedMovie.getTitle() + "'.");
        System.out.println("Your booked seat is " + bookedSeat.getSeat() + ".");
    }

    // a MRTHOD TO CANCEL THE MOVIE AND SEAT BOOKING
    private static void cancelBooking(Scanner scan, booking bookedSeat) {
        System.out.println("enter the seatnumber to cancel");
        int seatToCancel = scan.nextInt();
        booking cancelBooking = new booking(seatToCancel);
        // Cancel the booking for the specified seat
        if (cancelSeatBooking(seatToCancel, bookedSeat)) {
            System.out.println("Booking for seat " + seatToCancel + " is canceled.");
        } else {
            System.out.println("No booking found for seat " + seatToCancel + ".");
        }
    }

    // Cancel booking for a specific seat
    private static boolean cancelSeatBooking(int seatNumber, booking bookedSeat) {
        return bookedSeat.cancelSeatBooking(seatNumber);
    }

}