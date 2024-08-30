package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//we do everything in the main method
        int writeAnumb = 0;
//this is not the final demo!
        try {
            System.out.println("Please write a number:");
            Scanner sc = new Scanner(System.in);

            writeAnumb = sc.nextInt();
            System.out.println("Numb" + writeAnumb);
        }
        catch (InputMismatchException e){
            System.out.println("you should write a Number!");
        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}