public class TestInvoice {
    public static void main(String[] args){
        Customer customer = new Customer(2,"Sugnat", 12);
        Invoice invoice = new Invoice(2,customer,3);
        invoice.setAmount(12);
        invoice.setCustomer(customer);
        System.out.println(invoice.getCustomerName());
        System.out.println(invoice.getAmount());
        System.out.println(invoice.getAmountAfterDiscount());
        System.out.println(invoice.getCustomer());
        System.out.println(invoice.getID());
    }
}
