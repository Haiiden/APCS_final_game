import java.util.Scanner;

public class Driver{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);


    System.out.println("Player 1 type and name? lowercase");
    String type = input.next();
    String name = input.next();
    if (type.equals("cow")){
      Animal player1 = new Cow(name);
    }else if(type.equals("pig")){
      Animal player1 = new Pig(name);
    }else{
      Animal player1 = new Chicken(name);
    }

    System.out.println("Player 2 type and name? lowercase");
    type = input.next();
    name = input.next();
    if (type.equals("cow")){
      Animal player2 = new Cow(name);
    }else if(type.equals("pig")){
      Animal player2 = new Pig(name);
    }else{
      Animal player2 = new Chicken(name);
    }

    while(player1.gethp() > 0 && player2.gethp() > 0){
      System.out.println("Player 1's move. Choose one: " + player1.moveList());//create abstract method moveList and override it
      String move = input.next();

      System.out.println("Player 1's move. Choose one: " + player1.moveList());
      move = input.next();
    }

    if(player1.gethp() < 0){System.out.println("player2 wins!");}
    else{System.out.println("player1 wins!");}

  }
}
