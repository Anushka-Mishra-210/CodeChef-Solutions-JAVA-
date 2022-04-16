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
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    
		    int P =2*N;
		    /*int A[] = new int[4*N];
		    for(int j =1; j<=P; j++)
		    {
		        A[j] = P;
		        P--;
		        if(X==j)
		        System.out.println(A[j]);
		    }*/
		    System.out.println(P-(X-1));
		}
		
		// your code goes here
	}
}
