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
		    int A[] = new int [N];
		    
		    for(int j =0; j<N; j++)
		    {  A[j] = sc.nextInt();  }
		    
		    int temp = N;
		    for(int k=0; k<N; k++)
		    {
		        if( (A[k]==6 || A[k]==13 || A[k]==20 || A[k]==27) ||
		        (A[k]==7 || A[k]==14 || A[k]==21 || A[k]==28) )
		        temp--;
		       
		    }
		    System.out.println(8+temp);
		}
		
		
		// your code goes here
	}
}
