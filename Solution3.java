import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Mohamed Abid
 */

public class Solution
{

  public static void main(String[] args)
  {
    int code[] = new int[26];
    Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int testcases = Integer.parseInt(scan.nextLine());
    for(int j= 1; j<=testcases; j++)
    {
      int maxPrime = Integer.parseInt(scan.next());
      int numberOfChunks = Integer.parseInt(scan.next());
      int cipher[] = new int[numberOfChunks];
      for(int i = 0; i< numberOfChunks; i++)
        {
          cipher[i] = Integer.parseInt(scan.nextLine());
        }
      int lastPrime = 0;
      boolean firstPrimecheck = true;
      int indexCounter = numberOfChunks-1;
      int codeCounter = 25;
      for(int i=maxPrime; i > 2; i--)
      {
        if(isPrime(i) && firstPrimecheck)
        {
          lastPrime = i;
          firstPrimecheck = false;
        }
        if(isPrime(i) && !(firstPrimecheck))
        {
          if(lastPrime*i == cipher[indexCounter])
          {
            indexCounter--;
            code[codeCounter] = lastPrime;
            codeCounter--;
            code[codeCounter] = i;
            lastPrime = i;
          
          }
        }
        
      }
      for(int i = 0; i < numberOfChunks; i++)
      {
        for(int x = 0; x<26; x++)
        {
          if(code[x] == cipher[i])
          {
            System.out.print(getCharForNumber(x+1));
            
          }
        }
      }
    }
  }
  public static boolean isPrime(int num)
  {
  for(int i = 2; i <= num/2; ++i)
  {
      // condition for nonprime number
      if(num % i == 0)
      {
          return true;
      }
  }
  return false;
  }
  public static String getCharForNumber(int i) {
    return i > 0 && i < 27 ? String.valueOf((char)(i + 'A' - 1)) : null;
}
}
 