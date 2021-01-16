public class TestAccount {
    public static void main(String[] args){
        Customer2 customer2 = new Customer2(1,"Saltok", 'f');
        Account account = new Account(1,customer2, 12.11);
        account.setBalance(11);
        System.out.println(account.getID());
        System.out.println(account.getBalance());
        System.out.println(account.getCustomer2());
        System.out.println(account.toString());
    }
}
