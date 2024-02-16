/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sorah
 */
import java.util.*;
public class line {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a number : ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            if (i % 5 == 0){
                System.out.print("/");
            }else{
                System.out.print("|");
            }
        } 
    }
   
}
