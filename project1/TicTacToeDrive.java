//
//
//
//
//THIS IS THE ONE THAT IS SYNCED TO GITHUB DESKTOP
//
//
//

import java.util.Scanner;
public class TicTacToeDrive
{ 
    public static void main (String[] args){
       TicTacToe game = new TicTacToe();
       Player p1 = new Player("PLAYER 1");
       Player p2 = new Player("PLAYER 2");
       String type1;
       String type2;
       Scanner scan = new Scanner(System.in);

       game.start();
       System.out.println(p1.getName() + " -- X or O?: ");
       type1 = scan.next();
       
       if (type1.equals("X")|| type1.equals("x")){
           type2 = "O";
           type1 = "X";
        }
           else {
           type2 = "X";
           type1 = "O";
        }
       p1.setType(type1);
       p2.setType(type2);
       
       
       //somethings wrong here
       while (game.won == false){
           game.progress(p2, game.getPlacement());
           game.progress(p1, game.getPlacement());
        }
       /*game.move(p2);
       game.makeBoard(p2, game.getPlacement());
       
       game.move(p1);
       game.makeBoard(p1, game.getPlacement());
       
       game.move(p2);
       game.makeBoard(p2, game.getPlacement());
       game.move(p1);
       game.makeBoard(p1, game.getPlacement());
       
       game.move(p2);
       game.makeBoard(p2, game.getPlacement());
       game.move(p1);
       game.makeBoard(p1, game.getPlacement());
       */

    }

}
