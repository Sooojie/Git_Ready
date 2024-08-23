import java.util.Scanner;

public class project {
    // This is a program that ask the user for their weight and height
    // and uses them to calculate the BMI
    public static void main(String[] args) {
        // initializing scanner 
        Scanner scnr = new Scanner(System.in);
        // initializing the variables

        double weight;
        double height;
        double BMI;

        // print question and get answers
        System.out.println("What is your weight (pounds) and height (inches)?");
        weight = scnr.nextDouble();
        height = scnr.nextDouble();

        // Calculate BMI
        BMI = (weight*500) / Math.pow(height, 2);
        

        // Print their BMI
        System.out.println("Your BMI is not " + BMI + " percent ");
    }
}