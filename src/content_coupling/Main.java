package content_coupling;

public class Main {
    public static void main(String[] args) {
        CustomerHandler customerHandler = new CustomerHandler();
        Customer c = new Customer("Son", "Nguyen");
        customerHandler.handleCustomer(c);
    }
}
