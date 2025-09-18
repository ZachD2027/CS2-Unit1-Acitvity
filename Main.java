// 1. IMPORT Scanner CLASS
import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      System.out.println("Let's play MadLibs!");

      // 2. Set up a Scanner OBJECT
      Scanner input = new Scanner(System.in);
      // System.in refers to the physical keyboard!

      // 3. Use the Scanner to take input
      System.out.println("Type your name then press enter: ");
      String player = input.nextLine();
      System.out.println("Welcome, " + player);

      // Create variables for each placeholder word
      // It was a HOT day in the summer. A boy WALKED to the beach for a NICE day out. While on the BOARDWALK he got bit by a CRAB. He screamed AHHH so loud everyone nearby heard him.
      String adj1 = "hot";
      String verb1 = "walked";
      String adj2 = "nice";
      String noun = "boardwalk";
      String noun = "crab";
      String 
      // Print your story line by line
      System.out.println("It was a " + adj1 + "day in summer"); 
      System.out.println("A boy " + verb1 + "to the beach for a " + adj2 + "nice day out."); 
   

   }
}
