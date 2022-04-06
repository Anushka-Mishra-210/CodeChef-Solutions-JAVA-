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
		
	  for(int i = 1 ; i<=T ; i++){
		    int n = sc.nextInt();
		    int s[] = new int[n];
		    int d[] = new int[n];
		    for(int l=0 ; l<n ; l++){
		        s[l] = sc.nextInt();
		    }
		    for(int j = 0 ; j<n; j++){
		        d[j] = sc.nextInt();
		    }
		    int cnt = 0;
		    for(int k = 0 ; k<n ; k++){
		        if(s[k] == d[k])
		        cnt++;
		    }
		   System.out.println(cnt);
		}
}
}

/*
		    for (int i =1; i<=T; i++)
		    {
		        int N = sc.nextInt();
		      int S[] = new int[N];
		      int D[] = new int [N];
		      
		      for(int j =1; j<=N;j++)
		      {
		          int S[j] = sc.nextInt();
		      }
		      for(int k =1; k<=N;k++)
		      {
		          int D[k] = sc.nextInt();
		      }
		      int c =0;
		      for(int m =0; m<=N;m++)
		      {
		          if(S[m]==D[m])
		          c++;
		      }
		System.out.println(c);		// your code goes here
		    }*/