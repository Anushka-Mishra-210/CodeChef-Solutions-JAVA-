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
		// your code goes here
	int T = sc.nextInt();
	if(T>=1 && T<=100)
	{
	    for(int i =1; i<=T; i++)
	    {
	        int A = sc.nextInt();
	       int B = sc.nextInt(); 
	        int C = sc.nextInt();
	        
	        int min1 =Math.min(A,B);
	        int min2 = Math.min(min1,C);
	        int low;
	        System.out.println((A+B+C)- min2);
	    }
	}
	    
	}
}
