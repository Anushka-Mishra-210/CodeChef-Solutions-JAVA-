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
		
		if(T>=1 && T<=1000)
		{
		for( int i =1; i<=T;i++)
		{
		    int X = sc.nextInt();
		    if(X>=1&& X<=1000)
		    {
		       if(X%5!=0 && X%10!=0)
		       System.out.println("-1");
		       else 
		       {
		           int q = X/10;
		           int k=X%10;
		           if(k/5!=1)
		           System.out.println(q);
		           else
		           System.out.println(q+1);
		           
		       }
		       		    }
		}}
		// your code goes here
	}
}
