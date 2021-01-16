public class TestCustomer2 {
    public static void main(String[] args){
        Customer2 customer = new Customer2(1, "Saltok", 'f');
        System.out.println(customer.toString());
        System.out.println(customer.getGender());
        System.out.println(customer.getID());
        System.out.println(customer.getName());
    }
}
