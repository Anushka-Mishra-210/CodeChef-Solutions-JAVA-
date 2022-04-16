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
		    int X = sc.nextInt();
		    
	//North, East, South, West (in clockwise order).
	        String s = "EAST";
		    for(int j =2; j<=X; j++)
		    {
		        if(s.equals("EAST"))
		        s = "SOUTH";
		        else if (s.equals("SOUTH"))
		        s = "WEST";
		        else if (s.equals("NORTH"))
		        s = "EAST";
		        else if(s.equals("WEST"))
		        s = "NORTH";
		    }
		    System.out.println(s);
		}
		
		
		// your code goes here
	}
}
