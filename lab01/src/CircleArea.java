import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double radius = input.nextDouble();
        double result = radius * Math.PI;
        System.out.println(result);
    }
}
