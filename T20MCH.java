/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);// your code goes here
	int R = sc.nextInt();
	int O = sc.nextInt();
	int C = sc.nextInt();
	 int possib = (20-O)*36;
	 int possib1 = C + possib;
	 if(possib1>R)
	 System.out.println("YES");
	 else 
	 System.out.println("NO");
	    
	}
}
