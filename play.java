/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sdassignment2;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Vasanthi
 */
public class play
{
    public static int N;
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Welcome to Tic-Tac-Toe!!!");
            System.out.println();
            

            //creat markers
            String marker1 = "x";
            String marker2 = "o";
            int playAgain;

            Scanner s = new Scanner(System.in);

            do
            {
                //Determining the size of the board
                N = getBoardSizebs();
                
                if(N<=0)
                 {
                     System.out.println("Size of the board must be greater than '0'!"
                             + "\nPlease enter a valis number for size!!");
                     System.exit(N);
                 }
                //run board setup
                set Setup = new set();
            
                Setup.createBoard();
                Setup.printBoard();
       
                System.out.println("\nChoose the level you want to play from the following options"
                        + "\n\t1. Easy\n\t2. Medium\n\t3.Hard"
                        + "\nSelect from (1,2,3) for (Easy, Medium, Hard) levels!!");
                int level = s.nextInt();
                if(level == 1)
                {
                    //create player objects
                    Human human = new Human();
                    Easy computer = new Easy();
                    System.out.println("please choose your marker");
                    System.out.println("type 1 for 'X' or 2 for 'O'");

                    int marker = s.nextInt();
                    //set markers
                    if(marker == 1)
                    {
                        // create player objects
                        System.out.println("You chose cross 'X'");
                        human.setMarker("X");
                        computer.setMarker("O");
                    } 
                    else if(marker == 2)
                    {
                        System.out.println("You chose Knought 'O'");
                        human.setMarker("O");
                        computer.setMarker("X");
                    }
                    else if((marker != 1) && (marker != 2))
                    {
                        System.out.println("Please choose either '1' or '2'!!");
                        System.exit(marker);
                    }
                    // determine who goes first
                    int first = (int) (Math.random() * 2);

                    boolean won = false;
                    int turns = 0;
                
                    if(first == 0)
                    {
                        System.out.println("You got to make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! "
                                    + "\nCongratulations!!! You won the game!!");
                            System.exit(turns);
                        }
                    }
                    else
                    {
                        System.out.println("I make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! "
                                    + "\nYayy!! I won the game!!");
                            System.exit(turns);
                        }
                    }
                
