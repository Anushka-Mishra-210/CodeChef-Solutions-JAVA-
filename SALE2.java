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
		
		for(int i =1; i<=T;i++)
		{
		    int N =sc.nextInt();
		    int X = sc.nextInt();
		    
		    if(N%3==0)
		    System.out.println(((N/3)*2)*X);
		    else if(N%3!=0)
		    System.out.println(((N/3)*2)*X + (N%3)*X);
		}
		
		// your code goes here
	}
}
