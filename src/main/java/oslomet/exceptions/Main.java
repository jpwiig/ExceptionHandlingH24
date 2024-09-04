package oslomet.exceptions;

import javax.swing.*;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
//we do everything in the main method
        //A string variable

        //a number variable
/*
   Use:
   NumernicError() -> throws a NumberFormatException
   StringError() -> Throws a StringIndexOutOfBoundsException
   unnhandledSpecialError() -> Throws a UnhandledExceptionError
   weAreThrowingStuff() -> the
  */
        //TODO: input during the demo
        //I have done some OOP magic
        try {

            //NumernicError(); //The code for theese are implemented in the static methods, if you want to see how they work :D
            //StringError();
            //unhandledSpecialError();
            String input = JOptionPane.showInputDialog("Skriv inn ett Ord: ");
            WeAreThrowingStuff(input); // <-- Vi live koder denne!
            //TODO: DEMO
            //In this demo we will create a new static method that throws a exception when somthing wierd happends
        } catch (StringIndexOutOfBoundsException e) {

            //TODO: in the demo we will explore different ways to print out the Error message
            System.out.println("\n" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("\nTall Feilmelding!");
            System.out.println("\n" + e.getMessage());
        } catch (UnsupportedOperationException unnsupported_err) {
            System.out.println("\n" + unnsupported_err.getMessage());

        } catch (NullPointerException feil) {
            System.out.println(feil.getMessage());
        }
        ;
        //TODO: here we will create a try catch
    }

    public static void NumernicError() {
        int aNumber = 88;
        for (int i = 0; i < 101; i++) {
            aNumber += -1;
            System.out.print(aNumber + " ");
            if (aNumber <= 0) throw new NumberFormatException("For lite tall!");

        }
    }

    public static void StringError() {
        String aString = "hallo";
        aString = "";
        if (aString.isBlank()) {
            throw new StringIndexOutOfBoundsException("empty string");
        }
    }

    public static void unhandledSpecialError() {
        boolean aBoolean = true;
        aBoolean = false;
        if (!aBoolean) {
            throw new UnsupportedOperationException("!false, its funny because its true");
        }
    }

    public static void WeAreThrowingStuff(String in) {
        String arr[] = {"OsloMet", "Java", "Norge", "Pizza"};
        //we will check if the word are inside the array and if it is not we will throw the error away
        //Exception types:https://www.geeksforgeeks.org/exceptions-in-java/
        //first: We will loop through the array, if you dont know what is happending, dont worry, youll know soon
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(in) ) {
                JOptionPane.showMessageDialog(null, MessageFormat.format("Ordet {0} er i listen!", in));
            } else {
                System.out.println("Not in LIST!");
                throw new NullPointerException("Ordet er ikke listen :(");
            }
        }
        // throw new UnsupportedOperationException("Not implemented yet!");
    }
}