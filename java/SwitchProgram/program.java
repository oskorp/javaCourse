package SwitchProgram;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthNo = input.nextInt();
        switch (monthNo) {
            case 1: {
                System.out.println("Jan");
            }
                break;

            case 2: {
                System.out.println("Feb");
            }
                break;

            case 3: {
                System.out.println("Mar");
            }
                break;

            default:
                System.out.println("Enter a wrong number");
                break;
        }
    }
}
