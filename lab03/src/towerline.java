import java.util.*;
public class towerline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a number : ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            if (i % 5 == 0){
                System.out.println("|");
            }else{
                System.out.print("|");
            }
        } 
    }
   
}
