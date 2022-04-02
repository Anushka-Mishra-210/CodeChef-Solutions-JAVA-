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
		
		if(T>=1 && T<=100)
		{
		    for(int i =1; i<=T;i++)
		    {
		        int N=sc.nextInt();
		        int M = sc.nextInt();
		        if(M>N)
		        {
		            System.out.println(N);
		        }
		        else if(M==0) 
		        {
		            System.out.println(N*2);
		        }
		        else 
		        {
		            int left =N-M;
		            int total = left +N;
		            System.out.println(total);
		        }
		    }
		}
		// your code goes here
	}
}
