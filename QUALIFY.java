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
	    for(int i = 1; i<=T; i++)
	    {
	        int X = sc.nextInt();    
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        
		int marks = (A*1) +(B*2);
		if(marks>=X)
		System.out.println("QUALIFY");
		else
	    System.out.println("NotQUALIFY");
	}
		
		// your code goes here
	}
}
