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
		    int L = sc.nextInt();
		    
		    if(L>=1 && L<=4)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		}
		
		
		// your code goes here
	}
}
