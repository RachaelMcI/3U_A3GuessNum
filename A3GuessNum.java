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
    boolean inputValid = true;
    System.out.println("Would you like to play? Yes/No");
    String playAgain = input.next();
    while(playAgain.equals("yes")||playAgain.equals("Yes")||playAgain.equals("y") && inputValid == true){
    // Generate a random number from 0-5.
    int answer = numGenerator.nextInt(200) + 1;
    int guess = 0; // default guess num.
    int counter = 0;
    // main code
     // could be in the wrong area, or changed into a while    loop
      System.out.println("Guess a number between 1 and 200.");
     while(guess != answer && counter <= 4 && input.hasNextInt()){ //while as a specific condition ends it
       guess = input.nextInt();  
       counter++;
       
          //hints that can be moved into a method
         if(guess >= answer+55 || guess<= answer-55){ // is there a more effective way of doing this
           System.out.println("Hint: You're freezing!");
           System.out.println("Attempts:" + counter);
             }
            else if(guess>=answer+25 ||guess<=answer-25){
              System.out.println("Hint: You're cold.");
              System.out.println("Attempts:" + counter);
               }
           else if(guess>=answer+10 || guess <= answer-10){ // should be 10 from the answer --> answer-10
               System.out.println("Hint: you're warm.");
               System.out.println("Attempts:" + counter);
               }
            else if(guess>=answer+5 || guess <= answer-5){ // should be 10 from the answer        --> answer+5
                System.out.println("Hint: Hot, hot, hot!");
                System.out.println("Attempts:" + counter);
             }
      }
      //ENDWHILE
         if(guess == answer){ //maybe change to attemptCount(er)
            System.out.println("Congratulations!");
            System.out.println("Would you like to play again? Yes/No");
            input.next();
            //you guessed in ___ tries
          }
          else if(counter >= 5){
            System.out.println("No Tries left. You lose, sorry!");
            System.out.println("Would you like to play again? Yes/No");
            input.next();
          }
           else{ //could make a seperate string method for confetti
             System.out.println("Input Error!");
             System.out.println("Would you like to play again? Yes/No");
             input.next();
            } 
  
      }
       if(playAgain.equals("no")||playAgain.equals("No")||playAgain.equals("n")){
          System.out.println("bye.");
           inputValid = true;
         }
      else{
        System.out.println("Invalid Input");
            inputValid = false;
      }
  }// close main
}
/*public class Main {

    public static void main(String[] args) {
        // how to create a scanner
     Scanner input = new Scanner(System.in);   
     //random object creator 
     Random randomNumGenerator = new Random();
     //set between 1 & 20
    int randomNum = randomNumGenerator.nextInt(20) + 1;
    int guessNum = 0;
    
    while(guessNum != randomNum){
        System.out.println(guessNum);
        System.out.println("Guess a number");
        guessNum = input.nextInt();

        }
    }
}
*/

// remember to include to display counter of how many tries are left
// remember to include a check for any incorrect inputs, should have something on chromebook.
//could add a keep playing? / forefiet? 
//arra

//}
/*public class Main {

    public static void main(String[] args) {
        // how to create a scanner
     Scanner input = new Scanner(System.in);   
     //random object creator 
     Random randomNumGenerator = new Random();
     //set between 1 & 20
    int randomNum = randomNumGenerator.nextInt(20) + 1;
    int guessNum = 0;
    
    while(guessNum != randomNum){
        System.out.println(guessNum);
        System.out.println("Guess a number");
        guessNum = input.nextInt();

        }
    }
}
*/

// remember to include to display counter of how many tries are left
// remember to include a check for any incorrect inputs, should have something on chromebook.
//could add a keep playing? / forefiet? 
//arra

/* can restore to yesterday, would need to change while statement & comment out array  else if(playAgain.equals("no")||playAgain.equals("No")||playAgain.equals("n")){
          System.out.println("bye.");
         }
       else{
        System.out.println("Invalid Input");
        } */