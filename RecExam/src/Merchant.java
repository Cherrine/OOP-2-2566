public class Merchant extends Person{

    public Merchant() {
        this("", null, null);
    }

    public Merchant(String name, CheckingAccount myAcct, Item myItem) {
        super(name, myAcct, myItem);
    }
    
    
    public Item sellItem(Person w){
        if(((Wizard)w).pay(this, this.getMyItem().getPrice())){
            System.out.println("[M] Exchange Complete");
            Item give = this.getMyItem();
            this.setMyItem(null);
            return give;
        }
        System.out.println("[M] Exchange Incomplete");
        return null;
    }
    
    public boolean collectMoney(Person w, double p){
        if(this.getMyAcct().deposit(p)){
            System.out.println("[M] I got "+ w.getName()+ " money ("+p+").");
            return true;
        }
        System.out.println("[M] "+w.getName()+" is not enough money.");
        return false;
    }
    
    @Override
    public String getInfo(){
        return "[M] I'm a "+this.getName()+" Merchant ("+this.getMyAcct()+"). There is a/an "+this.getMyItem()+" in my bag.";
    }
}
