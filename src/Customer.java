import java.util.List;

public class Customer {
    //private Customer customer;
    private String name; // name of the customer
    private int age; // age of the customer

    // Constructor to initialize a customer with a name and age
    public Customer(String name, int age) {
        this.name = name; // Initialize the name
        this.age = age; // Initialize the age
    }

    // Method to get the name of the customer
    public String getName() {
        return name;
    }
    // Method to get the age of the customer

    public int getAge() {
        return age; // return the age
    }

}


