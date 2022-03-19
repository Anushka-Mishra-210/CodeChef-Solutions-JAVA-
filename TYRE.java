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
	int t = sc.nextInt();
	
	if(t>=1 && t<=1000)
	{
	for(int i =1; i<=t;i++)
	{
	    int N= sc.nextInt();
	int M = sc.nextInt();
	    if((N>=0 && N<=100) && (M>=0 && M<=100))
	    {
	System.out.println(N*2+M*4);}}}
		// your code goes here
	}
}
