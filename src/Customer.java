
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

