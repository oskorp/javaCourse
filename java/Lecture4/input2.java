package Lecture4;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        
        System.out.println("Enter your school name ");
        String schoolName = name.nextLine();

        System.out.println("Enter your  class ");
        int classNo = name.nextInt();

        System.out.println("Enter your percentage ");
        float percentage = name.nextFloat();

        System.out.println("Your school name is " + schoolName );
        System.out.println("Your classNo is  " + classNo );
        System.out.println("Your percentage  is " + percentage );

        char valur = name.next().charAt(7);
        System.out.println("Your school name is " + valur);


    }

}
