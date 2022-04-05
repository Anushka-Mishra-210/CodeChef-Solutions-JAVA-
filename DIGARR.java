/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int x=sc.nextInt();
		    String s=sc.next();
		    int c=0;
		    for(int i=0;i<x;i++)
		    {
		        if((s.charAt(i)=='5') || (s.charAt(i)=='0'))
		        {
		        c=1;
		        break;
		        }
		    }
		    if(c==1)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    t--;
		}
	}
}


//ANOTHER APPROACH
/*import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		if(T>=0 && T<=1000)
		{
		    for(int j =1; j<=T; j++)
		   { int D = sc.nextInt();
		    String N =sc.next();
		    int c=0;
		    for(int i=1;i<=D;i++)
		    {
		        if((N.charAt(i)=='5') || (N.charAt(i)=='0'))
		        {
		        c=1;
		        }
		    }
		    if(c==1)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
		}
	}
}*/
