/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    	Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int a[]=new int[7];
		for(int z=0;z<t;z++){
		    int c1=0,c2=0;
		    for(int i=0;i<7;i++){
		        a[i]=in.nextInt();
		    }
		    for(int i=0;i<7;i++){
		        if(a[i]==1)
		            c1++;
		        else
		            c2++;
		    }
		    if(c1>c2)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	    
		/*Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int rc=0;
		int sun=0;
		for(int i =1;i<=T;i++)
		{
	        int A[] = new int[7];
	        for(int j=0; j<7;j++)
	       { A[j] = sc.nextInt();  }
	       
	       for(int k =0;k<7;k++)
	       {
	       if(A[k] == 1)
	       sun++;
	       else 
	       rc++;
	       }
	       if(sun>rc)
	       System.out.println("YES");
	       else
	       System.out.println("NO");
	}*/
		
		// your code goes here
	}
}
