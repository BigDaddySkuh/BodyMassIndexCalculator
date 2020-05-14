package bmicalculator;

import java.util.Scanner;

/**
 * This Class Calculates Body Mass Index
 *
 * @author Mark Carreira
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Get user input and welcome
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the BMI Calculator!");

        System.out.println("Please enter your weight in pounds");
        double weight = input.nextDouble();

        System.out.println("Please enter your height in inches");
        double height = input.nextDouble();

        //Calculate BMI
        double kilosPerPound = 0.45359237;
        double metersPerInch = 0.0254;

        double weightInKilos = weight * kilosPerPound;
        double heightInMetres = height * metersPerInch;

        double bmi = weightInKilos / (heightInMetres * heightInMetres);

        //Display results
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Your bmi places you in the underweight category");
        } else if (bmi < 25) {
            System.out.println("Your bmi places you in the normal weight category");
        } else if (bmi < 30) {
            System.out.println("Your bmi places you in the overweight category");
        } else {
            System.out.println("Your bmi places you in the obese category");
        }
    }

}
