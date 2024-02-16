public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public void setEnergy(int energy){
        this.energy = energy;
    }
    
    public int getEnergy(){
        return energy;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    
    public static String getNationality(){
        return nationality;
    }
    
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    
    public Wallet getWallet(){
        return wallet;
    }
    
    public void eat(Food f){
        this.energy += Food.getEnergy();
    }
    
    public boolean buyFood(Seller s){
        Food food = s.sell(this);
        if (food != null){
            eat(food);
            return true;
        }
        return false;
    }
    
    public boolean equals(Employee e){
       return (this.name.equals(e.getName()));
    }
    
    @Override
    public String toString(){
        return ("My name is "+this.name+". \nI have "+this.energy+" energy left.\nI have a balance of "+wallet.getBalance()+" baht.");
    }
}
