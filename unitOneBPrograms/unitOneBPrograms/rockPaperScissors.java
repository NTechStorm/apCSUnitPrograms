import java.util.Scanner;

public class rockPaperScissors
{
    public static void main(String args[]) {
        while (true) {
            String rock_str = "1";
            String paper_str = "2";
            String scissors_str = "3";
            
            int rock_int = 1;
            int paper_int = 2;
            int scissors_int = 3;
            
            int compChoice = (int)(Math.random()*3) + 1;
            System.out.println("Rock (1), Paper (2), Scissors (3): ");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            
            if (choice.equals(rock_str)) {
                if (compChoice == rock_int) {
                    System.out.println("The computer was rock, so you tied! Please go again!");
                } else if (compChoice == paper_int) {
                    System.out.println("The computer was paper, so you lost! Please go again!");
                } else if (compChoice == scissors_int) {
                    System.out.println("The computer was scissors, so you won! Please go again!");
                }
            } else if (choice.equals(paper_str)) {
                if (compChoice == rock_int) {
                    System.out.println("The computer was rock, so you won! Please go again!");
                } else if (compChoice == paper_int) {
                    System.out.println("The computer was paper, so you tied! Please go again!");
                } else if (compChoice == scissors_int) {
                    System.out.println("The computer was scissors, so you lost! Please go again!");
                }
            } else if (choice.equals(scissors_str)) {
                if (compChoice == rock_int) {
                    System.out.println("The computer was rock, so you lost! Please go again!");
                } else if (compChoice == paper_int) {
                    System.out.println("The computer was paper, so you won! Please go again!");
                } else if (compChoice == scissors_int) {
                    System.out.println("The computer was scissors, so you tied! Please go again!");
                }
            } else {
                System.out.println("We didn't understand your input, please try again.");
            }
        }
    }
}
