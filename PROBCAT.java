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
		    int X = sc.nextInt();
		    
/*1) Easy if 1≤x<100

2) Medium if 100≤x<200

3) Hard if  200≤x≤300*/
		
		    if(X>=1 && X<100)
		    System.out.println("Easy");
		    else if(X>=100 && X<200)
		    System.out.println("Medium");
		    else if(X>=200 && X<=300)
		    System.out.println("Hard");
		}
		
		// your code goes here
	}
}
