package Adv_8;

public class handleException {


    public static void main(String[] args) {


        //try block
        try {
            System.out.println("::Try Block::");
            int data = 135 / 3;
            System.out.println("Result = " + data);
        }


        // multi- catch block

        catch (NullPointerException e) {
            System.out.println("::Catch Block::");
            System.out.println("exception message " +e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception :: Divide by zero!!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");
        }
        catch (Exception e) {
            System.out.println("Exception :: " + e.getMessage());

        }


        //finally block

        finally {
            System.out.println(":: Finally Block::");
            System.out.println("No Exception::finally block executed");
        }
        System.out.println("rest of the code...");
    }
}



