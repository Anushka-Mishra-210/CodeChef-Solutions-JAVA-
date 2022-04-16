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
		    int L = sc.nextInt();
		    int R = sc.nextInt();
		    
		    int c =0;
		    for(int j =L; j<=R ; j++)
		    {
		        if(j%10 == 2 || j%10 == 3 || j%10 == 9 )
		        c++;
		    }
		    System.out.println(c);
		}
		
		// your code goes here
	}
}
