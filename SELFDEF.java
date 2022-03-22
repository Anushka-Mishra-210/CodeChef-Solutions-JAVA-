/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{

     Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int c=0;
            int N=sc.nextInt();
            int[] A=new int[N];
            for(int j=0;j<N;j+=1){
                A[j]=sc.nextInt();
                if(A[j]>=10 && A[j]<=60){
                    c+=1;
                }
            }
        System.out.println(c);
        }
		
	}
}
