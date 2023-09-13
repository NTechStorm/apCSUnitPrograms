import java.util.Scanner;

public class numberOddEvenChecker
{
    public static void main(String args[]) {
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = scanNumber.nextInt();
        scanNumber.close();
        
        int checkNum = number % 2;
        if (checkNum == 1) {
            System.out.println ("The number " + number +" is a odd number");
        } else {
            System.out.println ("The number " + number +" is a even number");
        }
    }   
}
