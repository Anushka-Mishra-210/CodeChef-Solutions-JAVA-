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
		    int X1 = sc.nextInt();
		    int X2 = sc.nextInt();
		    
		    int Y1 = sc.nextInt();
		    int Y2 = sc.nextInt();
		    
		    double t=(double)Y1/X1;
		    double t1=(double)Y2/X2;
		    if((t)<(t1)){
		        System.out.println("-1");
		    }
		    else if(t==t1){
		        System.out.println("0");
		    }
		    else if(t>t1){
		         System.out.println("1");
		    }
		}
		
		
		// your code goes here
	}
}
