/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    if(T>=1 && T<=100)
	    {
	        for(int i =1; i<=T; i++)
	        {
	            int X = sc.nextInt();
	            int Y = sc.nextInt();
	            int D = sc.nextInt();  
	              int diff = X-Y;
	              if((Math.abs(diff)) <= D)
	              System.out.println("YES");
	              else 
	              System.out.println("NO");}}
	              
	              // your code goes here
	}
}
