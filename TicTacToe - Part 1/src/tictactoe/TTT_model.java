 
package tictactoe;
import java.util.Scanner;

public class TTT_model
{
    private int r,c;
    private boolean check;
    private char currentPlayer='X';
    private char gameBoard [][] = {{'-','-','-'},
                                   {'-','-','-'},
                                   {'-','-','-'}};
    
    public void newGame() //to output the statement when a new game starts
    {
        System.out.println("Tic-Tac-Toe!");
    }
    
    
    public void displayBoard() //displays the layout of the game
    {
        
        System.out.println("Current Board Layout");
        
        System.out.println("-------------");
        for (int row=0 ; row<=2 ; row++)
        {
            System.out.print("| ");
            for (int col=0 ; col<=2 ; col++)
            {
                System.out.print(gameBoard[row][col]+" | ");
            }
            System.out.println(" ");
            System.out.println("-------------");
        }
    }

    
    
    public void playGame() //inputs are taken and put to the array
    {
        for(int counter=0 ; counter<=8 ; counter++)
        {
            Scanner inputobj=new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Player "+currentPlayer+", enter an empty row and column to place your mark : ");
            check=false;
            while(check==false) //to check if the number input is between 0 and 2, if not, until the player enters the right coordinates it will loop.
            {
                System.out.print("Row : ");
                r=inputobj.nextInt(); //row input
                System.out.print("Column : ");
                c=inputobj.nextInt(); //column input
                if ((r<=2 && r>=0) && (c<=2 && c>=0))
                {
                    if (gameBoard[r][c]=='-')
                    {
                        check=true;
                    }
                    else 
                    {
                        System.out.println("\nPlace already filled...Try Again");
                    }
                }
                else
                {
                    System.out.println("\nInvalid Input...Try Again !");
                } 
            }
            
            gameBoard [r][c]= currentPlayer;
            displayBoard(); //calling the displayBoard method to display the board after each input of character.
            if (checkForWin()==true) //checking if someone has won the game 
            {
                System.out.println("Player "+currentPlayer+" has won the game!");
                break; //exit the loop if loop if a win is found
            }
            
            if (currentPlayer=='X')
            {
                currentPlayer='O';
            }
            else 
            {
                currentPlayer='X';
            }
            
            // if all the moves are done and the match is a draw
            if (counter==8)
            {
                System.out.println("The Game is a Draw!");
            }
        }
    }
    
    
    
    
    public boolean checkForWin() //to check if there are any 3 consecative matches to award a winner to the game
    {
        //check rows for a win
        for (int row=0 ; row<=2 ; row++)
        {
            if(gameBoard[row][0]== gameBoard[row][1] && gameBoard[row][1]==gameBoard[row][2] && gameBoard[row][0]!='-')
            {
                return true;
            }
        }
        
        //check columns for a win
        for (int col=0 ; col<=2 ; col++)
        {
            if(gameBoard[0][col]==gameBoard[1][col] && gameBoard[1][col]==gameBoard[2][col] && gameBoard[0][col]!='-')
            {
                return true;
            }
        }
        
        //check diagonals for a win
        if (gameBoard[0][0]==gameBoard[1][1] && gameBoard[1][1]==gameBoard[2][2] && gameBoard[0][0]!='-')
        {
            return true;
        }
        
        if (gameBoard[0][2]==gameBoard[1][1] && gameBoard[1][1]==gameBoard[2][0] && gameBoard[0][2]!='-')
        {
            return true;
        }
        
        //no winner yet
        return false;
    }
}




