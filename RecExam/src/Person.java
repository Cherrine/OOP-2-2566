
public abstract class Person {
    private String name;
    private CheckingAccount myAcct;
    private Item myItem;

    public Person() {
        this("", null, null);
    }

    public Person(String name, CheckingAccount myAcct, Item myItem) {
        this.name = name;
        this.myAcct = myAcct;
        this.myItem = myItem;
    }
    
    public abstract String getInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckingAccount getMyAcct() {
        return myAcct;
    }

    public void setMyAcct(CheckingAccount myAcct) {
        this.myAcct = myAcct;
    }

    public Item getMyItem() {
        return myItem;
    }

    public void setMyItem(Item myItem) {
        this.myItem = myItem;
    }

}
