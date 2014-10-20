//Douglas Kiang
//Accepts player move, calls play() from Nim class.
import java.util.Scanner;
 
public class NimDriver{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    boolean win = false;
    int startnum = (int)(Math.random() * 100 + 1);
    int pieces;
    int playermove;
    RandomNim test = new RandomNim();
    pieces = startnum;
    while (pieces > 1){
      System.out.println("There are " + pieces + " pieces remaining.");
      System.out.println("Enter your move: ");
      playermove = in.nextInt();
      while ((playermove < 1) || (playermove > 2)){ //checks to see if number is within range
        System.out.println("Please enter 1 or 2: ");
        playermove = in.nextInt();
      }
      pieces -= playermove;
      if (pieces == 1)
      {
        System.out.println("Computer loses.");
      }
      else System.out.println("There are " + pieces + " pieces remaining.");
      System.out.println("The computer takes [" + test.play(pieces) + "] piece(s).");
      pieces -= test.play(pieces);
      if (pieces == 1){
        System.out.println("You lose.");
      }
    }
  }
}