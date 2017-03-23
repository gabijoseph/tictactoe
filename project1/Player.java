import java.util.Scanner;
public class Player
{
    Scanner scan = new Scanner(System.in);
    String type;
    String name;
    public Player(String name){
        this.name = name;
    }
    
    public void setType(String s){
        type = s;
    }
    
    public String getType(){
        return type;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
}
