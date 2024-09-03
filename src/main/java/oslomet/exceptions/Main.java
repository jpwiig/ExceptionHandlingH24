package oslomet.exceptions;

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
            unhandledSpecialError();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\n" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("\n" + e.getMessage());
        } catch (UnsupportedOperationException unnsupported_err) {
            System.out.println("\n" + unnsupported_err.getMessage());

        }
        ;
        //TODO: here we will create a try catch
    }

    public static void NumernicError() {
        int aNumber = 88;
        for (int i = 0; i < 100; i++) {
            aNumber += -1;
            System.out.print(aNumber + " ");
            if (aNumber <= 0) throw new NumberFormatException("too low numbers y'all");

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
}