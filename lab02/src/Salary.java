import java.util.*;
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        if (x > 50000){
            double result = x*0.1;
            System.out.println(result);
        }else{
            double result = x*0.05;
            System.out.println(result);
        }
    }
}
