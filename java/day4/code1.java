package day4;
//Simple switch case example
public class code1 {
    public static void main(String[] args) {
        int a = 3;
        switch (a) {
            case 1: {
                System.out.println("The value is One");
                break;
            }
            case 2: {
                System.out.println("The value is two");
                break;
            }
            case 3: {
                System.out.println("The value is three");
                break;
            }

            default:{
                System.out.println("The value is Unknown");

            }
        }
    }
}
