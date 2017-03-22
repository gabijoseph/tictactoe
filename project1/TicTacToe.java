// https://www.codeproject.com/Articles/778260/AI-based-Tic-Tac-Toe

import java.util.Scanner;
public class TicTacToe
{
   public String[][] board = new String[3][3];
   //public String type1;
   //public String type2;
   public int placement;
   Scanner scan = new Scanner(System.in);
    
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
       for (int row = 0; row < 3; row++){
           for ( int col = 0; col < 3; col++){
               if (board[row][col].equals("X") || board[row][col].equals("O")){
               if (p == boxContent){
                   board[row][col] = "___" + one.getType() + "___";
                   boxContent++;
                }
               else{
                   board[row][col] = "___" + boxContent +"___";
                   boxContent++;
                }
            }
            else{
                //
            }
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
   /*public void progress(Player first, Player second){
       makeBoard(
    }*/
   public int getPlacement(){
       return placement;
    }
   public void setPlacement(int i){
       placement = i;
    }
   public void move(Player p){
       System.out.println("PLAYER 2 -- Enter position number of move: ");
       placement = scan.nextInt();
       if (placement < 1 || placement > 9){
           System.out.println("OUT OF BOUNDS! Enter between 1 and 9: ");
           placement = scan.nextInt();
        }
    }
}


