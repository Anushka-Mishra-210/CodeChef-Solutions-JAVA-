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
	   if (T>=1 && T<=1000)
	   {
		for(int i =1; i<=T;i++)
		{
		    int N = sc.nextInt();
		int poly = N/10;
		int poly1 = N%10;
		if(poly1>0)
		{
		   int  poly2 = poly+1;
		    System.out.println(poly2);
		}
		else 
		System.out.println(poly);
	}}
}
}
