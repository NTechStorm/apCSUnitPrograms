import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanWeightAndHeight = new Scanner(System.in);

        System.out.println("Enter your height in inches (ex - 72): ");
        int height = scanWeightAndHeight.nextInt();

        System.out.println("Enter your weight in pounds (ex - 140): ");
        int weight = scanWeightAndHeight.nextInt();

        double weightKilograms = weight * 0.45359237;
        double heightMeters = height * 0.0254;
        double heightSquared = heightMeters * heightMeters;
        double bmiCalculate = weightKilograms / heightSquared;
        int BMI = (int) Math.round(bmiCalculate);

        System.out.print("For a weight of " + weight + " lbs and a height of " + height + " in, the BMI is " + BMI);
    }
}
