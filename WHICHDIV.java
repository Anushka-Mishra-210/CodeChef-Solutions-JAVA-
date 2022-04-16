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
		    int R = sc.nextInt();
		    
		    /*Division 1: 2000≤ Rating.
Division 2: 1600≤ Rating <2000.
Division 3: Rating <1600.*/

            if(R <1600)
            System.out.println("3");
            else if (R>= 1600 && R< 2000)
            System.out.println("2");
            else 
            System.out.println("1");
		}
		
		
		// your code goes here
	}
}
