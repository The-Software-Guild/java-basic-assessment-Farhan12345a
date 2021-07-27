/*
 * FILL OUT WITH CORRECT INFORMATION
 */
package com.fshahbaz.basic_programming_assesment;

/**
 *
 * @author farhanshahbaz
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
            static int roundsTied = 0;
            static int userWins = 0;
            static int computerWins = 0;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean game = true;
        
        while(game){
            
            System.out.println("How many rounds would you like to play? (Range 1 - 10)");
            int rounds = Integer.parseInt(scan.nextLine());

            //Print error message for invalid rounds
            if (rounds < 1 || rounds > 10){
                System.out.println("Error: Invalid round input");
                //Just quit program
                System.exit(0);
            }

            
            String[] arr = {"Rock", "Paper", "Scissors"};

            for(int i = 1; i <= rounds;i++){
                System.out.println("Choose between Rock, Paper, or Scissors: (1 = Rock, 2 = Paper, 3 = Scissors) ");
                int playerChoice = Integer.parseInt(scan.nextLine());
                int computerChoice = rand.nextInt(3);
                System.out.println("Computer Chose: " + arr[computerChoice]);
                
                //Put in method
                roundDetermine(playerChoice,computerChoice);
                //Handling a tie
//                if(((playerChoice == 1) && (computerChoice == 0)) || ((playerChoice == 2) && (computerChoice == 1)) || ((playerChoice == 3) && (computerChoice == 2))){
//                    System.out.println("Tie");
//                    roundsTied++;
//
//                    //User Winning
//                }else if((playerChoice == 1) && (computerChoice == 2) || (playerChoice == 2) && (computerChoice == 0) || (playerChoice == 3) && (computerChoice == 1) ){
//                    System.out.println("User Wins!");
//                    userWins++;
//                    //Computer Winning
//                    //See if this can be a simple else statement
//                }else if((playerChoice == 3) && (computerChoice == 0) || (playerChoice == 1) && (computerChoice == 1) || (playerChoice == 2) && (computerChoice == 2)) {
//                    System.out.println("Computer Wins!");
//                    computerWins++;
//                }
                
                System.out.println();
        }
            
            
            
            //Printing out User Wins, Computer Wins, and Ties
            System.out.println("Number of Ties: " + roundsTied + 
                    "\nNumber of User Wins: " + userWins +
                    "\nNumber of Computer Wins: " + computerWins);

            //Determing Overall Winner
            roundWinner();
            
            //Asking user if they want to play again
            System.out.println("Would you like to play again?");
            String input = scan.nextLine();
            
            if(input.equals("Yes".toLowerCase())){
                System.out.println("Starting Rock,Paper,Scissors Again ... ");
                //Resting round winner values to original
                roundsTied = 0;
                userWins = 0;
                computerWins = 0;
            }else if(input.equals("No".toLowerCase())){
                System.out.println("Thanks for Playing!");
                //Exiting while loop
                game = false;
            }else{
                //Exiting while loop because of invalid input
                System.out.print("Invalid Entry. Exiting Program...");
                game = false;
            }
        }
    
    }
    
    public static void roundWinner(){
        if(userWins > computerWins){
                System.out.println("User is the overall Winner");
            }else if(userWins < computerWins){
                System.out.println("Computer is the overall Winner");
            }else{
                System.out.println("There was a tie!");
            }
        
    }
    
    public static void roundDetermine(int playerChoice, int computerChoice){
        if(((playerChoice == 1) && (computerChoice == 0)) || ((playerChoice == 2) && (computerChoice == 1)) || ((playerChoice == 3) && (computerChoice == 2))){
                    System.out.println("Tie");
                    roundsTied++;

                    //User Winning
                }else if((playerChoice == 1) && (computerChoice == 2) || (playerChoice == 2) && (computerChoice == 0) || (playerChoice == 3) && (computerChoice == 1) ){
                    System.out.println("User Wins!");
                    userWins++;
                    //Computer Winning
                    //See if this can be a simple else statement
                }else {
                    System.out.println("Computer Wins!");
                    computerWins++;
                }
        
    }
}
