import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Enter three numbers separated by an enter: ");
        int[] numberArray = new int[3];
        numberArray[0] = scanNumber.nextInt();
        numberArray[1] = scanNumber.nextInt();
        numberArray[2] = scanNumber.nextInt();

        int[] numberSorted = new int[3];

        if (numberArray[0] <= numberArray[1] && numberArray[1] <= numberArray[2]) {
            numberSorted[0] = numberArray[0];
            numberSorted[1] = numberArray[1];
            numberSorted[2] = numberArray[2];
        } else if (numberArray[0] <= numberArray[2] && numberArray[2] <= numberArray[1]) {
            numberSorted[0] = numberArray[0];
            numberSorted[1] = numberArray[2];
            numberSorted[2] = numberArray[1];
        } else if (numberArray[1] <= numberArray[0] && numberArray[0] <= numberArray[2]) {
            numberSorted[0] = numberArray[1];
            numberSorted[1] = numberArray[0];
            numberSorted[2] = numberArray[2];
        } else if (numberArray[1] <= numberArray[2] && numberArray[2] <= numberArray[0]) {
            numberSorted[0] = numberArray[1];
            numberSorted[1] = numberArray[2];
            numberSorted[2] = numberArray[0];
        } else if (numberArray[2] <= numberArray[0] && numberArray[0] <= numberArray[1]) {
            numberSorted[0] = numberArray[2];
            numberSorted[1] = numberArray[0];
            numberSorted[2] = numberArray[1];
        } else {
            numberSorted[0] = numberArray[2];
            numberSorted[1] = numberArray[1];
            numberSorted[2] = numberArray[0];
        }

        System.out.println("The integers from least to greatest are: " + numberSorted[0] + ", " + numberSorted[1] + ", " + numberSorted[2]);

        scanNumber.close();
    }
}
