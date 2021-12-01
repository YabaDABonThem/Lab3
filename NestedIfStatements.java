// Allen Bao
// 10/20/21
// A program that tells you what to wear based on the temperature outside. 

import java.util.Scanner;

public class NestedIfStatements{

   public static void main(String[] args) {
   
      // Declare the variable the represents the temperature and weather outside
      double tempOutsideF;
      int raining;
      
      // Create new scanner to collect user input
      Scanner keyboard = new Scanner(System.in);

      // Ask the user what the temperature outside is and store it in tempOutsideF
      System.out.print("What's the temperature outside? ");
      tempOutsideF = keyboard.nextDouble();
      
      // Ask the user whether it is raining or not
      System.out.print("Is it raining today? (enter 1 for yes, 0 for no) ");
      raining = keyboard.nextInt();
      
      
      // Choose what do wear based off the aforementioned variable
      // For temps higher than 70
      if (tempOutsideF > 70) {
         // Bring umbrella if it is raining, and sunglasses if it isn't. 
         if (raining == 1)
            System.out.println("Wear shorts and shirt, and bring umbrella.");
         else
            System.out.println("Wear shorts and shirt, and bring sunglasses.");
      }   
      // For temps lower than 30
      else if (tempOutsideF < 30) {
         if (raining == 1)
            System.out.println("Wear boots, pants, sweater, and gloves, and bring umbrella.");
         else
            System.out.println("Wear boots, pants, sweater, and gloves, and bring sunglasses.");            
      }
      // Default
      else {
         if (raining == 1)
            System.out.println("Wear long-sleeve shirt, pants, and shoes, and bring umbrella.");
         else
            System.out.println("Wear long-sleeve shirt, pants, and shoes, and bring sunglasses.");
      }
      
      
   }
}