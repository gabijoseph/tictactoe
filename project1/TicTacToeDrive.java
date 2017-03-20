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
       if (type1 == "X"|| type1 == "x"){
           type2 = "O";
           type1 = "X";
        }
           else {
           type2 = "X";
           type1 = "O";
        }
       p1.setType(type1);
       p2.setType(type2);
       
       /*test print
       System.out.println(p1.getType());
       System.out.println(p2.getType());
       */
      
       
       
    }
}