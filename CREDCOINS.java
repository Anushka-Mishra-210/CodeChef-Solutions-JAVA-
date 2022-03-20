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
		for(int i =1; i<=T; i++)
		{
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int cred = X*Y;
		    
		    if(cred>=100)
		    {
		        int bag = cred/100;
		        System.out.println(bag);
		    }
		    else 
		    System.out.println(0);
		}
		
		// your code goes here
	}
}
