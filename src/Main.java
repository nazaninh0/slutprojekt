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
        //Customer booking = new Customer(customer);
        System.out.println("customer name is " + customer.getName());
        System.out.println("customer age is " + customer.getAge());
        System.out.println("choose between these movies: \n 1: Wonka \n 2: Anyone but you \n 3:Godzilla-Kong");
        System.out.println("4: VIP movies ( age limit : 18 ) ");
        System.out.println("choose between one these movies (OBS !! write the number)  :");
        int movieId = scan.nextInt();
        Bio selectedMovie = null;
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

        System.out.println("   1   2   3   4   5   6   7  \n 8   9   10   11   12   13   14 \n 15   16   17   18   19   20   21");
        System.out.println("choose a seat : ");
        int Seat = scan.nextInt();
        booking bookedSeat = new booking(Seat);
        System.out.println(" your booked seat is " + bookedSeat.getSeat());


    }
}