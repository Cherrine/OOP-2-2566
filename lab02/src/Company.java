import java.util.*;
public class Company {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salary = 0;
        
        System.out.println("Please insert your name : ");
        String name = input.nextLine();
        System.out.println("Please insent your age : ");
        int age = input.nextInt();
        System.out.println("Please insert number of working days : ");
        int days = input.nextInt();
        System.out.println("PLease insert number of absent days : ");
        int abdays = input.nextInt();
        if (age >= 21 && age <= 30){
            salary = (days * 300) - (abdays * 50);
        }else if (age >= 31 && age <= 40){
            salary = (days * 500) - (abdays * 50);
        }else if (age >= 41 && age <= 50){
            salary = (days * 1000) - (abdays * 25);
        }else if (age >= 51 && age <= 60){
            salary = (days * 3000);
        }
        
        System.out.println("Please insert your body weight : ");
        double weight = input.nextDouble();
        if (weight >= 10 && weight <= 60){
            double newSalary = salary + 5000;
            System.out.println("Hi, " + name);
            System.out.println("Your salary is " + salary + " Baht");
            System.out.println("Your salary and bonus is " + newSalary + " Baht");
        }else if (weight >= 60 && weight <= 90){
            double newSalary = salary + (5000 - ((weight - 60) * 10 ));
            System.out.println("Hi, " + name);
            System.out.println("Your salary is " + salary + " Baht");
            System.out.println("Your salary and bonus is " + newSalary + " Baht");
        }
    }
}
