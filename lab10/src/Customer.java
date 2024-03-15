
import java.util.*;

public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;

    public Account getAccount(int index) {
        return acct.get(index);
    }

    public void addAccount(Account acct) {
        this.acct.add(acct);
    }

    public int getNumOfAccount() {
        return acct.size();
    }

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList(10);

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public CheckingAccount getAcct(CheckingAccount acct) {
        return acct;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " has " + this.getNumOfAccount() + " accounts.";
    }

    public boolean equals(Customer c) {
        return (c.firstName.equals(this.firstName)) && (c.lastName.equals(this.lastName));
    }
}