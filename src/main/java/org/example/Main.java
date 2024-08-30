package org.example;

public class Main {
    public static void main(String[] args) {
//we do everything in the main method
        //A string variable

        //a number variable

        //TODO: input during the demo
        //I have done some OOP magic
       try {
          NumernicError();
          StringError();
        }  catch ( StringIndexOutOfBoundsException e) {
           System.out.println("\n" + e.getMessage());
       } catch (NumberFormatException e) {
           System.out.println("\n" + e.getMessage());
       };
        //TODO: here we will create a try catch
    }

    public static void NumernicError(){
        int aNumber = 88;
        for (int i = 0; i < 100; i++) {
            aNumber += -1;
            System.out.print(aNumber + " ");
            if (aNumber <= 0) throw new NumberFormatException("too low numbers y'all");

        }
    }
public static void StringError(){
    String aString = "hallo";
    aString = "";
    if(aString.isBlank()){throw new StringIndexOutOfBoundsException("empty string");}
}
}