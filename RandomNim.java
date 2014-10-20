public class RandomNim
{

  public int play(int pieces) //method
  {
    if ((pieces - 4) % 3 == 0)
    {
      System.out.println("The computer ragequits."); //prints if computer is gonna lose
      return (int)(Math.random() * 2 + 1);
    }
    else if (pieces == 3) //accounts for when 3 pieces are remaining
    {
      return 2;
    }
    else if (pieces == 2) //accounts for when 2 pieces are remaining
    {
      return 1;
    }
    else
    {
    return ((pieces - 4) % 3); //makes sure player ends up on a "node"
    }
  }
}