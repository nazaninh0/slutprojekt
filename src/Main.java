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
        int movieId = scan.nextInt();
        Bio selectedMovie = null;
        while (true) {
            switch (movieId) {

                case 1:
                    selectedMovie = new Bio(1, "Wonka", "muiscal, comedy", 12);
                    break;
                case 2:
                    selectedMovie = new Bio(2, "anyone but you ", "romance", 18);
                    break;
                case 3:
                    selectedMovie = new Bio(3, "Godzilla- Kong ", "action , horror", 15);
                    break;
                case 4:
                    selectedMovie = new Bio.VIPMovie("Kung Fu Panda 4", "VIP Movie - Exclusive Screening", 18, "Free snacks and drinks");
                    break;
                default:
                    System.out.println("Invalid movie selection");
                    return;
            }
            if (age >= selectedMovie.getAgelimit()) {
                System.out.println("you are allowd to watch this movie" + selectedMovie.getTitle());

            } else {
                System.out.println("sorry you are not allowed to watch this movie: " + selectedMovie.getTitle());
            }

            System.out.println("choose a seat : ");
            int Seat = scan.nextInt();
            booking bookedSeat = new booking(Seat);
            if (bookedSeat.bookSeat(Seat)) {
                System.out.println("seat" + Seat + "is booked");
            } else {
                System.out.println("the seat is already" + Seat + "booked");
            }
            displayBookingInfo(customer, selectedMovie, bookedSeat);

            //System.out.println(" your booked seat is " + bookedSeat.getSeat());
            // System.out.println("your name is" + customer.getName() + "your age is " + customer.getAge() + " you chose " + selectedMovie.getTitle() + "to watch" + " and your booked seat is" + bookedSeat.getSeat());
        }

    }

    private static int selectMovie(Scanner scan) {
        System.out.println("Choose between these movies: ");
        System.out.println("1: Wonka");
        System.out.println("2: Anyone but you");
        System.out.println("3: Godzilla-Kong");
        System.out.println("4: VIP movies (age limit : 18)");
        System.out.println("Choose a movie (enter the number): ");
        return scan.nextInt();
    }

    private static void displayBookingInfo(Customer customer, Bio selectedMovie, booking bookedSeat) {
        System.out.println("Your name is " + customer.getName() + ", your age is " + customer.getAge() + ".");
        System.out.println("You chose to watch '" + selectedMovie.getTitle() + "'.");
        System.out.println("Your booked seat is " + bookedSeat.getSeat() + ".");
    }
}