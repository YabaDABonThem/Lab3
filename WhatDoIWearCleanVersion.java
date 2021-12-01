// Yabadaba
// 10/20/21
// A program that tells you what to wear based on the temperature outside. 

import java.util.Scanner;

public class WhatDoIWearCleanVersion{

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
      
      // Create strings to store what clothes and accessories to wear
      String clothes, accessories;
      
      // Choose what do wear based off the outside temperature
      if (tempOutsideF > 70)
         clothes = "shorts and shirt";
         
      else if (tempOutsideF > 70)
         clothes = "boots, pants, sweater, and gloves";
         
      else
         clothes = "long-sleeve shirt, pants, and shoes";
               
      // Choose what accessories to bring based off whether it is raining or not
      switch (raining) {
         case 0:
            accessories = "sunglasses";
         default:
            accessories = "umbrella";        
      }
      
      System.out.println("Wear " + clothes + ", and bring " + accessories);   
      
   }
}