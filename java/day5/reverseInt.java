package day5;

import java.util.Scanner;

public class reverseInt {
   public static void main(String[] args) {
       System.out.println("Enter Number to get reverse of it ");
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int rem,rev=0;
       while(n!=0){
           rem = n % 10;
           rev = rev * 10 + rem ;
           n = n/10;
       }
       System.out.println("Reversed Number is "+rev);
   } 
}
