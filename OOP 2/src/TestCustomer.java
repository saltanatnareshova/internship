public class TestCustomer {
    public static void main(String[] args){
        Customer customer = new Customer(1, "Saltok", 12);
        customer.setDiscount(45);
        System.out.println(customer.toString());
        System.out.println(customer.getDiscount());
    }
}
