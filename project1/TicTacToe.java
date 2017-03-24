// https://www.codeproject.com/Articles/778260/AI-based-Tic-Tac-Toe
//
//
//
//THIS IS THE ONE THAT IS SYNCED TO GITHUB DESKTOP
//
//
//
import java.util.Scanner;
public class TicTacToe
{
   public String[][] board = new String[3][3];
   //public String type1;
   //public String type2;
   public int placement;
   Scanner scan = new Scanner(System.in);
   public boolean won = false;
    
   public void start(){
       int boxContent = 1;
       for (int row = 0; row < 3; row++){
           for ( int col = 0; col < 3; col++){
               board[row][col] = "___" + boxContent +"___";
               boxContent++;
            }
        }
       for (int row = 0; row < 3; row++){
           System.out.print("|");
           for ( int col = 0; col < 3; col++){
             System.out.print(board[row][col] + "|");
            }
           System.out.println();
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
           System.out.print("|");
           for ( int col = 0; col < 3; col++){
             System.out.print(board[row][col] + "|");
            }
           System.out.println();
        }
    }
    
   public void makeBoard(Player one,int p){
       int boxContent = 1;
       int newP;
       for (int row = 0; row < 3; row++){
           for ( int col = 0; col < 3; col++){
              if ((board[row][col].equals("___X___") || board[row][col].equals("___O___")) && p == boxContent){
                       System.out.println("POSITION FULL. Please choose another: ");
                       newP = scan.nextInt();
                       makeBoard(one, newP);
                       //
                       //somehow this prints a second weird double board after choosing a free position, then prints regular board...
                       //
                }
              
               else if (board[row][col].equals("___X___") || board[row][col].equals("___O___")){
                   boxContent++;
                }
               else{
                   if (p == boxContent){
                       board[row][col] = "___" + one.getType() + "___";
                       boxContent++;
                 }
                    else{
                   board[row][col] = "___" + boxContent +"___";
                   boxContent++;
                 }
              }
           }
        }
       printBoard();
    }
   
   public void printBoard(){
        for (int row = 0; row < 3; row++){
           System.out.print("|");
           for ( int col = 0; col < 3; col++){
             System.out.print(board[row][col] + "|");
            }
           System.out.println();
        }
    }
    
   public int getPlacement(){
       return placement;
    }
    
   public void setPlacement(int i){
       placement = i;
    }
    
   public void move(Player p){
       System.out.println(p.getName() + " -- Enter position number of move: ");
       placement = scan.nextInt();
       if (placement < 1 || placement > 9){
           System.out.println("OUT OF BOUNDS! Enter between 1 and 9: ");
           placement = scan.nextInt();
        }
    }
    
   public void win(Player p){
            //checks for row wins
           for (int j = 0; j < 3; j++){
               if (board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])){
                   if (board[0][j].equals(p.getType())){
                   System.out.println("CONGRATS, " + p.getName() + "! YOU'VE WON.");
                   won = true;
                  }
               }
            }
            // checks for column wins
           for (int j = 0; j < 3; j++){
               if (board[j][0].equals(board[j][1]) && board[j][1].equals(board[j][2])){
                   if (board[j][0].equals(p.getType())){
                   System.out.println("CONGRATS, " + p.getName() + "! YOU'VE WON.");
                   won = true;
                  }
                }
            }
            //checks for diagonal wins
           if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])){
               if (board[0][0].equals(p.getType())){
                   System.out.println("CONGRATS, " + p.getName() + "! YOU'VE WON.");
                   won = true;
                  }
            }
           if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])){
               if (board[0][2].equals(p.getType())){
                   System.out.println("CONGRATS, " + p.getName() + "! YOU'VE WON.");
                   won = true;
                  }
            }
   }
   
   public void quit(){
       System.out.println("GAME OVER");
    }
   
}


