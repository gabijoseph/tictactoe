// https://www.codeproject.com/Articles/778260/AI-based-Tic-Tac-Toe

import java.util.Scanner;
public class TicTacToe
{
   private String[][] board = new String[3][3];
   public String type1;
   public String type2;
   public int placement;
   Scanner scan = new Scanner(System.in);
   
   public void start(){
    makeBoard();
    System.out.println("PLAYER 1 -- X or O?: ");
    type1 = scan.next();
    setType2();
    }
   public void setType2(){
       if (type1 == "X"|| type1 == "x"){
           type2 = "O";
        }
           else {
           type2 = "X";
        }
    }
    
   public void makeBoard(){
       int boxContent = 1;
       for (int row = 0; row < 3; row++){
           for ( int col = 0; col < 3; col++){
               board[row][col] = "___" + boxContent +"___";
               boxContent++;
            }
        }
       for (int row = 0; row < 3; row++){
           for ( int col = 0; col < 3; col++){
             System.out.print(board[row][col] + " | ");
            }
           System.out.println();
        }
    }
}


