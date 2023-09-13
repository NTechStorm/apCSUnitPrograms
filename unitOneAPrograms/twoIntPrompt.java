import java.util.Scanner;

public class twoIntPrompt
{
    public static void main(String args[]) {
        Scanner scanNumberOne = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberOne = scanNumberOne.nextInt();
        scanNumberOne.close();
        
        Scanner scanNumberTwo = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int numberTwo = scanNumberTwo.nextInt();
        scanNumberTwo.close();
        
        if (numberOne > numberTwo) {
            System.out.println("Number One, who's value is "+ numberOne +", is greater than Number Two, who's value is " + numberTwo + ".");
        } else if (numberTwo > numberOne) {
            System.out.println("Number Two, who's value is "+ numberTwo +", is greater than Number One, who's value is " + numberOne + ".");
        } else if (numberTwo == numberOne) {
            System.out.println("Number One, who's value is "+ numberOne +", is equal to Number Two, who's value is " + numberTwo + ".");
        }
    }
}
