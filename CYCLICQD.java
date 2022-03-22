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
		
		if (T>=1 && T<= Math.pow(10,4))
		{
		    for(int i =1;i<=T;i++)
		    {
		        int A = sc.nextInt();
		         int B = sc.nextInt();
		          int C = sc.nextInt(); 
		          int D = sc.nextInt();
		          if(A+B+C+D == 360)
		          {
		              if ((A+C ==180 ) && (B+D ==180))
		              System.out.println("YES");
		              else 
		              System.out.println("NO");
		              
		          }
		    }
		}
	}
}
