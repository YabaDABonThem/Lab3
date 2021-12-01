// Allen Bao
// 10/20/21
// A program that tells you what to wear based on the temperature outside. 


public class WhatDoIWear{

   public static void main(String[] args) {
   
      // The variable the represents the temperature outside
      double tempOutsideF = 34;
      
      // Choose what do wear based off the aforementioned variable
      if (tempOutsideF < 32)
         System.out.println("Wear boots, pants, sweater, and gloves.");
         
      if (tempOutsideF > 32)
         System.out.println("Wear sandals, shorts, and a t-shirt, no gloves.");
   }
}