                    if(first == 0)
                    {
                        System.out.println();
                        while(!won)
                        {
                            human.takeTurn(Setup.getBoard());
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("Congrats, you won!");
                            }
                            if(turns == N*N)
                            {
                                won = true;
                                //System.out.println(N*N);
                                System.out.println("Its a bore draw!");
                                break;
                            }
                            if(!won)
                            {
                                computer.takeTurn(Setup.getBoard(), human);
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You just lost a game to an A.I"
                                        + " with an incomplete rule set.\nFACEPALM. :D");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a bore draw!");
                                    break;
                                }
                            }   
                        }  // close while 1
                    }
                    else 
                    {
                        System.out.println();
                        while(!won)
                        {
                            computer.takeTurn(Setup.getBoard(), human);
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("You just lost a game to an A.I "
                                        + "with an incomplete rule set.\nFACEPALM. :D");
                            }
                            
                            //checks if maximum moves are made and declares a draw
                            if(turns == N*N)
                            {
                                won = true;
                                System.out.println("Its a draw!");
                                break;
                            }
                            if(!won)
                            {
                                human.takeTurn(Setup.getBoard());
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You won the game!");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a draw!");
                                    break;
                                }
                            }
                        }  // close while 2
                    }
                }
                else if(level == 2)
                {
                    //create player objects
                    Human human = new Human();
                    Medium computer = new Medium();
                    System.out.println("please choose your marker");
                    System.out.println("type 1 for 'x' or 2 for 'o'");

                    int marker = s.nextInt();
                    //set markers
                    if(marker == 1)
                    {
                        // create player objects
                        System.out.println("You chose cross 'X'");
                        human.setMarker("X");
                        computer.setMarker("O");
                    } 
                    else if(marker == 2)
                    {
                        System.out.println("You chose Knought 'O'");
                        human.setMarker("O");
                        computer.setMarker("X");
                    }
                    else if((marker != 1) && (marker != 2))
                    {
                        System.out.println("Please choose either '1' or '2'!!");
                        System.exit(marker);
                    }
                    // determine who goes first
                    int first = (int) (Math.random() * 2);

                    boolean won = false;
                    int turns = 0;
                
                    if(first == 0)
                    {
                        System.out.println("You got to make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! \nYou won the game!!");
                            System.exit(turns);
                        }
                    }
                    else
                    {
                        System.out.println("I make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! \nI won the game!!");
                            System.exit(turns);
                        }
                    }
                
                    if(first == 0)
                    {
                        System.out.println();
                        while(!won)
                        {
                            human.takeTurn(Setup.getBoard());
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("Congrats you won!");
                            }
                            if(turns == N*N)
                            {
                                won = true;
                                //System.out.println(N*N);
                                System.out.println("Its a bore draw!");
                                break;
                            }
                            if(!won)
                            {
                                computer.takeTurn(Setup.getBoard(), human);
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You just lost a game to an A.I"
                                        + " with an incomplete rule set.\nFACEPALM. :D");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a bore draw!");
                                    break;
                                }
                            }   
                        }  // close while 1
                    }
                    else 
                    {
                        System.out.println();
                        while(!won)
                        {
                            computer.takeTurn(Setup.getBoard(), human);
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("You just lost a game to an"
                                        + " A.I with an incomplete rule set.\nFACEPALM. :D");
                            }
                            
                            //checks if maximum moves are made and declares a draw
                            if(turns == N*N)
                            {
                                won = true;
                                System.out.println("Its a draw!");
                                break;
                            }
                            if(!won)
                            {
                                human.takeTurn(Setup.getBoard());
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You win!");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a draw!");
                                    break;
                                }
                            }
                        }  // close while 2
                    }
                    
                }
                else if(level == 3)
                {
                    //create player objects
                    Human human = new Human();
                    Computer computer = new Computer();
                    System.out.println("please choose your marker");
                    System.out.println("type 1 for 'x' or 2 for 'o'");

                    int marker = s.nextInt();
                    //set markers
                    if(marker == 1)
                    {
                        // create player objects
                        System.out.println("You chose cross 'X'");
                        human.setMarker("X");
                        computer.setMarker("O");
                    } 
                    else if(marker == 2)
                    {
                        System.out.println("You chose Knought 'O'");
                        human.setMarker("O");
                        computer.setMarker("X");
                    }
                    else if((marker != 1) && (marker != 2))
                    {
                        System.out.println("Please choose either '1' or '2'!!");
                        System.exit(marker);
                    }
                    // determine who goes first
                    int first = (int) (Math.random() * 2);

                    boolean won = false;
                    int turns = 0;
                
                    if(first == 0)
                    {
                        System.out.println("You got to make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! \nYou won the game!!");
                            System.exit(turns);
                        }
                    }
                    else
                    {
                        System.out.println("I make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! \nI won the game!!");
                            System.exit(turns);
                        }
                    }
                
                    if(first == 0)
                    {
                        System.out.println();
                        while(!won)
                        {
                            human.takeTurn(Setup.getBoard());
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("Congrats you won!");
                            }
                            if(turns == N*N)
                            {
                                won = true;
                                //System.out.println(N*N);
                                System.out.println("Its a bore draw!");
                                break;
                            }
                            if(!won)
                            {
                                computer.takeTurn(Setup.getBoard(), human);
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You just lost a game to an A.I"
                                        + " with an incomplete rule set.\nFACEPALM. :D");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    //System.out.println(N*N);
                                    System.out.println("Its a bore draw!");
                                    break;
                                }
                            }   
                        }  // close while 1
                    }
                    else 
                    {
                        System.out.println();
                        while(!won)
                        {
                            computer.takeTurn(Setup.getBoard(), human);
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("You just lost a game to an"
                                        + " A.I with an incomplete rule set.\nFACEPALM. :D");
                            }
                            
                            //checks if maximum moves are made and declares a draw
                            if(turns == N*N)
                            {
                                won = true;
                                System.out.println("Its a draw!");
                                break;
                            }
                            if(!won)
                            {
                                human.takeTurn(Setup.getBoard());
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You win!");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a draw!");
                                    break;
                                }
                            }
                        }  // close while 2
                    }
                }// Close of 'hard' level
                else
                {
                    System.out.println("Please enter a valid number for choosing the level!"
                            + "\nChoose 1 or 2 or 3 only.");
                    System.exit(level);
                }
                System.out.println("Would you like to play again? Type '1' for yes!!\n"
                        + "Any other input will be considered as a 'NO'!!");
                System.out.println();
                playAgain = s.nextInt();
            }while(playAgain == 1);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input!! \n ");
        }
    }
     public static int getBoardSizebs()
     {
         Scanner s = new Scanner(System.in);
         System.out.println("Please choose the size of the board! \n"
                     + "Enter 3 for 3X3 board, 4 for 4X4 board, etc..");
         int _boardSize;
         _boardSize = s.nextInt();
         System.out.print("You chose a "+_boardSize+"X"+_boardSize+" board.\n");
         return _boardSize;
     }
     
     public static int bs()
     {
         return N;
     }
}