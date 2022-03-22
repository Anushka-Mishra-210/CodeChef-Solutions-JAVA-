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
	    for (int i =1; i<=T;i++)
	     {	
	         int A = sc.nextInt();
	         int B = sc.nextInt();
	     if((A>=1 && A<=10) && (B>=1 && B<=10) )    
	    {     
	    int num = 21 - (A+B);
	    if(num>=1 && num <=10)
		    System.out.println(num);
		    else 
		    System.out.println(-1);
	     }
	     }
	    }
		// your code goes here
	}
}
