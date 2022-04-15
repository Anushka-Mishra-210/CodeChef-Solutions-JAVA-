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
		  int X1 = sc.nextInt();
		  int X2 = sc.nextInt();
		  
		  int Y1 = sc.nextInt();
		  int Y2 = sc.nextInt();
		  
		  int Z1 = sc.nextInt();
		  int Z2 = sc.nextInt();
		  
		  if(X2>=X1 && Y2>=Y1 && Z1>=Z2)
		  System.out.println("YES");
		  else 
		  System.out.println("NO");
		   
		}
		
		// your code goes here
	}
}
