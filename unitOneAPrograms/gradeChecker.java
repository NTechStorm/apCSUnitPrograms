import java.util.Scanner;

public class gradeChecker
{
    public static void main(String args[]) {
        Scanner scanGrade = new Scanner(System.in);
        System.out.print("Enter your grade (ex - 92): ");
        int score = scanGrade.nextInt();
        
        if (score >= 90) {
            System.out.println("You got an A!");
        } else if (score >= 80) {
            System.out.println("You got an B");
        } else if (score >= 70) {
            System.out.println("You got an C");
        } else if (score >= 60) {
            System.out.println("You got an D");
        } else if (score < 60) {
            System.out.println("Your grade was unsatisfactory.");            
        }
    }   
}
