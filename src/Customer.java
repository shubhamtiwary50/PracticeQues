/*
Create a class called Customer, which holds the data about customer, this will hold name, address, email, mobile and premium membership(yes/ no).
This class must be properly encapsulated as well as will contain two constructor.
This class must contain a method called displayCustomer(), which will display customer information.
Write an implementation, create object1 by calling parameterized constructor, create second object by calling no- arguments constructor, display them and change there references means object1 should display object2 values and object2 will display object1 values.
 */
public class Customer {
        String customerName;
        String address;
        String email;
        int mobileNo;
        String membershipStatus;

        Customer()
        {
        }
        Customer(String customerName, String address, String email, int mobileNo, String membershipStatus )
        {
            this.customerName= customerName;
            this.address=address;
            this.email=email;
            this.mobileNo= mobileNo;
            this.membershipStatus= membershipStatus;
        }
        public void displayCustomer()
        {
            System.out.println(customerName);
            System.out.println(address);
            System.out.println(email);
            System.out.println(mobileNo);
            System.out.println(membershipStatus);
        }

        public static void main(String[] args) {
            Customer customer1 = new Customer("Rohan","Delhi","dhgga@gmail.com",56734453,"No");
            Customer customer2= new Customer("Shubham", "Rourkela", "fgsn@gmail.com", 786756534,"Yes");
            System.out.println("customer2.displayCustomer(); = ");
            customer2.displayCustomer();
            System.out.println("customer1.displayCustomer(); = ");
            customer1.displayCustomer();
            System.out.println("customer3.displayCustomer(); = ");
            Customer customer3= new Customer();
            customer3.displayCustomer();
        }
    }

