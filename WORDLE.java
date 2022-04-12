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
		    String S = sc.next();
		    String TWord = sc.next();
		  
		    for(int j=0;j<5;j++)
		    {
		        if(S.charAt(j) == TWord.charAt(j))
		      System.out.print("G");
		        else 
		        System.out.print("B");
		        }
              System.out.println(" ");
		}
		
		// your code goes here
	}
}
