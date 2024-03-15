public class CheckingAccount extends Account implements WithdrawAble{
    private static double RATE = 0.1;
    
    public CheckingAccount() {
        this.balance = 0.0;
        this.name = "";
    }
    public CheckingAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    
    public void setRATE(double RATE){
        CheckingAccount.RATE = RATE;
    }
    
    public static double getRATE(){
        return RATE;
    }
    
    public void showInterest(){
        showInterest(1);
    }
    
    public void showInterest(int year){
        System.out.println(getBalance()*getRATE()*year);
    }
    
    @Override
    public void getInfoAcct(){
        System.out.println(this.getName() + " Checking Account has " + this.getBalance() + " Baht.");
    }
    
    @Override
    public boolean deposit(double a){
        if (a > 0){
            setBalance(getBalance()+a);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean withdraw(double a){
        if (a <= 0){
            System.out.println("Not support zero or negative number.");
        }else if (getBalance() - a > 0){
            System.out.println("[CA] Transaction success.");
            return true;
        }
        System.out.println("[CA] Transaction fail.");
        return false;
        
    }
    
    
}
