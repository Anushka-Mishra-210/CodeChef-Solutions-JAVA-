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
		for(int i=1; i<=T;i++)
		{
		    double B = sc.nextDouble();
		    double LS = sc.nextDouble();
		    double maxRS = Math.sqrt(B*B+LS*LS);
		    double minRS = Math.sqrt(LS*LS - B*B);
		    
		    System.out.println(minRS +"\t"+ maxRS);
		}
		
		// your code goes here
	}
}
