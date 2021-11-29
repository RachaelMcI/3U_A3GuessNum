/*
*Name: Rachael McIlwrath
*Date: Tuesday November 23, 2021
*Desription: creating a guess a number game 
*/

import java.util.*;

public class A3GuessNum{
  
  
  //main method
  public static void main(String[] arg){
    // Make a scanner and Random Object.
    Scanner input = new Scanner(System.in);
    Random numGenerator = new Random();
    
    // Generate a random number from 0-5.
    int answer = numGenerator.nextInt(200) + 1;
    int guess = 0; // default guess num.
    int counter = 0; //keeps track of guesses
    // main code
    System.out.println("Would you like to play? Yes/No");
    String playAgain = input.next();
    if (playAgain.equals("yes")||playAgain.equals("Yes")||playAgain.equals("y")){ // could in a loop, see "working towards challenge 3 " commit.
      System.out.println("Guess a number.");
     while(guess != answer && counter <= 4 && input.hasNextInt()){ //while as a specific condition ends it
       guess = input.nextInt();  
       counter++;
       
          //hints that can be moved into a method
         if(guess >= answer+55 || guess<= answer-55){ 
           System.out.println("Hint: You're freezing!");
           System.out.println("Attempts:" + counter);
             }
            else if(guess>=answer+25 ||guess<=answer-25){
              System.out.println("Hint: You're cold.");
              System.out.println("Attempts:" + counter);
               }
           else if(guess>=answer+10 || guess <= answer-10){ 
               System.out.println("Hint: you're warm.");
               System.out.println("Attempts:" + counter);
               }
            else if(guess>=answer+5 || guess <= answer-5){ // a range from the answer
                System.out.println("Hint: Hot, hot, hot!");
                System.out.println("Attempts:" + counter);
             }
      }
      //ENDWHILE
           if(guess == answer){ 
            System.out.println("Congratulations!");
            //can add confettii in the future
           }
          else if(counter > 5){
            System.out.println("No Tries left. You lose, sorry!");
          }
           else{ 
             System.out.println("Input Error!");
            } 
      }
      else if(playAgain.equals("no")||playAgain.equals("No")||playAgain.equals("n")){
          System.out.println("bye.");
         }
      else{
        System.out.println("Invalid Input");
      }
  }// close main
}


// optional:expand on the strings & use playAgain.next(); more 
//could add a keep playing / forefiet 