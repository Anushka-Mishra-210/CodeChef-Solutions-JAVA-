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
		
		for(int i =1; i<=T;i++)
		{
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    
		    if(X+Y<Z)
		    System.out.println("PLANEBUS");
		    else if(Z< X+Y)
		    System.out.println("TRAIN");
		    else
		    System.out.println("EQUAL");
		    
		}
		
		// your code goes here
	}
}
