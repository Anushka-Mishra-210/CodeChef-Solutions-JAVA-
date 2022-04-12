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
		
		
		    char X = sc.next().charAt(0);
		    char Y = sc.next().charAt(0);
		
		if(X==Y)
		System.out.println(X);
		else if(X == 'R' && (Y== 'G' || Y == 'B'))
		System.out.println("R");
		else if((X == 'G' && Y == 'B')) 
		System.out.println("B");
		else if((X == 'B' || Y == 'G'))
		System.out.println("B");
		
		
		// your code goes here
	}
}
