public class TheAccount {
    private String id;
    private String name;
    private int balance;
    public TheAccount(){
        balance=0;
    }

    public TheAccount(String id,String name){
        this.id=id;
        this.name=name;
    }

    public TheAccount(String id,String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        balance+=amount;
        return balance;
    }
    public int debit(int amount){
        if(amount<=balance)  balance-=amount;
        else{
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public int transferTo(TheAccount another, int amount){
        if(amount<=balance) another.balance+=amount;
        else System.out.println("amount exceeded");
        return balance;
    }

    public String toString(){
        return "Account[id="+id+" name="+name+" balance="+balance+"]";
    }
}
