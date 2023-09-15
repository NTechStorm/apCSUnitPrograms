import java.util.Scanner;

public class mathQuiz
{
    public static void main(String args[]) {
        Scanner scanAnswer = new Scanner(System.in);
        int numberOne = (int) (Math.random() * 20) + 1;
        int numberTwo = (int) (Math.random() * 20) + 1;
        int correctAnswer = numberOne + numberTwo;
        
        System.out.println("");
        System.out.println("What is the answer of "+ numberOne +"+"+ numberTwo +"?");
        int answer = scanAnswer.nextInt();
        
        if (answer == correctAnswer) {
            System.out.println("You are correct!");
            System.out.println(""+ numberOne +" + " + numberTwo +" is equal to " + correctAnswer);
        } else if (answer != correctAnswer) {
            System.out.println("Sorry, you are incorrect.");
            System.out.println(""+ numberOne +" + " + numberTwo +" is equal to " + correctAnswer);
        }
        System.out.println("");
    }   
}
