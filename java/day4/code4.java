package day4;

import java.util.Scanner;
// Sum of N natrual number using for loop
public class code4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to get sum :");
        int number = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=number;i++){
            sum = sum + i;

        }
        System.out.println("the sum of N natrual no is "+sum);
    }
}
