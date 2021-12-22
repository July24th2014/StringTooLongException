import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws StringTooLongException {
	// declare value
        final int MAX = 20;
        String input ="";

        Scanner scan = new Scanner(System.in);

        StringTooLongException lengthException = new StringTooLongException("String has too many characters");
        System.out.println("Enter strings, enter DONE when finished:");

//while
        while(!input.equalsIgnoreCase("done")){
            if(input.length() > MAX) {
                throw new StringTooLongException(lengthException.getMessage());
            }
            System.out.println("\n Enter a string, enter DONE when finished:\n");
            input = scan.nextLine();
        }
        System.out.println("Program successfully completed");
    }
}
