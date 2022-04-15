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
	        int a =sc.nextInt();
	        int b = sc.nextInt();
	        
     // 1 for bullet, 2 for blitz, 3 for rapid, and 4 for classical
	      if(a+b<3)
          System.out.println("1");
          else if(a+b>=3 && a+b<=10)
          System.out.println("2");
          else if(a+b >=11 && a+b <=60)
          System.out.println("3");
          else 
          System.out.println("4");

	 
	    }    
		
		
		// your code goes here
	}
}
