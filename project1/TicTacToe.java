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
    System.out.println();
    System.out.println("...1...|...2...|...3...");
    System.out.println("...4...|...5...|...6...");
    System.out.println("   7   |   8   |   9   \t");
    
    System.out.println("PLAYER 1 -- X or O?: ");
    type1 = scan.next();
    }
   public void setType2(){
       if (type1 == "X"){
           type2 = "O";
        }
           else {
           type2 = "X";
        }
    }
    
   public void move (){
       System.out.println("PLAYER 2 -- Type box number of move: ");
       placement = scan.nextInt();
    }
    
   public void makeBoard(){
       for (int row = 0; row < 3; row++){
           for ( int col = 0; col < 3; col++){
               board[row][col] = "______";
            }
        }
       for (int row = 0; row < 3; row++){
           for ( int col = 0; col < 3; col++){
               System.out.println(board[row][col] + "/t");
            }
            System.out.println();
        }
    }
}

