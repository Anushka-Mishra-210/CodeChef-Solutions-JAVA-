/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t>=1 && t<=100)
		{
		    for(int i =1; i<=t;i++)
		    {
		        int K = sc.nextInt();
		        int X = sc.nextInt();
		        if((K>=1 && K<=1000) && (X>=1 && X<=1000))
		        {
		    
		    System.out.println(K-X);
		    }
		    }
		    }
		}
		// your code goes here
	}

