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
	        int X1 = sc.nextInt();
	        int X2 = sc.nextInt();
	        int X3 = sc.nextInt();
	        int V1 = sc.nextInt();
	        int V2 = sc.nextInt();
	        
	        double ChefTime = (double) (Math.abs(X3-X1))/V1;
	        double KefaTime = (double) (Math.abs(X3-X2))/V2;
	        
	        if(ChefTime<KefaTime)
	            System.out.println("Chef");
	        else if(KefaTime<ChefTime)
	            System.out.println("Kefa");
	        else
	            System.out.println("Draw");
	    }
		
		// your code goes here
	}
}
