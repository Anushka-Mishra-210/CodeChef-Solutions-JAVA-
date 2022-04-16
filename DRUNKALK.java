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
		    int K = sc.nextInt();
		    int c =0;
		    
		    for(int j =1; j<=K; j++)
		    {
		    if(j%2==0)
		            c= c-1;
		        else 
		            c= c+3;
		}
		  System.out.println(c);
		}
		
		
		// your code goes here
	}
}
