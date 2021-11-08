
/**
 * Write a program to calculate total daily energy expenditure
 *
 * @author Ella Clemons
 * @version November 8th, 2021
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        double BMR;
        String gender;
        String activityLevel;
        double activityFactor;
        
        System.out.print("Please enter your name: ");
        name = in.nextLine();
        System.out.print("Please enter your BMR: ");
        BMR = in.nextDouble();
        System.out.print("Please enter your gender (M/F): ");
        gender = in.next().toUpperCase();
        System.out.println("\n");
        
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println("");
        System.out.println("Enter the letter corresponding to your activity level: ");
        activityLevel = in.next().toUpperCase();
        
        if (gender.equals("M") && activityLevel.equals("A")) {
            activityFactor = 1.0;
        } else if (gender.equals("M") && activityLevel.equals("B")) {
            activityFactor = 1.3;
        } else if (gender.equals("M") && activityLevel.equals("C")) {
            activityFactor = 1.6;
        } else if (gender.equals("M") && activityLevel.equals("D")) {
            activityFactor = 1.7;
        } else if (gender.equals("M") && activityLevel.equals("E")) {
            activityFactor = 2.1;
        } else if (gender.equals("M") && activityLevel.equals("F")) {
            activityFactor = 2.4;
        } else if (gender.equals("F") && activityLevel.equals("A")) {
            activityFactor = 1.0;
        } else if (gender.equals("F") && activityLevel.equals("B")) {
            activityFactor = 1.3;
        } else if (gender.equals("F") && activityLevel.equals("C")) {
            activityFactor = 1.5;
        } else if (gender.equals("F") && activityLevel.equals("D")) {
            activityFactor = 1.6;
        } else if (gender.equals("F") && activityLevel.equals("E")) {
            activityFactor = 1.9;
        } else if (gender.equals("F") && activityLevel.equals("F")) {
            activityFactor = 2.2;
        } else {
            System.out.println("Option inputed not valid. Please try again.");
            activityFactor = 0;
            System.exit(1);
        
        }
        
        System.out.println();
        double TDEE = BMR * activityFactor;
        System.out.println("Your results:");
        System.out.println("Name: "+name + "\t\t Gender: "+gender);
        System.out.println("BMR: "+BMR + "\t\t\t Activity Factor: "+activityFactor);
        System.out.println("TDEE: "+TDEE + " calories");
        System.exit(0);
    }
}
