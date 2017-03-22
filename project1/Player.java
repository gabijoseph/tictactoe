import java.util.Scanner;
public class Player
{
    Scanner scan = new Scanner(System.in);
    String type;
    public Player(){
        //
    }
    /*public void move (){
       //
    }*/
    public void setType(String s){
        type = s;
    }
    public String getType(){
        return type;
    }
}
