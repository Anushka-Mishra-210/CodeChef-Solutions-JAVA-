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
		
		if (T>=1 && T<=1000)
		{
		 for(int i =1; i<=T;i++)   
		    {
		  int X1 = sc.nextInt();
		  int Y1 = sc.nextInt();
		  int X2 = sc.nextInt();
		  int Y2 = sc.nextInt();
		  
		  int X = X1-X2;
		  int Y = Y1-Y2;
		  
		  int X3 = Math.abs (X);
		  int Y3 = Math.abs(Y); 
		  if(X3==Y3)
		  System.out.println(X3);
		  else
		  System.out.println(Math.max(X3,Y3));
		}
		  
		} 
		
		// your code goes here
	}
}
