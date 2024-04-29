import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter your name: ");
        String name = scan.nextLine();
        System.out.println("enter your age: ");
        int age = scan.nextInt();
        Customer customer = new Customer(name, age);
        System.out.println("customer name is " + customer.getName());
        System.out.println("customer age is " + customer.getAge());
        //int movieId = scan.nextInt();
        Bio selectedMovie = null;
        int option = 0;
        while (true) {
            System.out.println("choose one of the options below: " +
                    "/n 1: see the list of movie " +
                    " /n 2: book a movie" +
                    "/n 3: cancel booking" +
                    "/n 3:exit ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    displayMovieList();

                case 2:
                    bookMovie(scan, customer);

                case 3:
                    cancelBooking(scan);

                case 4:
                    System.out.println("exiting ....");
                    return;

            }
        }

    }

    private static void displayMovieList() {
        System.out.println("Choose between these movies: ");
        System.out.println("1: Wonka");
        System.out.println("2: Anyone but you");
        System.out.println("3: Godzilla-Kong");
        System.out.println("4: VIP movies (age limit : 18)");
        System.out.println("Choose a movie (enter the number): ");
    }

    private static void bookMovie(Scanner scan, Customer customer) {
        int movieId = selectMovie(scan);
        Bio selectedMovie = selectMovieById(movieId);
        if (selectedMovie == null) {
            System.out.println("Invalid movie selection ");
            return;
        }
        displayMovieSelectionResult(selectedMovie, customer.getAge());
        System.out.println("choose a seat : ");
        int Seat = scan.nextInt();
        booking bookedSeat = new booking(Seat);
        if (bookedSeat.bookSeat(Seat)) {
            System.out.println("seat" + Seat + "is booked");
        } else {
            System.out.println("the seat is already" + Seat + "booked");
        }
        displayBookingInfo(customer, selectedMovie, bookedSeat);

    }

    private static int selectMovie(Scanner scan) {
        System.out.println("Choose a movie (enter the number): ");
        return scan.nextInt();
    }

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

    private static void displayMovieSelectionResult(Bio selectedMovie, int age) {
        if (age >= selectedMovie.getAgelimit()) {
            System.out.println("You are allowed to watch this movie: " + selectedMovie.getTitle());
        } else {
            System.out.println("Sorry, you are not allowed to watch this movie: " + selectedMovie.getTitle());
        }
    }

    private static void displayBookingInfo(Customer customer, Bio selectedMovie, booking bookedSeat) {
        System.out.println("Your name is " + customer.getName() + ", your age is " + customer.getAge() + ".");
        System.out.println("You chose to watch '" + selectedMovie.getTitle() + "'.");
        System.out.println("Your booked seat is " + bookedSeat.getSeat() + ".");
    }

    private static void cancelBooking(Scanner scan) {
        System.out.println("enter the seatnumber to cancel");
        int seatToCancel = scan.nextInt();
        if (cancelSeatBooking(seatToCancel)) {
            System.out.println("Booking for seat " + seatToCancel + " is canceled.");
        } else {
            System.out.println("No booking found for seat " + seatToCancel + ".");
        }
    }

    private static boolean cancelSeatBooking(int seatNumber) {
        // Assuming bookedSeatList is a list that keeps track of booked seats
        return bookedSeatList.remove(Integer.valueOf(seatNumber));
    }

}