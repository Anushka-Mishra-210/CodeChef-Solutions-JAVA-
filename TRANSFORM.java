/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		
		for(int i =1; i<=T; i++)
		{
		    int X = sc.nextInt();
		    
		    /*If he is currently small, he turns normal.
If he is currently normal, he turns huge.
If he is currently huge, he turns small*/

		    String s = "HUGE";
		    for(int j =2; j<=X; j++)
		    {
		       if(s.equals("HUGE"))
		       s ="SMALL";
		       else if(s.equals("SMALL"))
		       s = "NORMAL";
		       else 
		       s = "HUGE";
		    }
		    System.out.println(s);
		}
		
		
		// your code goes here
	}
}
