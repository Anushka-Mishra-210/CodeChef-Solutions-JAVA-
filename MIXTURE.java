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
		
		for(int i =1; i<=T; i++)
		{
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    
		    if((A>0) && (B>0))
		    System.out.println("Solution");
		    else if(A==0)
		    System.out.println("Liquid");
		    else if(B==0)
		    System.out.println("Solid");
		}
		
		
		
		// your code goes here
	}
}
