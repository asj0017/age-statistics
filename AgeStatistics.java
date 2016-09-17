import java.util.Scanner;

/**
 * Displays the user's name, age, gender, and statistics
 * based on his/her age.
 *
 * @author Amber Jackson
 * @version 01-25-2016
 */

public class AgeStatistics {
  /**
   * Prints to std output.
   *
   * @param args Command line arguments (not used).
   */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompts the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompts the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompts the user for their gender:
      System.out.print("Enter your gender (1 for female, 0 for male): ");
      gender = userInput.nextInt();
      
      //Displays age:
      System.out.println("\tYour age in minutes is "
           + ageInYears * 525600 + " minutes.");
         
      System.out.println("\tYour age in centuries is "
           + (double) ageInYears / 100 + " centuries.");
      
      //Displays heart rate:
      System.out.print("Your max heart rate is ");
      if (gender == 1) {
      //Calculates MHR for females:
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
        
      else {
      //Calculates MHR for males:
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      
      System.out.println(maxHeartRate + " beats per minute.");
   }
}
