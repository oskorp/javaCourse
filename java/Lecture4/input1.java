package Lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
//BufferReader Input Class


public class input1 {
    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //reads line
        System.out.println("Enter your Name:");


        String name = input.readLine();
        System.out.println("Enter Your Age");

        int age = Integer.parseInt(input.readLine());
        System.out.println("The Entered Name is "+ name);        

        System.out.println("The Entered age is "+ age);        
    }
}
