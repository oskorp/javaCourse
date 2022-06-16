package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputType1 {
    //taking input using bufferReader class 
   public static void main(String[] args) throws IOException{
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter Your name: ");
       String name = input.readLine();//it reads strings
       System.out.println("The Entered Name is "+ name);
       int age = Integer.parseInt(input.readLine());//it converts strings to integers
       System.out.println("Enter Your age: ");
       System.out.println("The Entered age is : "+age);



   } 
}
