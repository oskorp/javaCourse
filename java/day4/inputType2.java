package day4;

import java.util.Scanner;

public class inputType2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your school name :");
        String schoolName = input.nextLine();
        System.out.println("Enter your Roll No :");
        int rollNo = input.nextInt();
        System.out.println("Enter your Percentage of 10th :");
        float percentage = input.nextFloat();

        System.out.println("Your school name is : " + schoolName + '\n'
                + "Your Roll Number is : " + rollNo + '\n' + "YOur percentage is : " + percentage);

    }
}
