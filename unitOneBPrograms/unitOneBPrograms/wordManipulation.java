import java.util.Scanner;

public class wordManipulation
{
    public static void main(String[] args)
    {
        Scanner scanWord = new Scanner(System.in);
        System.out.println("Enter a word with three or more letters: ");
        String word = scanWord.nextLine();
        scanWord.close();
        
        int length = word.length() - 1;
        if (length < 3) {
            System.out.println("Listen to instructions mate, three or more letters");
        } else {
            String wordWithoutFirstAndLastLetter = word;
            String wordWithoutAs = word;
            String wordBackwards = word;
            
            int i = 0;
            while (wordWithoutAs.indexOf("a") >= 0) {
                i = wordWithoutAs.indexOf("a");
                String firstPart = wordWithoutAs.substring(0, i);
                String secondPart = wordWithoutAs.substring(i + 1);
                wordWithoutAs = firstPart + secondPart;
            }
            System.out.println(word + " without a's: " + wordWithoutAs);

            String reversedWord = "";
            for (int m = wordBackwards.length() - 1; m >= 0; m--) {
                String ithLetter = wordBackwards.substring(m, m + 1);
                reversedWord = reversedWord + ithLetter;
            }
            
            if (wordWithoutFirstAndLastLetter.length() >= 2) {
                String result = wordWithoutFirstAndLastLetter.substring(1, wordWithoutFirstAndLastLetter.length() - 1);
                System.out.println("Word without first and last letter: " + result);
            }
            
            System.out.println(word + " reversed is " + reversedWord);
        }
    }
}
