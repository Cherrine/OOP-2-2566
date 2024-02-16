public abstract class Person {
    private String name;
    private CheckingAccount myAcct;
    private Item item;
    
    public Person(){
        this("", null, null);
    }
    
    public Person(String name, CheckingAccount myAcct, Item myItem){
        super(name, myAcct, myItem);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setItem(Item myItem){
        this.myItem = myItem;
    }
    
    public Item getItem(){
        return this.myItem;
    }
    
    
}
