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
		
		if(T>=1 && T<=1000)
		{
		    for(int i=1; i<=T; i++)
		    {
		        int N = sc.nextInt();
		        int M = sc.nextInt();
		        int K = sc.nextInt();
		        
		        int seatleft = M-K;
		        if(N<=seatleft)
		        System.out.println("YES");
		        else 
		        System.out.println("NO");
	}
		}
		}
}
