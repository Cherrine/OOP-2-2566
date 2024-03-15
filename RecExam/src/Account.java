public abstract class Account implements DepositAble{
    protected double balance;
    protected String name;
    
    public void Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract void getInfoAcct();
    
    @Override
    public String toString(){
        return this.name + " Account has " + this.balance + " Baht.";
    }
}
