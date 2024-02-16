import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your money : ");
        double money = input.nextDouble();
        System.out.println("Input your account type(Please type A B C or X in uppercase) : ");
        char account = input.next().charAt(0);
        switch (account){
            case 'A':{
                double result = money + (money * 0.015);
                System.out.println("Your total money in one year = " + result);
                break;
            }
            case 'B':{
                double result = money + (money * 0.02);
                System.out.println("Your total money in one year = " + result);
                break;
            }
            case 'C':{
                double result = money + (money * 0.015);
                System.out.println("Your total money in one year = " + result);
                break;
            }
            case 'X':{
                double result = money + (money * 0.05);
                System.out.println("Your total money in one year = " + result);
                break;
            }
        }   
    }
}

