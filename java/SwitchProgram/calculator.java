package SwitchProgram;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("Select No for operation"+'\n'+"1)Addition"+'\n'+"2)Substration"+'\n'+"3)Multiplication"+'\n'+"4)Division");
        int operation = input.nextInt();
        switch (operation) {
            case 1:
            System.out.println("The Answer of Additon:"+(number1+number2));
            break;

                case 2:
                System.out.println("The Answer of Subtraction:"+(number1-number2));

                break;
                case 3:
                System.out.println("The Answer of Multiplication:"+(number1*number2));

                break;

                case 4:
                System.out.println("The Answer of Division:"+(number1/number2));

                break;
        
            default:
                break;
        }

    }
}
