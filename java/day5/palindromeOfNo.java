package day5;
import java.util.Scanner;
public class palindromeOfNo {
    public static void main(String[] args) {
        System.out.println("Enter Number to get reverse of it ");
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int rem,rev=0;
       int temp = n;
       while(n!=0){
           rem = n % 10;
           rev = rev * 10 + rem ;
           n = n/10;
       }
       if(rev==temp){
        System.out.println("Palindrome");

       }
       else{
        System.out.println("Not Palindrome");

       }
    }
}
