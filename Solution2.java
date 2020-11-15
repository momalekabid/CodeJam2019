
/**
 * Mohamed Abid
 */
import java.util.*;
import java.io.*;
public class Solution
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String opponent;
    int testcases = Integer.parseInt(scan.nextLine());
    int mazeSize;
    for(int i = 1; i <= testcases; i++)
    {
      mazeSize = Integer.parseInt(scan.nextLine());
      opponent = scan.nextLine();
      System.out.print("Case #" +i + ": ");
      for(int j = 0; j < (2*mazeSize)-2; j++)
      {
        if(opponent.substring(j, j+1).equals("S"))
        {
          System.out.print("E");
        }
        else
          System.out.print("S");
      }
      System.out.println();
    }
    

  }

}
 