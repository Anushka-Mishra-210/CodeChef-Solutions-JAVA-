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
		for(int i =1; i<=T;i++)
          {
              int N = sc.nextInt();
              
              int cars = N/4;
              int cars1 = N%4;
              if(cars1==0)
              System.out.println(cars);
              else if(cars1/4!=1)
              System.out.println(cars+1);
          }		
		// your code goes here
	}
}
