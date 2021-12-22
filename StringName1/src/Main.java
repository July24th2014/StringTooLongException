import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declare value
        final int MAX = 20;
        String input = "";

        Scanner scan = new Scanner(System.in);

        StringTooLongException lengthException = new StringTooLongException("String has too many characters");
        System.out.println();


//try and catch method
        while(!input.equalsIgnoreCase("done")) {
            try{

                if (input.length() <= MAX)
                {
                    System.out.println("Enter strings, enter DONE when finished:");
                    input = scan.nextLine();
                }
                else
                {
                    throw new StringTooLongException(lengthException.getMessage());
                }
                }
            catch (StringTooLongException e)
                {
                System.out.println("String has too many characters:"+input+"\nPlease try again:\n");
                input = scan.nextLine();
                }
        }
        System.out.println("Program successfully completed");
    }
}
