import java.util.Scanner;

public class Driver{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("this is a two player farm fighting game.");
    System.out.println("Player 1 type and name? lowercase");
    String type = input.next();
    String name = input.next();

    Animal player1;
    if (type.equals("cow")){
      player1 = new Cow(name);
    }else if(type.equals("pig")){
      player1 = new Pig(name);
    }else{
      player1 = new Chicken(name);
    }


    Animal player2;
    System.out.println("Player 2 type and name? lowercase");
    type = input.next();
    name = input.next();
    if (type.equals("cow")){
      player2 = new Cow(name);
    }else if(type.equals("pig")){
      player2 = new Pig(name);
    }else{
      player2 = new Chicken(name);
    }

    while(player1.gethp() > 0 && player2.gethp() > 0){
      System.out.println("Player 1's move. Choose one and type the number: " + player1.moveList());
      int move1 = input.nextInt();
      System.out.println(player1.move(move1, player2));

      if (player2.gethp() <= 0){break;}

      System.out.println("Player 2's move. Choose one and type the number: " + player2.moveList());
      int move2 = input.nextInt();
      System.out.println(player2.move(move2, player1));
    }

    if(player1.gethp() <= 0){System.out.println("player2 wins!");}
    else{System.out.println("player1 wins!");}
    input.close();
  }
}
