public class Wizard extends Person {
    public Wizard(){
        this("", null, null);
    }
    
    public Wizard(String name, CheckingAccount myAcct, Item myItem){
        super(name, myAcct, myItem);
    }
    
    @Override
    public String getInfo(){
        return "[W] I'm a " + this.getName() + " Wizard (" + this.getMyAcct() + "). There is a/an " + this.getMyItem() + " in my bag.";
    }
    
    
    public void buyItem(Person m){
        Item boughtItem = ((Merchant)m).sellItem(this);
        if(boughtItem != null){
            System.out.println("[W] I got it.");
            this.setMyItem(boughtItem);
        }else{
            System.out.println("[W] Fail.");
        }
    }
    
    public boolean pay(Person m, double p){
        if(this.getMyAcct().withdraw(p)){
            ((Merchant)m).collectMoney(this, p);
            System.out.println("[W] I have paid the item fees to "+m.getName());
            return true;
        }else{
            System.out.println("[W] I don’t have enough money.");
            return false;
        }
    }
}
