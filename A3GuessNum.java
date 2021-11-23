/*
*Name: Rachael McIlwrath
*Date: Tuesday November 23, 2021
*Desription: creating a guess a number game 
*/

import java.util.*;

public A3GuessNum{
  
  
  //main method
  public static void main(String[] arg){
    // Make a scanner and Random Object.
    Scanner input = new Scanner(System.in);
    Random numGenerator = new Random();
    
    // Generate a random number from 0-5.
    int answer = numGenerator.nextInt(6);
    int guess = -1; // default guess num.
    
    System.out.println("Guess a number");
    int guess = input.nextInt();  
    
      
  }// close main
}
/*import java.util.*;

public class Main {

    public static void main(String[] args) {
        // create a scanner and random object
        Scanner input = new Scanner(System.in);
        Random randomNumGenerator = new Random();

        // create a random number between 1 and 20.
        int randomNum = 
        int dieRoll = 0;

        
        // replace the 1 with the random number
        while(dieRoll!=1){
            System.out.println(dieRoll);
            System.out.println("Guess a number");
            dieRoll = input.nextInt();
            // dieRoll = randomNumGenerator.nextInt(20)+1;
        }

        
    }

}
*/