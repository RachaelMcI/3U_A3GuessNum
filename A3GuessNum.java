/*
*Name: Rachael McIlwrath
*Date: Tuesday November 23, 2021
*Desription: creating a guess a number game 
*/

import java.util.*;

public class A3GuessNum{
  int answer = numGenerator.nextInt(200) + 1;
  int guess = 0; // default guess num.
  int counter = 0;

  Random numGenerator = new Random();
  boolean entryValid = true;

  // method goes here
  //could return the counter & num while printing out the statements & having the constructer be those aswell.
  //main method
 public void hints(int guess, int counter, int answer){
     //hints that can be moved into a method
         if(guess >= answer+55 || guess<= answer-55){ 
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
  public static void main(String[] arg){
    // Make a scanner and Random Object.
      Scanner input = new Scanner(System.in);

    System.out.println("Would you like to play? Yes/No");
    playAgain = input.next();
      while(playAgain.equals("yes")||playAgain.equals("Yes")||playAgain.equals("y") && inputValid == true){
    // Generate a random number from 0-5.
      
    // main code
     // could be in the wrong area, or changed into a while    loop
     System.out.println("Guess a number between 1 and 200.");
     while(guess != answer && counter <= 4 && input.hasNextInt() && inputValid == true){ //while as a specific condition ends it
       guess = input.nextInt();  
       counter++;
       A3GuessNum hints = new A3GuessNum();
       System.out.println("the answer is" + A3GuessNum.hints);

      }
      //ENDWHILE
         if(guess == answer){ //maybe change to attemptCount(er)
            System.out.println("Congratulations!");
            System.out.println("Would you like to play again? Yes/No");
             playAgainA = input.next();
             if(playAgainA.equals("no")||playAgainA.equals("No")||playAgainA.equals("n")){
             entryValid = false;
             System.out.println("Bye, ");
            } 
              else{
               entryValid = true;
               input.next();

               }
            //you guessed in ___ tries
           }
             else if (counter >= 5){
             System.out.println("No Tries left. You lose, sorry! The number was " + answer + ".");
             System.out.println("Would you like to play again? Yes/No");
              playAgainB = input.next();
               if(playAgainB.equals("no")||playAgainB.equals("No")||playAgainB.equals("n")){
               System.out.print("Bye, ");            
                  enrtyValid = false;
               }
                else{ 
                  enrtyValid = true;
                  input.next();

                }
               }
               else{  
                 System.out.println("Input Error!");
                 System.out.println("Would you like to play again? Yes/No");
                  playAgainC = input.next();
                   if(playAgainC.equals("no")||   playAgainC.equals("No")||playAgainC.equals("n")){
                   System.out.print("Bye, ");
                   enrtyValid = false;
                    }
                   else{ 
                     enrtyValid = true;
                      input.next();
                 }
              }
          }
       if(playAgain.equals("no")||playAgain.equals("No")||playAgain.equals("n")){
          System.out.print("Bye.");
           enrtyValid = false;
         }
      else{
        System.out.println("bye.");
          //  inputValid = false;
       }
   // close main
}
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