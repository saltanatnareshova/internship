public class Account {
    private int ID;
    private Customer2 customer2;
    private double balance;
    public Account(int ID, Customer2 customer2, double balance){
        this.ID=ID;
        this.customer2=customer2;
        this.balance=balance;
    }
    public Account(int ID, Customer2 customer2){
        this.ID=ID;
        this.customer2=customer2;
    }
    public int getID(){
        return ID;
    }
    public Customer2 getCustomer2(){
        return customer2;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String toString(){
        return customer2.toString()+" balance="+balance;
    }

}
