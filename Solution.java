/**
 * Mohamed Abid April 6th
 */
import java.util.*;
import java.io.*;

public class Solution
  {
    private static int testCases;
    public static String check;
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      testCases = Integer.parseInt(scan.nextLine());
      for(int i = 1; i<= testCases; i++)
      {
       check = scan.nextLine();
       char[] numberOne = new char[check.length()];
       char[] numberTwo = new char[check.length()];
       for(int j = 0; j < check.length(); j++)
       {
         if(check.substring(j, j+1).equals("4"))
         {
           numberOne[j] = '3';
           numberTwo[j] = '1';
         }
         else
         {
           numberOne[j] = check.charAt(j);
           numberTwo[j] = '0';
         }
       }
       System.out.print("Case #" +i + ": ");
       for(int charPrinter = 0; charPrinter < numberOne.length; charPrinter ++)
       {
         if(charPrinter == 0 && numberOne[charPrinter]=='0')
         {
         }
         else
         {
           System.out.print(numberOne[charPrinter]);
         }
       }
       System.out.print(" ");
       for(int charPrinter =0; charPrinter < numberTwo.length; charPrinter ++)
       {
         if(charPrinter == 0 && numberTwo[charPrinter]=='0')
         {
         }
         else
         {
           System.out.print(numberTwo[charPrinter]);
         }
       }
       System.out.println();
      }
    }
      
  }  