// Allen Bao
// 10/20/21
// A program that tells you what to wear based on the temperature outside. 

import java.util.Scanner;

public class ClothingPickerIfElseIf{

   public static void main(String[] args) {
   
      // Declare the variable the represents the temperature outside
      double tempOutsideF;
      
      // Create new scanner to collect user input
      Scanner s = new Scanner(System.in);

      // Ask the user what the temperature outside is and store it in tempOutsideF
      System.out.print("What's the temperature outside? ");
      tempOutsideF = s.nextDouble();
      
      
      // Choose what do wear based off the aforementioned variable
      if (tempOutsideF > 70) {
         System.out.println("Wear sandals, shorts, and a t-shirt, no gloves.");
      }   
      
      else if (tempOutsideF < 30) {
         System.out.println("Wear boots, pants, sweater, and gloves.");
      }
      
      else {
         System.out.println("Wear long-sleeve shirt, pants, and shoes.");
      }
   }
}