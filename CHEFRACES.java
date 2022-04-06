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
		
		if(T>=1 && T<=144)
		{    int c =0;
		    for (int i =1; i<=T; i++)
		    {
		        int X = sc.nextInt();
		        int Y = sc.nextInt();
		        int A = sc.nextInt();
		        int B = sc.nextInt();
		        if((X==A || X==B) && (Y==A || Y==B))
		        c =0;
		        else if((X==A || X==B) || (Y==A || Y==B))
		        c= 1;
		        else 
		        c=2;
		        System.out.println(c);
	//ALTERNATE APPROACH
	/*else if((X!=A && X!=B) && (Y!=A && Y!=B))
		        c =2;
		        else 
		        c= 1;*/
		        
		    }
		}
		// your code goes here
	}
}
