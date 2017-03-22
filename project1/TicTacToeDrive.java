import java.util.Scanner;
public class TicTacToeDrive
{ 

    public static void main (String[] args){
       TicTacToe game = new TicTacToe();
       Player p1 = new Player();
       Player p2 = new Player();
       String type1;
       String type2;
       Scanner scan = new Scanner(System.in);

       game.start();
       System.out.println("PLAYER 1 -- X or O?: ");
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
       
       game.move(p2);
       game.makeBoard(p2, game.getPlacement());
       game.move(p1);
       game.makeBoard(p1, game.getPlacement());
       
       //this works if you uncomment, but pasted into Player class to experiment
       //
       /*System.out.println("PLAYER 2 -- Enter position number of move: ");
       game.setPlacement(scan.nextInt());
       if (game.getPlacement() < 1 || game.getPlacement() > 9){
           System.out.println("OUT OF BOUNDS! Enter between 1 and 9: ");
           game.setPlacement(scan.nextInt());
        }*/
    }

}
