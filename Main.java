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
      // It was a HOT day in the summer. A boy WALKED to the beach for a NICE day out. While on the BOARDWALK he got bit by a CRAB. He screamed AHHH so loud everyone nearby heard him. The LIFEGUARD on duty rushed up to the boy to CHECK on his injuries. He wen't to the nearest HOSPITAL and fortunately he was totally FINE.
      System.out.println("Type an Adjective");
      String adj1 = input.nextLine();
      System.out.println("Type a Verb");
      String verb1 = input.nextLine();
      System.out.println("Type an Adjective");
      String adj2 = input.nextLine();
      System.out.println("Type a Noun");
      String noun1 = input.nextLine();
      System.out.println("Type a Noun");
      String noun2 = input.nextLine();
      System.out.println("Type a Verb");
      String verb2 = input.nextLine();
      System.out.println("Type a Noun");
      String noun3 = input.nextLine();
      System.out.println("Type a Verb");
      String verb3 = input.nextLine();
      System.out.println("Type a Noun");
      String noun4 = input.nextLine();
      System.out.println("Type an Adjective");
      String adj3 = input.nextLine();
      

      // Print your story line by line
      System.out.println(" It was a " + adj1 + " day in summer."); 
      System.out.println(" A boy " + verb1 + " to the beach for a " + adj2 + " day out."); 
      System.out.print(" While on the " + noun1 + " he got bit by a " + noun2);
      System.out.print(". He screamed " + verb2 + " so loud everyone nearby heard him. ");
      System.out.print(" The " + noun3 + " on duty rushed up to the boy to " + verb3 + " on his injuries.");
      System.out.print(" He wen't to the nearest " + noun4 + " and fortunately he was totally " + adj3);
      
   }
}