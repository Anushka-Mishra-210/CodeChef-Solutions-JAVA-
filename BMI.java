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
		    int M = sc.nextInt();
		    int H = sc.nextInt();
		   /* Category 1: Underweight if BMI ≤18
Category 2: Normal weight if BMI ∈{19, 20,…, 24}
Category 3: Overweight if BMI ∈{25, 26,…, 29}
Category 4: Obesity if BMI ≥30 */
		   
		    int BMI = M/(H*H);
		    if(BMI<=18)
		    System.out.println("1");
		    else if(BMI >=19 && BMI<=24)
		    System.out.println("2");
		    else if(BMI>=25 && BMI<=29)
		    System.out.println("3");
		    else 
		    System.out.println("4");
		}
		
		
		// your code goes here
	}
}
