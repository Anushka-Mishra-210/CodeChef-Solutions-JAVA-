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
		    int G1 = sc.nextInt();
		    int S1 = sc.nextInt();
		    int B1 = sc.nextInt();
		    
		    int G2 = sc.nextInt();
		    int S2 = sc.nextInt();
		    int B2 = sc.nextInt();
		    
		    if(G1+S1+B1 < G2+B2+S2)
		    System.out.println("2"); 
		    else 
		    System.out.println("1");
		}
		
		// your code goes here
	}
}
