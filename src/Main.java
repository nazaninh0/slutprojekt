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
        Customer booking = new Customer(customer);

    }
}