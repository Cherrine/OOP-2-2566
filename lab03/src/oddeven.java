import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        
        int number = input.nextInt();
        
        while (number != -1){
            if (number % 2 == 0){
                even++;
            }else{
                odd++;
            }
            number = input.nextInt();
        }
        System.out.print("Odd number = " + odd + " and Even number = " + even);
        
    }
}
